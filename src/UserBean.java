/**
 * Created by el1ven on 19/9/14.
 */
public class UserBean {//实体类user

    private String userType;//用户类型
    private String userName;//用户名
    private String userPassword;//用户密码
    private String userEmail;//用户邮箱


    //相应的get,set函数
    public void setUserType(String userType){this.userType = userType;}
    public String getUserType(){return this.userType;}

    public void setUserName(String userName){this.userName = userName;}
    public String getUserName(){return this.userName;}

    public void setUserPassword(String userPassword){this.userPassword = userPassword;}
    public String getUserPassword(){return this.userPassword;}

    public void setUserEmail(String userEmail){this.userEmail = userEmail;}
    public String getUserEmail(){return this.userEmail;}
}
