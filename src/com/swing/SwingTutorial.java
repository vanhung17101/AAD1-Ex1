/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author THANH
 */
public class SwingTutorial {
    public static void main(String[] args ){
        JFrame fromLogin = new JFrame("Login");
        fromLogin.setSize(500, 300);
        
        JPanel loginPanel = new JPanel();
        //loginPanel.setSize(400, 300);
        loginPanel.setBackground(Color.red);
        loginPanel.setBounds(10, 10, 400, 200);
        fromLogin.add(loginPanel);
        
        
       /* 
        JLabel lblAccount = new JLabel("Account: ");
        lblAccount.setBounds(140, 50, 100, 20);
        fromLogin.add(lblAccount);
        
        JTextField txtAcc = new JTextField();
        txtAcc.setBounds(230, 50, 100, 20);
        fromLogin.add(txtAcc);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(140, 80, 100, 20);
        fromLogin.add(lblPassword);
        
        JPasswordField pasPass = new JPasswordField();
        pasPass.setBounds(230, 80, 100, 20);
        fromLogin.add(pasPass);
        
        JButton bntLogin = new JButton("Đăng nhập");
        bntLogin.setBounds(140, 210, 100, 20);
        fromLogin.add(bntLogin);
        
        JButton bntSingin = new JButton("Đăng kí");
        bntSingin.setBounds(250, 210, 100, 20);
        fromLogin.add(bntSingin);
*/
        
        
        
        fromLogin.setLayout(null);
        fromLogin.setVisible(true);
        fromLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fromLogin.setLocationRelativeTo(null);
    }
    
}
