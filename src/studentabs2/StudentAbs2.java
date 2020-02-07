/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentabs2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author blnda
 */
public class StudentAbs2 implements ActionListener {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;

public static void main(String[] args) {
StudentAbs2 obj=new StudentAbs2();
// TODO code application logic here
}  

public StudentAbs2(){

JFrame fr=new JFrame("Students Absents");
     fr.setVisible(true);
     fr.setSize(1000,700);
     fr.setResizable(false);
     fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     JPanel panel=new JPanel();
     panel.setLayout(null);
    
     



//Drop down list
String[] choices = { "Male","Female"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    cb.setVisible(true);
    panel.add(cb);
    cb.setBounds(112,270,95,20);





//Buttons::::::::: 


btn1=new JButton("Insert");
     btn1.setBounds(15,560,95,26);
     panel.add(btn1);
btn1.addActionListener(this);
     //btn1.addActionListener(new Action()); 
     
     btn2=new JButton("Delete");
     btn2.setBounds(130,560,95,26);
     panel.add(btn2);
btn2.addActionListener(this);
    
btn3=new JButton("Update");
     btn3.setBounds(245,560,95,26);
     panel.add(btn3);
     btn3.addActionListener(this);
//btn3.addActionListener(new Action());

     btn4=new JButton("Search");
     btn4.setBounds(15,610,95,26);
     panel.add(btn4);
     btn4.addActionListener(this);
     
     btn5=new JButton("Close");
     btn5.setBounds(800,610,95,26);
     panel.add(btn5);
     btn5.addActionListener(this);
      
    //btn4.addActionListener(new Action()); 
     
 //Labels::::::::::    
     
     JLabel lbl1=new JLabel("(Students Absents List of Semester Four"
             + " For Science and Technology College)");
    lbl1.setBounds(305,10,450,13);
     panel.add(lbl1);
     
     JLabel lblno=new JLabel("No Absents in    :");
    lblno.setBounds(400,350,150,35);
     panel.add(lblno);
     
     
     
     JLabel lbl2=new JLabel("Student ID        :");
    lbl2.setBounds(15,50,150,35);
     panel.add(lbl2);
    
     JLabel lbl3=new JLabel("First Name       :");
    lbl3.setBounds(15,80,150,35);
     panel.add(lbl3);
    
     JLabel lbl4=new JLabel("Second Name :");
    lbl4.setBounds(15,110,150,35);
     panel.add(lbl4);
    
     JLabel lbl5=new JLabel("Third Name     :");
    lbl5.setBounds(15,140,150,35);
     panel.add(lbl5);
      
     JLabel lbl6=new JLabel("Department    :");
    lbl6.setBounds(15,190,150,35);
     panel.add(lbl6);
     
     JLabel lblsp1=new JLabel("Gender            :");
    lblsp1.setBounds(15,265,150,35);
     panel.add(lblsp1);
    
     
     JLabel lblsp=new JLabel("(Number Of Absenties For Each Lesson )  :");
    lblsp.setBounds(15,320,240,13);
     panel.add(lblsp);
     
     //Radio Buttons::::::::
    JRadioButton r1=new JRadioButton(" Information Technology");    
JRadioButton r2=new JRadioButton(" Computer Science");    
r1.setBounds(112,200,190,13);    
r2.setBounds(112,220,190,13);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
panel.add(r1);panel.add(r2);          


// FFFFFFFFFFFFFFFFF

//CheckBoxes::::::::::::::
 

JCheckBox checkbox1 = new JCheckBox("Matlab");    
        checkbox1.setBounds(510,360,100,13);    
        JCheckBox checkbox2 = new JCheckBox("JavaOOP");    
        checkbox2.setBounds(610,360,103,13);    
        panel.add(checkbox1); panel.add(checkbox2);
        
        JCheckBox checkbox3= new JCheckBox("Web Prog");    
        checkbox3.setBounds(710,360,100,13);    
        JCheckBox checkbox4 = new JCheckBox("My SQL");    
        checkbox4.setBounds(510,390,100,13);    
        panel.add(checkbox3); panel.add(checkbox4);
        
        
        JCheckBox checkbox5= new JCheckBox("Networking");    
        checkbox5.setBounds(610,390,100,13);    
        JCheckBox checkbox6 = new JCheckBox("Algorithm");    
        checkbox6.setBounds(710,390,110,13);    
        panel.add(checkbox5); panel.add(checkbox6);
        
                 
   
     
    
     JLabel lbl7=new JLabel("Matlab             :");
    lbl7.setBounds(15,350,150,35);
     panel.add(lbl7);
     
     JLabel lbl8=new JLabel("JavaOOP        :");
    lbl8.setBounds(15,380,150,35);
     panel.add(lbl8);
     
     JLabel lbl9=new JLabel("Web Prog       :");
    lbl9.setBounds(15,410,150,35);
     panel.add(lbl9);
     
     JLabel lbl10=new JLabel("My SQL           :");
    lbl10.setBounds(15,440,150,35);
     panel.add(lbl10);
     
     JLabel lbl11=new JLabel("Networking   :");
    lbl11.setBounds(15,470,150,35);
     panel.add(lbl11);
     
     JLabel lbl12=new JLabel("Algorithm      :");
    lbl12.setBounds(15,500,150,35);
     panel.add(lbl12);
     

//Text Fields::::::::
//Text Fields ::::::::
    JTextField txt2=new JTextField(100); 
    txt2.setBounds(112,56,250,25);
     panel.add(txt2);
     
     JTextField txt3=new JTextField(100); 
    txt3.setBounds(112,86,250,25);
     panel.add(txt3);
    
     JTextField txt4=new JTextField(100); 
    txt4.setBounds(112,116,250,25);
     panel.add(txt4);
     
     JTextField txt5=new JTextField(100); 
    txt5.setBounds(112,146,250,25);
     panel.add(txt5);
     
     /*JTextField txt6=new JTextField(100); 
    txt6.setBounds(107,176,250,25);
     panel.add(txt6);*/
     
     /**/
     
     /**/
     JTextField txt7=new JTextField(100); 
    txt7.setBounds(112,356,250,25);
     panel.add(txt7);
     
     JTextField txt8=new JTextField(100); 
    txt8.setBounds(112,386,250,25);
     panel.add(txt8);
     
     JTextField txt9=new JTextField(100); 
    txt9.setBounds(112,416,250,25);
     panel.add(txt9);
    
    JTextField txt10=new JTextField(100); 
    txt10.setBounds(112,446,250,25);
     panel.add(txt10);
     
     JTextField txt11=new JTextField(100); 
    txt11.setBounds(112,476,250,25);
     panel.add(txt11);
    
     JTextField txt12=new JTextField(100); 
    txt12.setBounds(112,506,250,25);
     panel.add(txt12);
     
     JTextField txtsrc=new JTextField(100); 
    txtsrc.setBounds(129,610,232,28);
     panel.add(txtsrc);
     
      fr.add(panel);
      fr.repaint();
     
             }

     public void actionPerformed(ActionEvent e){
         
         if(e.getSource() == btn1){
JOptionPane.showMessageDialog(null,"Record Inserted Successfully!");
// System.out.println("This is the delete button");
         }
         if(e.getSource() == btn2){
             JOptionPane.showMessageDialog(null,"Record Has been Deleted!");
         }
         if(e.getSource() == btn3){
             JOptionPane.showMessageDialog(null,"Record Updated Successfully!");
         }
         if(e.getSource() == btn4){
              JOptionPane.showMessageDialog(null,"Record Found Successfully!");
         }
         
          
         
//             JFrame fr2=new JFrame("Clicked");
//     fr2.setVisible(true);
//     fr2.setSize(200,200);
//     JLabel label=new JLabel("you Clicked me");
//     JPanel panel=new JPanel();
//     fr2.add(panel);
//     panel.add(label);
}}