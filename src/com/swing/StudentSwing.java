package com.swing;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author THANH
 */
public class StudentSwing {
    
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Student");
        myFrame.setSize(900,600);
        myFrame.setLocationRelativeTo(null);
        myFrame.setVisible(true);
        myFrame.setLayout(null);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel myPanel = new JPanel();
        myPanel.setLayout(null);
        myPanel.setBounds(30, 30, 820, 520);
        myPanel.setBorder(BorderFactory.createBevelBorder(1));
        myFrame.add(myPanel);
        
        JLabel lblID = new JLabel("ID Student:");
        lblID.setBounds(20, 20, 100, 30);
        myPanel.add(lblID);
                
        JTextField txtID = new JTextField();
        txtID.setBounds(140, 20, 650, 30);
        myPanel.add(txtID);
        
        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(20, 60, 100, 30);
        myPanel.add(lblName);
        
        JTextField txtName = new JTextField();
        txtName.setBounds(140, 60, 650, 30);
        myPanel.add(txtName);
                
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 100,100 , 30);
        myPanel.add(lblEmail);
        
        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(140, 100, 650, 30);
        myPanel.add(txtEmail);
        
        JLabel lblNumPhone = new JLabel("Phone Number:");
        lblNumPhone.setBounds(20, 140, 100, 30);
        myPanel.add(lblNumPhone);
         
        JTextField txtNumPhone = new JTextField();
        txtNumPhone.setBounds(140, 140, 650, 30);
        myPanel.add(txtNumPhone);
        
        JLabel lblRollnumber = new JLabel("Roll Number:");
        lblRollnumber.setBounds(20, 180, 100, 30);
        myPanel.add(lblRollnumber);
        
        JTextField txtRollNumber = new JTextField();
        txtRollNumber.setBounds(140, 180, 650, 30);
        myPanel.add(txtRollNumber);
        
        JLabel lblClass = new JLabel("Class Name:");
        lblClass.setBounds(20, 220, 100, 30);
        myPanel.add(lblClass);
        
        JTextField txtClass = new JTextField();
        txtClass.setBounds(140, 220, 650, 30);
        myPanel.add(txtClass);
        
        
        
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(500, 400, 90, 30);
        myPanel.add(btnAdd);
       
        JButton btnEdit = new JButton("Edit");
        btnEdit.setBounds(610, 400, 90, 30);
        myPanel.add(btnEdit);
        
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(720, 400, 90, 30);
        myPanel.add(btnReset);
        
        
        
        
    }
    
}
