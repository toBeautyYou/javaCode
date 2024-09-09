package UI;

import Dao.JiaoYan;
import service.MyMessage;

import javax.swing.*;
import java.awt.*;

public class LoginIn extends JFrame {
    public LoginIn(){
        JFrame lf = new JFrame("个人通讯录");
        lf.setLayout(null);
        JLabel lb1 = new JLabel("用户名：");
        JLabel lb2 = new JLabel("密  码：");
        JTextField tu = new JTextField();
        JPasswordField tp = new JPasswordField();
        tp.setEchoChar('*');
        JButton bt = new JButton("确认");

        lb1.setBounds(230,120,180,50);
        lb1.setFont(new Font("楷体",Font.BOLD,24));
        lb2.setBounds(230,180,180,50);
        lb2.setFont(new Font("楷体",Font.BOLD,24));
        tu.setBounds(350,120,180,50);
        tu.setFont(new Font("楷体",Font.BOLD,24));
        tp.setBounds(350,180,180,50);
        tp.setFont(new Font("楷体",Font.BOLD,24));
        lb1.setFont(new Font("楷体",Font.BOLD,24));
        bt.setBounds(310,280,150,50);
        bt.setFont(new Font("宋体",Font.BOLD,24));

        lf.add(lb1);
        lf.add(tu);
        lf.add(lb2);
        lf.add(tp);
        lf.add(bt);
        lf.setResizable(false);
        lf.setSize(800,600);
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);

        bt.addActionListener(e -> {
            String user = tu.getText();
            String pwd = new String(tp.getPassword());
            JiaoYan y = new JiaoYan();
            if(y.Login(user,pwd)==1){
                lf.dispose();
                new Index(user);
            }
            else {
                new MyMessage("账户或密码错误！");
            }
        });


    }

}
