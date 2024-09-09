package Dao;

import conn.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDao {
    //    用于更新操作的数据库操作方法
        public static int upData(String sql){
            int flag=0;
            Connection conn=null;
            PreparedStatement stm=null;
            try {
                conn = DataBase.getConn();
                stm=conn.prepareStatement(sql);
                flag=stm.executeUpdate();
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try {
                    assert conn != null;
                    conn.close();
                    assert stm != null;
                    stm.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return flag;
        }
}
