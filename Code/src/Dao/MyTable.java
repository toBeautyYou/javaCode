package Dao;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;
import java.util.Vector;

public class MyTable extends JFrame {
//    用于将查询数据表格化显示的Dao层工具类
    public static JScrollPane MyTable(String name,String sql){
        DefaultTableModel dt = new DefaultTableModel();
        ResultSet rs= SelectDao.look(sql);
        try {
            ResultSetMetaData rsmd=rs.getMetaData();
//            控制表格列数
            int numColumn=rsmd.getColumnCount()-1;
            //设置表头
            dt.addColumn("姓名");
            dt.addColumn("电话");
            dt.addColumn("性别");
            dt.addColumn("邮箱");
            dt.addColumn("类型");
            dt.addColumn("住址");
//            循环给表的每一行填入数据
            while (rs.next()){
                Vector newRow = new Vector();
                for (int i=1;i<=numColumn;i++){
                    newRow.addElement(rs.getString(i));
                }
                dt.addRow(newRow);
            }
        }catch (Exception ee){
            ee.printStackTrace();
        }finally {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        JTable table=new JTable();
        table.setModel(dt);
        table.setRowHeight(20);
        table.setFont(new Font("宋体",Font.CENTER_BASELINE,18));

        return new JScrollPane(table);
    }
}
