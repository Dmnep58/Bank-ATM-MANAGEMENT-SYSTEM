package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;

public class Singup3 extends JFrame implements ActionListener {
	//all the necessary parts of the frame declared
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
	JRadioButton r1,r2,r3,r4;
	JButton b1,b2;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
//	JTextField t1;
	String  formno;
	
	//constructor created to initialize
	Singup3(String formno){
	    this.formno = formno;
		setTitle("NEW ACCOUNT APPLICATION FORM-Page3");
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/AsimulatorSystem/images/s.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		l12 = new JLabel(i3);
		l12.setBounds(150,0,100,100);
		add(l12);
		//styling the labels.
		
		l1=new JLabel("Page 3 : Account Details");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		
		l2 = new JLabel("Account Type:");
		l2.setFont(new Font("Raleway",Font.BOLD,18));
		
		l3 =new JLabel("Card Number:");
		l3.setFont(new Font("Raleway",Font.BOLD,18));
		
		l4= new JLabel("xxxx-xxxx-xxxx-1234");
		l4.setFont(new Font("Raleway",Font.BOLD,18));
		
		l5 = new JLabel("(Your 16 digit card Number)");
		l5.setFont(new Font("Raleway",Font.BOLD,12));
		
		l6 = new JLabel("It will apper on ATM card/cheque Book and Statements:");
		l6.setFont(new Font("Raleway",Font.BOLD,12));
		
		l7 = new JLabel("PIN:");
		l7.setFont(new Font("Raleway",Font.BOLD,18));
		
		l8 = new JLabel("xxxx");
		l8.setFont(new Font("Raleway",Font.BOLD,18));
		
		l9 = new JLabel("(4-digit Password)");
		l9.setFont(new Font("Raleway",Font.BOLD,12));
		
		l10= new JLabel("Services Required:");
		l10.setFont(new Font("Raleway",Font.BOLD,18));
		
		l11= new JLabel("formno");
		l11.setFont(new Font("Raleway",Font.BOLD,14));
		
		//styling the buttons
		b1 = new JButton("Submit");
		b1.setFont(new Font("Raleway",Font.BOLD,14));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("Cancel");
		b2.setFont(new Font("Raleway",Font.BOLD,14));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		
		// checkbox styling
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.lightGray);
		c1.setFont(new Font("Raleway",Font.BOLD,16));
		
		c2 = new JCheckBox("INTERNET BANKING");
		c2.setBackground(Color.lightGray);
		c2.setFont(new Font("Raleway",Font.BOLD,16));
		
		c3 = new JCheckBox("MOBILE BANKING");
		c3.setBackground(Color.lightGray);
		c3.setFont(new Font("Raleway",Font.BOLD,16));
		
		c4 = new JCheckBox("EMAIL ALERTS");
		c4.setBackground(Color.lightGray);
		c4.setFont(new Font("Raleway",Font.BOLD,16));
		
		c5 = new JCheckBox("CHEQUE BOOK");
		c5.setBackground(Color.lightGray);
		c5.setFont(new Font("Raleway",Font.BOLD,16));
		
		c6 = new JCheckBox("I hereby declaresthat the above details correct to the best of my knowledge.",true);
		c6.setBackground(Color.lightGray);
		c6.setFont(new Font("Raleway",Font.BOLD,12));
		
		c7 = new JCheckBox("SAVING ACCOUNT");
		c7.setBackground(Color.lightGray);
		c7.setFont(new Font("Raleway",Font.BOLD,16));
		
		//radio button styling
		
		r1 = new JRadioButton("SAVING ACCOUNT");
		r1.setBackground(Color.lightGray);
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		
		r2 = new JRadioButton("FIXED DEPOSIT ACCOUNT");
		r2.setBackground(Color.lightGray);
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		
		r3 = new JRadioButton("CURRENT ACCOUNT");
		r3.setBackground(Color.lightGray);
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		
		r4 = new JRadioButton("RECURRING DEPOSIT ACCOUNT");
		r4.setBackground(Color.lightGray);
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		
		ButtonGroup groupaccount = new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		
		//TEXT-FIELD STYLING
		
		l13 = new JLabel(formno);
		l13.setFont(new Font("Raleway",Font.BOLD,12));
		
		
		setLayout(null);
		
		// creating the bounds.
		
		l11.setBounds(700,10,70,30);
		add(l11);
		
		l13.setBounds(770,10,40,30);
		add(l13);
		
		l1.setBounds(280,50,440,30);
		add(l1);
		
		l2.setBounds(100,110,200,30);
		add(l2);
		
		r1.setBounds(100,150,200,30);
		add(r1);
		
		r2.setBounds(350,150,300,30);
		add(r2);
		
		r3.setBounds(100,180,250,30);
		add(r3);
		
		r4.setBounds(350,180,300,30);
		add(r4);
		
		l3.setBounds(100,250,200,30);
		add(l3);
		
		l4.setBounds(330,250,250,30);
		add(l4);
		
		l5.setBounds(100,300,200,20);
		add(l5);
		
		l6.setBounds(330,300,500,30);
		add(l6);
		
		l7.setBounds(100,330,200,30);
		add(l7);
		
		l8.setBounds(330,330,200,30);
		add(l8);
		
		l9.setBounds(100,370,200,30);
		add(l9);
		
		l10.setBounds(100,400,200,30);
		add(l10);
		
		c1.setBounds(100,450,200,30);
		add(c1);
		
		c2.setBounds(350,450,200,30);
		add(c2);
		
		c3.setBounds(100,500,200,30);
		add(c3);
		
		c4.setBounds(350,500,200,30);
		add(c4);
		
		c5.setBounds(100,550,200,30);
		add(c5);
		
		c6.setBounds(100,580,600,30);
		add(c6);
		
		c7.setBounds(350,550,250,30);
		add(c7);
		
		b1.setBounds(300,620,100,30);
		add(b1);
		
		b2.setBounds(420,620,100,30);
		add(b2);
		
		//creating the panel and providing it the styles
		getContentPane().setBackground(Color.lightGray);
		setSize(850,850);
		setLocation(200,0);
		setVisible(true);
		
		
		//providing actions to the buttons
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	 
		 String atype = null;
		 if (r1.isSelected()){
			 atype="Saving Account";
		 }
		 else if (r2.isSelected()){
			 atype="Fixed Deposit Account";
		 }
		 else  if (r3.isSelected()){
			 atype="Current Account";
		 }
		 else if (r4.isSelected()){
			 atype="Recurring Deposit Account";
		 }
		
		Random ram = new Random();
		 long first7 = (ram.nextLong()%90000000L+3423452900000000L);
		 String cardno = ""+Math.abs(first7);
		 
		 long first3 = (ram.nextLong()%9000L+1000L);
		 String pin = ""+Math.abs(first3);
		 
		 String facility=" ";
		 if (c1.isSelected()){
			 facility = facility+"Atm Card";
		 }
		 
			 if (c2.isSelected()){
				 facility=facility+"Internet Banking";
			 }
			 if (c3.isSelected()){
				 facility=facility+"Mobile Banking";
			 }
			 if (c4.isSelected()){
				 facility=facility+"Email Alert";
			 }
			 if (c5.isSelected()){
				 facility=facility+"Cheque Book";
			 }
			 if (c6.isSelected()){
				 facility=facility+"E-statement";
			 }
			 
			 String c = l13.getText();
			 
			 try {
				 if (e.getSource()==b1){
					 if (facility.equals(" ")){
						 JOptionPane.showMessageDialog(null,"fill the required fields");
					 }
					 else {
						 conn c1 = new conn();
						 String q1="insert into singup3 values('"+atype+"','"+cardno+"','"+pin+"','"+facility+"'"+c+"')";
						 String q2="insert into login values('"+cardno+"','"+pin+"')";
						 
						 c1.s.executeQuery(q1);
						c1.s.executeQuery(q2);
						
						JOptionPane.showMessageDialog(null,"Card number"+cardno+"\n"+pin);
						
						new Deposit(pin).setVisible(true);
						setVisible(false);
					 }
				 }
				 else if (e.getSource()==b2){
					 System.exit(0);
				 }
			 } catch (SQLException ex) {
				 ex.printStackTrace();
			 }
		
		
	}
	
	public static void main(String[] args) {
		Singup3 s3 =new Singup3(" ");
		s3.setResizable(false);
		s3.setVisible(true);
	}
}
