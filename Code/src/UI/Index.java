package UI;

import Dao.MyTable;
import Dao.SelectDao;
import Dao.UpdateDao;
import Dao.UpdatePassDao;
import service.Look;
import service.MyMessage;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.sql.*;

public class Index extends JFrame {
    String temp = "甘肃";//查询选项
    String temp1 = "男";//查询选项
    String sex = "男";//添加选项
    String type = "朋友";//添加选项


    public Index(String name) {
//        首页窗口主体
        JFrame ij = new JFrame("个人通讯录");
        ij.setResizable(false);
        ij.setLayout(null);
        ij.setLayout(new BorderLayout());
        JButton b1 = new JButton("显示");
        b1.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
        JButton b2 = new JButton("增加");
        b2.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
        JButton b3 = new JButton("删除");
        b3.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
        JButton b4 = new JButton("查询");
        b4.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
        JButton b5 = new JButton("备份");
        b5.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
        JButton b6 = new JButton("修改密码");
        b6.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
//        复杂容器，使用网格式布局
        JPanel p = new JPanel(new GridLayout(6, 1));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b6);
        p.add(b5);

//        窗口主题使用边框式布局，添加复杂容器，将复杂容器置于窗口左边
        ij.add(p, BorderLayout.WEST);

//        修改密码容器
        JPanel up = new JPanel();
        up.setLayout(null);

//        查询容器
        JPanel cp = new JPanel();
        cp.setLayout(null);

//        显示容器显示本用户所有联系人，及一个占位容器（占位容器隐藏）
        JScrollPane pan = Look.look(name);
        pan.setBounds(135, 0, 660, 300);
        JScrollPane pan2 = new JScrollPane();
        pan2.setBounds(135, 300, 660, 300);
        pan2.setBackground(new Color(0,0,0,0));
        ij.add(pan).setVisible(true);
        ij.add(pan2).setVisible(false);

//        删除容器
        JPanel dp = new JPanel();

//        增加容器
        JPanel zp = new JPanel();
        zp.setLayout(null);
//        查询显示容器
        JScrollPane ce = new JScrollPane();

//        显示按钮监听
        b1.addActionListener(e -> {
//            通过移除复杂容器后窗体的重新布局来实现页面的刷新
            ij.remove(ce);//ce为查询后显示的表格
            ij.remove(cp);
            ij.remove(dp);
            ij.remove(zp);
            ij.remove(up);
            ij.revalidate();
//            在Java中，JFrame.revalidate()方法是用于重新验证窗口组件的方法。
//            当添加或删除组件或更改窗口大小时，窗口可能会变得无效。在这种情况下，
//            可以使用revalidate()方法来重新验证窗口，以确保它正确地显示和布局。
            ij.repaint();
//            是一个Java方法，用于重新绘制窗口的外观。
//            当更改了窗口的组件或布局时，可能需要调用此方法以更新窗口的显示。
            ij.setLayout(null);
            ij.add(pan);
        });


//        增加按钮监听
        b2.addActionListener(e -> {
//            移除之前添加容器zp的所有布局，为这一次布局清空障碍
//            若无此句，则面板上的同一位置会出现若干此容器，个数为点击添加按钮的次数
            zp.removeAll();
            ij.remove(ce);
            ij.remove(dp);
            ij.remove(up);
            ij.remove(cp);
//            ij.remove(zp);
            ij.revalidate();
            ij.repaint();
            zp.setLayout(null);
            pan.setBounds(135,0,660,300);
            ij.add(pan);
            zp.setBounds(135, 300, 660, 300);
            JLabel l1 = new JLabel("姓名：");
            JLabel l2 = new JLabel("电话：");
            JLabel l3 = new JLabel("性别：");
            JLabel l4 = new JLabel("邮箱：");
            JLabel l5 = new JLabel("类型：");
            JLabel l6 = new JLabel("住址：");
            JTextField t1 = new JTextField();
            JTextField t2 = new JTextField();
            JTextField t4 = new JTextField();
            JTextField t6 = new JTextField();
            String[] sexx = {"男", "女"};
//            下拉选择列表
            JComboBox<String> comboBox2 = new JComboBox<>(sexx);
            comboBox2.addActionListener(ee -> {
                JComboBox<String> comboBox1 = (JComboBox<String>) ee.getSource();
                sex = (String) comboBox1.getSelectedItem();
            });
            String[] typee = {"朋友", "家人", "同事", "好友"};
            JComboBox<String> comboBox = new JComboBox<>(typee);
            comboBox.addActionListener(ee -> {
                JComboBox<String> comboBox1 = (JComboBox<String>) ee.getSource();
                type = (String) comboBox1.getSelectedItem();
            });

            l1.setFont(new Font("楷体", Font.BOLD, 24));
            l2.setFont(new Font("楷体", Font.BOLD, 24));
            l3.setFont(new Font("楷体", Font.BOLD, 24));
            l4.setFont(new Font("楷体", Font.BOLD, 24));
            l5.setFont(new Font("楷体", Font.BOLD, 24));
            l6.setFont(new Font("楷体", Font.BOLD, 24));
            t1.setFont(new Font("楷体", Font.BOLD, 24));
            t2.setFont(new Font("楷体", Font.BOLD, 24));
            comboBox2.setFont(new Font("楷体", Font.BOLD, 24));
            t4.setFont(new Font("楷体", Font.BOLD, 24));
            comboBox.setFont(new Font("楷体", Font.BOLD, 24));
            t6.setFont(new Font("楷体", Font.BOLD, 24));

            l1.setBounds(10, 10, 100, 40);
            t1.setBounds(100, 10, 160, 40);
            l2.setBounds(330, 10, 100, 40);
            t2.setBounds(420, 10, 160, 40);

            l3.setBounds(10, 60, 100, 40);
            comboBox2.setBounds(100, 60, 160, 40);
            l4.setBounds(330, 60, 100, 40);
            t4.setBounds(420, 60, 160, 40);

            l5.setBounds(10, 110, 100, 40);
            comboBox.setBounds(100, 110, 160, 40);
            l6.setBounds(330, 110, 100, 40);
            t6.setBounds(420, 110, 160, 40);

            zp.add(l1);
            zp.add(t1);
            zp.add(l2);
            zp.add(t2);

            zp.add(l3);
            zp.add(comboBox2);
            zp.add(l4);
            zp.add(t4);

            zp.add(l5);
            zp.add(comboBox);
            zp.add(l6);
            zp.add(t6);

            JButton bt1 = new JButton("保存");
            JButton bt2 = new JButton("清空");

            bt1.setFont(new Font("楷体", Font.BOLD, 24));
            bt2.setFont(new Font("楷体", Font.BOLD, 24));
            bt1.setBounds(170, 170, 100, 40);
            bt2.setBounds(370, 170, 100, 40);

            zp.add(bt1);
            zp.add(bt2);

            bt2.addActionListener(e1 -> {
                t1.setText("");
                t2.setText("");
                sex = "男";
                t4.setText("");
                type = "朋友";
                t6.setText("");
            });
            bt1.addActionListener(e1 -> {
                if (t1.getText().equals("") && t2.getText().equals("") && t4.getText().equals("") && t6.getText().equals("")) {
                    new MyMessage("内容不能为空");
                } else {
                    String sql = "insert into contacts values('" + t1.getText() + "','" + t2.getText() + "','" + sex + "','" + t4.getText() + "','" + type + "','" + t6.getText() + "','" + name + "')";
                    int flag = UpdateDao.upData(sql);
                    if (flag > 0) {
                        new MyMessage("保存成功");
//                        添加联系人成功之后，通过移除之前的显示容器，重新创建一个显示容器，
//                        依次来实现添加之后的的实时刷新，显示与上方面板
                        t1.setText("");
                        t2.setText("");
                        sex = "男";
                        t4.setText("");
                        type = "朋友";
                        t6.setText("");
                        pan.removeAll();
                        ij.revalidate();
                        ij.repaint();
                        JScrollPane pane = Look.look(name);
                        pan.add(pane);
                        pan.setLayout(null);
                        pane.setBounds(0, 0, 660, 300);
                        pan.setBounds(135, 0, 660, 300);
                        ij.add(pan);
                        zp.setBounds(135, 300, 660, 300);
                        ij.add(zp);

                    } else {
                        new MyMessage("保存失败");
                    }
                }
            });

            ij.add(zp).setVisible(true);
        });

//        删除按钮监听
        b3.addActionListener(e -> {
            dp.removeAll();
            ij.remove(zp);
            ij.remove(cp);
            ij.remove(ce);
            ij.remove(up);
            ij.revalidate();
            ij.repaint();
            dp.setLayout(null);
            pan.setBounds(135,0,660,300);
            ij.add(pan);
            dp.setBounds(135, 300, 660, 300);
            JLabel lb1 = new JLabel("请输入要删除联系人的姓名：");
            lb1.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
            JTextField t = new JTextField();
            t.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
            JButton b = new JButton("确认删除");
            b.setFont(new Font("楷体", Font.CENTER_BASELINE, 24));
            lb1.setBounds(180, 40, 280, 40);
            t.setBounds(180, 100, 280, 40);
            b.setBounds(245, 160, 160, 40);
            dp.add(lb1);
            dp.add(t);
            dp.add(b);
            ij.add(dp);

            b.addActionListener(ee -> {
                String username = t.getText();
                String sql = "delete from contacts where 姓名='" + username + "' and who='" + name + "'";
                int flag = UpdateDao.upData(sql);
                if (flag > 0) {
                    new MyMessage("删除成功！");
//                    删除功能，同添加功能一致，通过移除重新创建的方式实现数据显示的实时刷新
                    pan.removeAll();
                    ij.revalidate();
                    ij.repaint();
                    JScrollPane pane = Look.look(name);
                    pan.setLayout(null);
                    pane.setBounds(0, 0, 660, 300);
                    pan.add(pane);
                    pan.setBounds(135, 0, 660, 300);
                    ij.add(pan);
                    dp.setBounds(135, 300, 660, 300);
                    ij.add(dp);
                } else {
                    new MyMessage("删除失败，查无此人！");
                }
                t.setText("");
            });

        });

        ij.setSize(800, 600);
        ij.setLocationRelativeTo(null);
        ij.setVisible(true);
        ij.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        查询按钮监听
        b4.addActionListener(e -> {
            cp.removeAll();
            ij.remove(up);
            ij.remove(ce);
            ij.remove(zp);
            ij.remove(dp);
            ij.revalidate();
            ij.repaint();

            String[] typee = {"朋友", "家人", "同事", "好友"};
            JComboBox<String> comboBo = new JComboBox<>(typee);
            comboBo.addActionListener(ee -> {
                JComboBox<String> comboBox1 = (JComboBox<String>) ee.getSource();
                type = (String) comboBox1.getSelectedItem();
            });

            String[] shen = {"甘肃", "新疆", "西藏", "山西", "陕西", "河北", "河南", "四川", "云南", "广西", "安徽", "宁夏", "内蒙古", "黑龙江", "吉林", "辽宁省", "北京", "天津", "安徽", "江西", "浙江", "福建", "重庆", "上海", "台湾", "海南", "香港", "澳门", "广东", "山东", "湖南", "湖北"};
            String[] sex = {"男", "女"};
            JComboBox<String> comboBox = new JComboBox<>(shen);


            comboBox.addActionListener(ee -> {
                JComboBox<String> comboBox1 = (JComboBox<String>) ee.getSource();
                temp = (String) comboBox1.getSelectedItem();
            });

            JComboBox<String> comboBox2 = new JComboBox<>(sex);
            comboBox2.addActionListener(ee -> {
                JComboBox<String> comboBox1 = (JComboBox<String>) ee.getSource();
                temp1 = (String) comboBox1.getSelectedItem();
            });

            JLabel p1 = new JLabel("选择省份：");
            JLabel p2 = new JLabel("选择性别：");
            JLabel p3 = new JLabel("输入姓名关键字：");
            JLabel pp4 = new JLabel("请输入分组类别：");
            JTextField t1 = new JTextField();
            JButton button = new JButton("查询");
            p1.setFont(new Font("楷体", Font.BOLD, 24));
            p2.setFont(new Font("楷体", Font.BOLD, 24));
            p3.setFont(new Font("楷体", Font.BOLD, 24));
            pp4.setFont(new Font("楷体", Font.BOLD, 24));
            t1.setFont(new Font("楷体", Font.BOLD, 24));
            comboBo.setFont(new Font("楷体", Font.BOLD, 24));
            button.setFont(new Font("楷体", Font.BOLD, 24));
            comboBox.setFont(new Font("楷体", Font.BOLD, 24));
            comboBox2.setFont(new Font("楷体", Font.BOLD, 24));

            p1.setBounds(10, 50, 160, 30);
            comboBox.setBounds(140, 50, 150, 30);
            p2.setBounds(320, 50, 160, 30);
            comboBox2.setBounds(450, 50, 150, 30);
            p3.setBounds(10, 100, 200, 30);
            t1.setBounds(215, 100, 75, 30);
            pp4.setBounds(320, 100, 200, 30);
            comboBo.setBounds(520, 100, 80, 30);
            button.setBounds(250, 150, 100, 30);

            cp.add(p1);
            cp.add(comboBox);
            cp.add(p2);
            cp.add(comboBox2);
            cp.add(p3);
            cp.add(t1);
            cp.add(pp4);
            cp.add(comboBo);
            cp.add(button);

            button.addActionListener(ee -> {
                String sql = "select * from contacts where 姓名 like '%" + t1.getText() + "%' and who='" + name + "' and 住址 like '%" + temp + "%' and 类型='" + type + "' and 性别='" + temp1 + "'";
                ResultSet rs = SelectDao.look(sql);
                try {
                    if (rs.next()) {
//                        查询成功之后先要移除显示容器及其内容，之后创建一个新的容器展示查询到的数据
                        ce.removeAll();
                        temp1 = "男";
                        temp = "甘肃";
                        t1.setText("");
                        type = "朋友";
                        JScrollPane ces = MyTable.MyTable(name, sql);
                        ce.add(ces);
                        ce.setLayout(null);
                        ces.setBounds(0, 0, 660, 300);
                        ij.remove(pan);
                        ij.revalidate();
                        ij.repaint();
                        ce.setBounds(135, 0, 660, 300);
                        ij.add(ce);
                    } else {
                        new MyMessage("查询失败，查无此人！");
                        temp1 = "男";
                        temp = "甘肃";
                        t1.setText("");
                        type = "朋友";
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            });

            ij.setLayout(null);
            pan.setBounds(135,0,660,300);
            ij.add(pan);
            cp.setBounds(135, 300, 660, 300);
            ij.add(cp).setVisible(true);
        });

//        修改密码按钮监听
        b6.addActionListener(e -> {
            up.removeAll();
            ij.remove(zp);
            ij.remove(dp);
            ij.remove(cp);
            ij.revalidate();
            ij.repaint();
            JLabel l1 = new JLabel("密保问题：");
            l1.setFont(new Font("楷体", Font.BOLD, 24));
            JLabel l2 = new JLabel("密保答案：");
            l2.setFont(new Font("楷体", Font.BOLD, 24));
            JLabel l3 = new JLabel("输入密码：");
            l3.setFont(new Font("楷体", Font.BOLD, 24));
            JLabel l4 = new JLabel("确认密码：");
            l4.setFont(new Font("楷体", Font.BOLD, 24));
            JLabel l5 = new JLabel("当前密码：");
            l5.setFont(new Font("楷体", Font.BOLD, 24));
            JLabel l6 = new JLabel();
            l6.setFont(new Font("楷体", Font.BOLD, 24));

            JTextField t1 = new JTextField();
            t1.setFont(new Font("楷体", Font.BOLD, 24));
            JPasswordField t2 = new JPasswordField();
            t2.setFont(new Font("楷体", Font.BOLD, 24));
            JPasswordField t3 = new JPasswordField();
            t3.setFont(new Font("楷体", Font.BOLD, 24));
            JPasswordField t4 = new JPasswordField();
            t4.setFont(new Font("楷体", Font.BOLD, 24));

            JButton bt1 = new JButton("修改");
            bt1.setFont(new Font("楷体", Font.BOLD, 24));
            JButton bt2 = new JButton("清空");
            bt2.setFont(new Font("楷体", Font.BOLD, 24));

            ij.setLayout(null);
            up.setLayout(null);
            up.setBounds(135, 300, 660, 300);

            l1.setBounds(10, 30, 160, 30);
            l6.setBounds(135, 30, 500, 30);


            l2.setBounds(10, 70, 160, 30);
            t1.setBounds(135, 70, 160, 30);
            l5.setBounds(330, 70, 160, 30);
            t4.setBounds(460, 70, 160, 30);

            l3.setBounds(10, 110, 160, 30);
            t2.setBounds(135, 110, 160, 30);
            l4.setBounds(330, 110, 160, 30);
            t3.setBounds(460, 110, 160, 30);

            bt1.setBounds(170, 170, 100, 40);
            bt2.setBounds(370, 170, 100, 40);

            t2.setEchoChar('*');
            t3.setEchoChar('*');
            t4.setEchoChar('*');

            up.add(l1);
            up.add(l2);
            up.add(l3);
            up.add(l4);
            up.add(l5);
            up.add(l6);

            up.add(t1);
            up.add(t2);
            up.add(t3);
            up.add(t4);

            up.add(bt1);
            up.add(bt2);

            ResultSet rs = null;
            try {
                rs = UpdatePassDao.getUser(name);
                rs.next();
                l6.setText(rs.getString("question"));
            } catch (Exception exception) {
                exception.printStackTrace();
            } finally {
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }


            ij.add(up);


            bt1.addActionListener(e1 -> {
                ResultSet finalRs = null;
                try {
                    finalRs = UpdatePassDao.getUser(name);
                    finalRs.next();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
                String daan = t1.getText();
                String older = new String(t4.getPassword());
                String newpass = new String(t3.getPassword());
                String agin = new String(t2.getPassword());
                if (newpass.equals(agin)) {
                    try {
                        if (finalRs.getString("daan").equals(daan)) {
                            if (finalRs.getString("password").equals(older)) {
                                String sql = "update user set password='" + newpass + "' where username='" + name + "'";
                                UpdateDao.upData(sql);
                                new MyMessage("修改成功");
                                ij.dispose();
                                new Login();
                            } else {
                                new MyMessage("当前密码错误");
                            }
                        } else {
                            new MyMessage("密保答案错误");
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    } finally {
                        try {
                            finalRs.close();
                        } catch (SQLException throwables) {
                            throwables.printStackTrace();
                        }
                    }
                } else {
                    new MyMessage("两次输入密码不一致");
                    t3.setText("");
                    t2.setText("");
                }
            });

            bt2.addActionListener(e1 -> {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
            });

        });

//        备份按钮监听
//        备份使用io流实现
        b5.addActionListener(e -> {
            String sql = "select 姓名,电话,性别,邮箱,类型,住址 from contacts where who='" + name + "'";
            ResultSet rs = SelectDao.look(sql);
            try {
                FileWriter w = new FileWriter(name + "text.bak");
                w.write("姓名\t\t\t\t\t电话\t\t\t性别\t\t\t邮箱\t\t\t类型\t\t\t住址\n");
                while (rs.next()) {
                    w.write(rs.getString("姓名") + "\t\t\t");
                    w.write(rs.getString("电话") + "\t\t\t");
                    w.write(rs.getString("性别") + "\t\t\t");
                    w.write(rs.getString("邮箱") + "\t\t\t");
                    w.write(rs.getString("类型") + "\t\t\t");
                    w.write(rs.getString("住址") + "\n");
                }
                w.close();
                if (new File(name + "text.bak").isFile()) {
                    new MyMessage("账号 " + name + " 通讯录信息备份成功！");
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        });
    }
}
