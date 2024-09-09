package Dao;

import conn.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdatePassDao {
//    修改密码的Dao层类 获取密保问题及答案
    public static ResultSet getUser(String name) throws Exception{
        ResultSet rs=null;
        Connection conn = DataBase.getConn();
        String sql="select * from user where username=?";
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setString(1,name);
        rs=stm.executeQuery();
        return rs;
    }
}
