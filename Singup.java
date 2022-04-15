package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b1;
	JComboBox c1,c2,c3;
	
	Random ram = new Random();
	long first4 = (ram.nextLong()%900L)+1000L;
	String first = " "+Math.abs(first4);
	
	//initialization of sing-in using constructors.
	Singup(){
		 setTitle("NEW ACCOUNT APPLICATION FORM");
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/AsimulatorSystem/images/s.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l11 = new JLabel(i3);
		l11.setBounds(16,0,100,100);
		add(l11);
		
		 // creating the labels and styling them.
		 l1 = new JLabel("APPLICATION FORM NO. "+first);
		 l1.setForeground(Color.red);
		 l1.setFont(new Font("Raleway",Font.BOLD,38));
		 
		 l2= new JLabel("Page 1: PERSONAL DETAILS");
		l2.setFont(new Font("Raleway",Font.BOLD,20));
		
		l3= new JLabel("Name:");
		l3.setFont(new Font("Raleway",Font.BOLD,20));
		
		l4=new JLabel("Father's Name:");
		l4.setFont(new Font("Raleway",Font.BOLD,20));
		
		l5 = new JLabel("Date of Birth:");
		l5.setFont(new Font("Raleway",Font.BOLD,20));
		
		l6= new JLabel("Gender:");
		l6.setFont(new Font("Raleway",Font.BOLD,20));
		
		l7 = new JLabel("Email Address:");
		l7.setFont(new Font("Raleway",Font.BOLD,20));
		
		l8 = new JLabel("Marital Status:");
		l8.setFont(new Font("Raleway",Font.BOLD,20));
		
		l9= new JLabel("Address:");
		l9.setFont(new Font("Raleway",Font.BOLD,20));
		
		l10= new JLabel("City:");
		l10.setFont(new Font("Raleway",Font.BOLD,20));
		
		l11= new JLabel("PIN Code:");
		l11.setFont(new Font("Raleway",Font.BOLD,20));
		
		l12=new JLabel("State:");
		l12.setFont(new Font("Raleway",Font.BOLD,20));
		
		l13=new JLabel("Date:");
		l13.setFont(new Font("Raleway",Font.BOLD,20));
		
		l14=new JLabel("Month:");
		l14.setFont(new Font("Raleway",Font.BOLD,20));
		
		l15=new JLabel("Year:");
		l15.setFont(new Font("Raleway",Font.BOLD,20));
		
		
		//creating the text field and styling them:
		
		t1=new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,14));
		
		t2=new JTextField();
		t2.setFont(new Font("Raleway",Font.BOLD,14));
		
		t3=new JTextField();
		t3.setFont(new Font("Raleway",Font.BOLD,14));
		
		t4=new JTextField();
		t4.setFont(new Font("Raleway",Font.BOLD,14));
		
		t5=new JTextField();
		t5.setFont(new Font("Raleway",Font.BOLD,14));
		
		t6=new JTextField();
		t6.setFont(new Font("Raleway",Font.BOLD,14));
		
		t7=new JTextField();
		t7.setFont(new Font("Raleway",Font.BOLD,14));
		
		// creating the button and styling it
		
		b1= new JButton("NEXT");
		b1.setFont(new Font("Raleway",Font.BOLD,14));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		
		//creating and styling the radi buttons
		
		r1 =new JRadioButton("Male");
		r1.setFont(new Font("Raleway3",Font.BOLD,14));
		
		r2=new JRadioButton("Female");
		r2.setFont(new Font("Raleway3",Font.BOLD,14));
		
		r3 =new JRadioButton("Married");
		r3.setFont(new Font("Raleway3",Font.BOLD,14));
		
		r4 =new JRadioButton("Unmarried");
		r4.setFont(new Font("Raleway3",Font.BOLD,14));
		
		r5 =new JRadioButton("other");
		r5.setFont(new Font("Raleway3",Font.BOLD,14));
		
		//creating and styling the combo box
		
		String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		c1 = new JComboBox(date);
		c1.setBackground(Color.WHITE);

		String month[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
		c2 = new JComboBox(month);
		c2.setBackground(Color.WHITE);

		String year[]={"1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"};
		c3 = new JComboBox(year);
		c3.setBackground(Color.WHITE);
		
		setLayout(null);
		l1.setBounds(140,20,600,40);
		add(l1);
		
		l2.setBounds(290,70,600,30);
		add(l2);
		
		l3.setBounds(100,140,400,30);
		add(l3);
		
		t1.setBounds(300,140,450,30);
		add(t1);
		
		l4.setBounds(100,190,200,30);
		add(l4);
		
		t2.setBounds(300,190,450,30);
		add(t2);
		
		l5.setBounds(100,240,200,30);
		add(l5);
		
		l13.setBounds(300,235,60,40);
		add(l13);
		
		c1.setBounds(360,240,50,30);
		add(c1);
		
		l14.setBounds(420,240,80,30);
		add(l14);
		
		c2.setBounds(490,240,100,30);
		add(c2);
		
		l15.setBounds(600,240,80,30);
		add(l15);
		
		c3.setBounds(655,240,80,30);
		add(c3);
		
//		c3.setBounds(610,240,40,30);
//		add(c3);
		
		l6.setBounds(100,290,100,30);
		add(l6);
		
		r1.setBounds(300,290,90,30);
		add(r1);
		
		r2.setBounds(450,290,90,30);
		add(r2);
		
		ButtonGroup groupgender = new ButtonGroup();
		groupgender.add(r1);
		groupgender.add(r2);
		
		
		l7.setBounds(100,340,200,30);
		add(l7);
		
		t3.setBounds(300,340,450,30);
		add(t3);
		
		l8.setBounds(100,390,180,30);
		add(l8);
		
		r3.setBounds(300,390,100,30);
		add(r3);
		
		r4.setBounds(450,390,100,30);
		add(r4);
		
		r5.setBounds(635,390,100,30);
		add(r5);
		
		ButtonGroup groupstatus = new ButtonGroup();
		groupstatus.add(r3);
		groupstatus.add(r4);
		groupstatus.add(r5);
		
		l9.setBounds(100,440,200,30);
		add(l9);
		
		t4.setBounds(300,440,450,30);
		add(t4);
		
		l10.setBounds(100,490,200,30);
		add(l10);
		
		t5.setBounds(300,490,450,30);
		add(t5);
		
		l11.setBounds(100,540,200,30);
		add(l11);
		
		t6.setBounds(300,540,450,30);
		add(t6);
		
		l12.setBounds(100,590,200,30);
		add(l12);
		
		t7.setBounds(300,590,450,30);
		add(t7);
		
		b1.setBounds(640,650,100,35);
		add(b1);
		
		b1.addActionListener(this);
		
		getContentPane().setBackground(Color.lightGray);
		
		setSize(900,750);
		setLocation(200,0);
		setVisible(true);
		
	}
	
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
	   String formno= first;
	   String name=t1.getText();
	   String fname = t2.getText();
	   
	   
	   String ac =(String) c1.getSelectedItem();
	   String bc=(String) c2.getSelectedItem();
	   String cc= (String) c3.getSelectedItem();
	   
	   String gender =null;
	   if (r1.isSelected()){
		   gender="Male";
	   }
	   else if (r2.isSelected()){
		   gender="Female";
	   }
	   String email = t3.getText();
	   String marital =null;
	   
	   if (r3.isSelected()){
		   marital="Married";
	   }
	   else if (r4.isSelected()){
		   marital="Unmarried";
	   }
	   else if (r4.isSelected()){
		   marital="other";
	   }
	   
	   String address = t4.getText();
	   String city =t5.getText();
	   String pincode = t6.getText();
	   String state = t7.getText();
	   
	   try{
		   if (t6.getText().equals("")){
			   JOptionPane.showMessageDialog(null,"FILL ALL THE REQUIRED FIELDS");
		   }
		   else{
			   conn c1 = new conn();
			   // sql insertion query to store the inputted data in database.
			   String q1 ="insert into singup values('"+formno+"','"+name+"','"+ac+"','"+bc+"','"+cc+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"','"+first+"')";
			   new Singup2(formno).setVisible(true);
			   setVisible(false);
		   }
	   } catch (HeadlessException ex) {
		   ex.printStackTrace();
	   }
		
		
	}
	
	public static void main(String[] args) {
	Singup	s=new Singup();
	
	s.setResizable(false);
	s.setVisible(true);
	}
}
