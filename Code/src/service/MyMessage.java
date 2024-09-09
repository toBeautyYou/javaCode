package service;

import javax.swing.*;

public class MyMessage {
//    弹窗消息提示类
    public MyMessage(String str){
        SwingUtilities.invokeLater(() -> {
            // 显示一个信息对话框
            JOptionPane.showMessageDialog(null, str, "提示", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
