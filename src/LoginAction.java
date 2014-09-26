import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import java.sql.*;
/**
 * Created by el1ven on 18/9/14.
 */

public class LoginAction extends ActionSupport implements ModelDriven {

    private UserBean user;//用户对象属性
    private DBManager managerDB = new DBManager();

    public Object getModel(){//实现ModelDriven接口
        if(user == null){
            user = new UserBean();
        }
        return user;
    }

    public String execute() throws Exception{
        int result = managerDB.queryForLogin(user);
        if(result > 0){
            return "success";
        }else{
            return "fail";
        }
    }


}
