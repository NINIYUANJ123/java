package com.imooc.aspect;

import javax.swing.*;
import java.awt.*;

public class Test1 {
    public static void main(String[] args) {
        JTextField textField = new JTextField(20);
        textField.setForeground(Color.black);
        textField.setFont(new Font("宋体",Font.CENTER_BASELINE,100));
        JFrame jFrame = new JFrame("题目1");
        jFrame.setSize(1800,800);
        jFrame.getContentPane().setBackground(Color.white);
        jFrame.setLayout(new FlowLayout(FlowLayout.CENTER,100,100));
        JPanel jPanel = new JPanel();
        jPanel.setSize(100,100);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));
        jPanel.setBackground(Color.pink);
        jPanel.add(new JLabel("yjw"));
        jPanel.add(textField).setBackground(Color.lightGray);
        JButton button = new JButton("确定");
        button.setBackground(Color.green);
        jPanel.add(button);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
