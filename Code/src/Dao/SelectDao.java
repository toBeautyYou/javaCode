package Dao;

import conn.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectDao {
    //    用于查询的数据库操作方法
    public static ResultSet look(String sql){
        ResultSet rs = null;
        Connection conn;
        Statement stm;
        try {
            conn= DataBase.getConn();
            stm=conn.createStatement();
            rs=stm.executeQuery(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
}
