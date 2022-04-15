package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class Login extends JFrame implements ActionListener {
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField psf;
	JButton b1,b2,b3;
	
	
	Login(){
		//move the text to center
		 setTitle("Automated Taller Machine");
		 ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/AsimulatorSystem/images/b.jpg"));
		 Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		 ImageIcon i3 = new ImageIcon(i2);
		 JLabel l11 = new JLabel(i3);
		 l11.setBounds(60,95,100,100);
		 add(l11);
		 
		 
		// for the different labels
		 l1= new JLabel("WELCOME TO ATM");
		 l1.setForeground(Color.red);
		 l1.setFont(new Font("osward",Font.BOLD,38));
		 
		 l2= new JLabel("Card No:");
		 l2.setFont(new Font("Raleway",Font.BOLD,28));
		 
		 l3= new JLabel("PIN:");
		 l3.setFont(new Font("Raleway",Font.BOLD,28));
		
		 // for text-field and password-field
		 tf1=new JTextField(15);
		 psf=new JPasswordField(15);
		 
		 //for the different buttons
		 b1 =new JButton("SING IN");
		b1.setFont(new Font("Raleway",Font.BOLD,18));
		 b1.setBackground(Color.black);
		 b1.setForeground(Color.WHITE);
		 
		 b2=new JButton("CLEAR");
		b2.setFont(new Font("Raleway",Font.BOLD,18));
		 b2.setBackground(Color.black);
		 b2.setForeground(Color.WHITE);
		 
		 b3=new JButton("SING UP");
		b3.setFont(new Font("Raleway",Font.BOLD,18));
		 b3.setBackground(Color.black);
		 b3.setForeground(Color.WHITE);
		 
		 // setting the layout
		setLayout(null);
		l1.setBounds(175,50,450,200);
		add(l1);
		
		l2.setBounds(125,150,375,200);
		add(l2);
		
		l3.setBounds(180,225,275,200);
		add(l3);
		
		
		// set the text field
		tf1.setFont(new Font("Arial",Font.BOLD,14));
		tf1.setBounds(300,235,230,30);
		add(tf1);
		
		// for the password-field
		psf.setFont(new Font("Arial",Font.BOLD,14));
		psf.setBounds(300,310,230,30);
		add(psf);
		
		// for the button sections
		
		b1.setFont(new Font("Arial",Font.BOLD,14));
		b1.setBounds(300,400,100,30);
		add(b1);
		
		b2.setFont(new Font("Arial",Font.BOLD,14));
		b2.setBounds(430,400,100,30);
		add(b2);
		
		b3.setFont(new Font("Arial",Font.BOLD,14));
		b3.setBounds(300,450,230,30);
		add(b3);
		
		//ADDING ACTIONLISTENERS TO BUTTONS
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		// style the panel
		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		setSize(600,600);
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
	try{
		conn c1=new conn();
		String cardno =tf1.getText();
		String pin = psf.getText();
		String q= "select * from LOGIN where CARDNO ='"+cardno+"'and pin='"+pin+"'";
		ResultSet rs =c1.s.executeQuery(q);
		
		if (e.getSource()==b1){
			if (rs.next()){
				new Transcations(pin).setVisible(true);
				setVisible(false);
			}
			else {
				JOptionPane.showMessageDialog(null,"INCORRECT CARD-NO OR PASSWORD");
			}
			
		}
		else if (e.getSource()==b2){
				tf1.setText("");
				psf.setText("");
			}
			else if (e.getSource()==b3){
				new Singup().setVisible(true);
				setVisible(false);
			}
			
	} catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("error: "+ex);
	}
	}
	
	public static void main(String[] args) {
		Login log=new Login();
		log.setResizable(false);
		log.setVisible(true);
		
		
	}
}
