package service;

import Dao.MyTable;

import javax.swing.*;

public class Look {
//    操作数据库的一个中间类
    public static JScrollPane look(String name){
        String sql = "select * from contacts where who="+name;
        return MyTable.MyTable(name,sql);
    }
}
