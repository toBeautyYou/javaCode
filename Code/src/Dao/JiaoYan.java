package Dao;


import conn.DataBase;

import java.sql.*;

public class JiaoYan {
//    用于用户登录校验的Dao层类
    public int Login(String name,String pwd){
        Connection conn = DataBase.getConn();
        int flag=0;
        try {
            PreparedStatement stm=conn.prepareStatement("select * from user where username=? and password=?");
            stm.setString(1,name);
            stm.setString(2,pwd);
            ResultSet rs=stm.executeQuery();
            if (rs.next()){
                flag=1;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return flag;
    }
}
