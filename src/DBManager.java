import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by el1ven on 25/9/14.
 */
import java.sql.*;
import java.lang.reflect.*;
import java.util.*;
import java.io.*;
public class DBManager {

    private SimpleConnectionPool connPool = new SimpleConnectionPool();
    private PreparedStatement pstat = null;
    private Connection conn = connPool.getConnection();

    public DBManager(){
        connPool.createPool(20);
    }

    public int queryForLogin(UserBean user) throws Exception{
        String sql = "select * from User where name=? and password=?";
        pstat= conn.prepareStatement(sql);
        pstat.setString(1,user.getUserName());
        pstat.setString(2,user.getUserPassword());
        ResultSet rs = pstat.executeQuery();
        if(rs.next()){//登录成功
            return 1;
        }else{//登录失败，没有这个用户名，重新注册
            connPool.pushConnectionBackToPool(conn);
            return -1;
        }
    }

    public int queryForRegister(UserBean user)throws Exception{

        String sql1 = "select * from User where name=?";
        pstat = conn.prepareStatement(sql1);
        pstat.setString(1, user.getUserName());
        ResultSet rs = pstat.executeQuery();
        if(rs.next()){//用户名已经重复，注册失败
            connPool.pushConnectionBackToPool(conn);
            return -1;
        }else{//用户名没有重复继续注册
            String sql2 = "insert into User(name,password,email,type)values(?,?,?,?)";
            pstat = conn.prepareStatement(sql2);
            pstat.setString(1,user.getUserName());
            pstat.setString(2,user.getUserPassword());
            pstat.setString(3,user.getUserEmail());
            pstat.setString(4,user.getUserType());
            pstat.executeUpdate();
            return 1;
        }
    }





}
