package UI;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    private JButton btn1;//登录
    private JButton btn2;//注册
    public Login(){
        JFrame j = new JFrame("个人通讯录");
        j.setLayout(new GridLayout(1,1));
        j.setSize(800,600);
        j.setResizable(false);
        btn1 = new JButton("登录");
        btn2 = new JButton("注册");
        JPanel p1 =new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                ImageIcon img = new ImageIcon("static/log.jpg");
                g.drawImage(img.getImage(),0,0,800,600,this);
            }
        };
        p1.setLayout(null);
        p1.add(btn1);
        p1.add(btn2);
        btn1.setBounds(100,450,100,40);
        btn1.setFont(new Font("宋体",Font.BOLD,24));
        btn1.setBackground(new Color(22,120,120));
        btn1.setBorderPainted(false);

        btn2.setBounds(240,450,100,40);
        btn2.setFont(new Font("宋体",Font.BOLD,24));
        btn2.setBackground(new Color(22,120,120));
        btn2.setBorderPainted(false);

        j.add(p1,BorderLayout.CENTER);


        j.setLocationRelativeTo(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn1.addActionListener(e -> {
            new LoginIn();

        });
        btn2.addActionListener(e -> {
            j.dispose();
            new Reg();
        });

    }

    public static void main(String[] args) {
        new Login();
    }
}
