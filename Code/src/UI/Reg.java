package UI;

import Dao.UpdateDao;
import service.UserGet;
import service.MyMessage;

import javax.swing.*;
import java.awt.*;

public class Reg extends JFrame {
    public Reg(){
        JFrame rf = new JFrame("个人通讯录");
        rf.setLayout(null);
        rf.setResizable(false);
        JLabel lb1=new JLabel("您的账号是：");
        lb1.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JLabel lb2=new JLabel("请设置密码：");
        lb2.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JTextField t1= new JTextField();
        t1.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JPasswordField t2=new JPasswordField();
        t2.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JLabel lb3 = new JLabel("设密保问题：");
        lb3.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JTextField t3=new JTextField();
        t3.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JLabel lb4=new JLabel("密保的答案：");
        lb4.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JTextField t4=new JTextField();
        t4.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JButton btn = new JButton("确认");
        btn.setFont(new Font("楷体",Font.CENTER_BASELINE,24));
        JButton btn1 = new JButton("清空");
        btn1.setFont(new Font("楷体",Font.CENTER_BASELINE,24));

        rf.setSize(800,600);
        t2.setEchoChar('*');
        lb1.setBounds(190,100,160,40);
        t1.setBounds(370,100,200,40);
        lb2.setBounds(190,150,160,40);
        t2.setBounds(370,150,200,40);
        lb3.setBounds(190,200,160,40);
        t3.setBounds(370,200,200,40);
        lb4.setBounds(190,250,160,40);
        t4.setBounds(370,250,200,40);
        btn.setBounds(245,300,100,40);
        btn1.setBounds(415,300,100,40);

        rf.add(lb1);
        rf.add(t1);
        rf.add(lb2);
        rf.add(t2);
        rf.add(lb3);
        rf.add(t3);
        rf.add(lb4);
        rf.add(t4);
        rf.add(btn);
        rf.add(btn1);

        rf.setLocationRelativeTo(null);
        rf.setVisible(true);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String temp=UserGet.temp();
        t1.setText(temp);
        btn1.addActionListener(e -> {
            t2.setText("");
            t3.setText("");
            t4.setText("");
        });
        btn.addActionListener(e -> {
            String pwd = new String(t2.getPassword());
            String who = t3.getText();
            String it = t4.getText();

            String sql="insert into user values('"+temp+"','"+pwd+"','"+who+"','"+it+"')";
            if(UpdateDao.upData(sql)>0){
                new MyMessage("创建账户成功！您的账号为 "+temp+" 请牢记！");
                rf.dispose();
                new LoginIn();
            }else {
                new MyMessage("创建账户失败！");
            }
        });
    }

}
