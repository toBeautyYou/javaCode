package service;

import Dao.SelectDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class UserGet {
//    创建用户的工具类，用户名是不同的随机生成的，此类就是一个随机生成用户名及查重的类，用户名以2024开头
    public static String temp(){
        String sql = "select username from user";
        ResultSet rs = SelectDao.look(sql);
        Random rand = new Random();
        int num1 = rand.nextInt(10000)+202400000;
        String num=Integer.toString(num1);
        int flag=0;
        try {
            while (rs.next()){
                if (num.equals(rs.getString("username"))){
                    flag+=1;
                    break;
                }
            }
            if (flag>0){
                temp();
            }else {
                return num;
            }
        }catch (Exception e1){
            e1.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return "";
    }
}
