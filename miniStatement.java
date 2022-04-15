package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class miniStatement extends JFrame implements ActionListener {
	JLabel l1,l2;
	JButton b1,b2;
	static String pin;
	miniStatement(String pin){
		this.pin=pin;
		
		l1 = new JLabel("this is a mini statement");
		l1.setFont(new Font("Raleway",Font.BOLD,14));
		
		l2= new JLabel("your balance and last withdraw amount is");
		l2.setFont(new Font("Raleway",Font.BOLD,14));
		
		b1 = new JButton("back");
		b1.setFont(new Font("System",Font.BOLD,12));
		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.black);
		
		b2 = new JButton("exit");
		b2.setFont(new Font("System",Font.BOLD,12));
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.black);
		
		
		setLayout(null);
		
		l1.setBounds(50,20,200,300);
		add(l1);
		
		l2.setBounds(50,40,280,300);
		add(l2);
		
		b1.setBounds(150,300,100,50);
		add(b1);
		
		b2.setBounds(300,300,100,50);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		setUndecorated(true);
		setBackground(Color.lightGray);
		setLocation(80,20);
		setSize(500,500);
	}
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		 try
		 {
			 if (e.getSource()==b1){
				 this.setVisible(false);
				 new Transcations(pin);
				
			 }
			 if (e.getSource()==b2){
				 System.exit(0);
			 }
		 } catch (Exception ex) {
			 ex.printStackTrace();
		 }
	}
	
	public static void main(String[] args) {
		new miniStatement(pin).setVisible(true);
	}
}
