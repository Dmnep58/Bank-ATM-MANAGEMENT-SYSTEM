package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transcations extends JFrame implements ActionListener {
	
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	Transcations(String pin){
		this.pin=pin;
	
		
		//STYLING THE LABLE
		
		l1 = new JLabel("Please select your Transaction");
		l1.setFont(new Font("Raleway",Font.BOLD,38));
		
		//styling and declaring the buttons
		
		b1 = new JButton("Deposit");
		b1.setFont(new Font("Raleway",Font.BOLD,18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("Cash Withdrwal");
		b2.setFont(new Font("Raleway",Font.BOLD,18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3 = new JButton("Fast Cash");
		b3.setFont(new Font("Raleway",Font.BOLD,18));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		b4 = new JButton("Mini Statement");
		b4.setFont(new Font("Raleway",Font.BOLD,18));
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		
		b5 = new JButton("Pin Change");
		b5.setFont(new Font("Raleway",Font.BOLD,18));
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		
		b6 = new JButton("Balance Enquiry");
		b6.setFont(new Font("Raleway",Font.BOLD,18));
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		
		b7 = new JButton("Exit");
		b7.setFont(new Font("Raleway",Font.BOLD,18));
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.WHITE);
		
		setLayout(null);
		
		// setting the bound for the  labels and buttons
		
		l1.setBounds(100,100,700,40);
		add(l1);
		
		b1.setBounds(40,250,300,60);
		add(b1);
		
		b2.setBounds(440,250,300,60);
		add(b2);
		
		b3.setBounds(40,360,300,60);
		add(b3);
		
		b4.setBounds(440,360,300,60);
		add(b4);
		
		b5.setBounds(40,470,300,60);
		add(b5);
		
		b6.setBounds(440,470,300,60);
		add(b6);
		
		b7.setBounds(240,600,300,60);
		add(b7);
		
		// providing action listeners to the buttons.
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
		// for the frame
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(800,800);
		setUndecorated(true);
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
	
		 if (e.getSource()==b1){
			 new  Deposit(pin).setVisible(true);
			 setVisible(false);
		 }
		 else  if (e.getSource()==b2) {
			 new withdrawal(pin).setVisible(true);
			 setVisible(false);
		 }
		 else  if (e.getSource()==b3){
			 new Fastcash(pin).setVisible(true);
			 setVisible(false);
		 }
		
		 else  if (e.getSource()==b4){
			 new miniStatement(pin).setVisible(true);
			 setVisible(false);
		 }
		
		 else  if (e.getSource()==b5){
			 new Pin(pin).setVisible(true);
			 setVisible(false);
		 }
		
		 else  if (e.getSource()==b6){
			 new BalanceEnquiry(pin).setVisible(true);
			 setVisible(false);
			}
		 else  if (e.getSource()==b7){
			 System.exit(0);
		 }
		
		
	}
	
	public static void main(String[] args) {
		Transcations t = new Transcations("");
		t.setResizable(false);
		t.setVisible(true);
	}
}
