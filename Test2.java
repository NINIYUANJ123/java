package com.imooc.aspect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        new LoginFrame();
    }
    public static class LoginFrame extends JFrame {
        JTextField txtname = new JTextField(20);
        JPasswordField txtpass = new JPasswordField(20);
        JButton bl=new JButton("登录");
        JButton bg=new JButton("关闭");
        public LoginFrame(){
            setBackground(Color.CYAN);
            setBounds(25,25,1000,1000);
            Container c = getContentPane();
            c.setLayout(new FlowLayout(FlowLayout.CENTER,20,50));
            c.add(new JLabel("用户名"));
            c.add(txtname).setBackground(Color.lightGray);
            c.add(new JLabel());
            c.add(new JLabel("密码"));
            c.add(txtpass).setBackground(Color.lightGray);
            c.add(bl);
            c.add(bg);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            bl.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    String name = txtname.getText();
                    String pass = txtpass.getText();
                    if(name.equals("袁佳伟") &&
                            pass.equals("123")){
                        System.out.println("恭喜你,登陆成功!");
                    }else{
                        System.out.println("抱歉,登录失败!");
                    }
                }
            });
            bg.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    dispose();
                }
            });
        }
    }
}
