package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;


public class withdrawal extends JFrame implements ActionListener {
	JTextField t1,t2;
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	String pin;
	withdrawal(String pin){
		this.pin= pin;
		//styling the lables buttons and text-fields
		
		l1= new JLabel("MAXIMUM DAILY WITHDRAW");
		l1.setFont(new Font("Ralewy",Font.BOLD,40));
		
		l2= new JLabel("IS RS 12000");
		l2.setFont(new Font("Ralewy",Font.BOLD,35));
		
		l3= new JLabel("Enter Pin");
		l3.setFont(new Font("Ralewy",Font.BOLD,14));
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,22));
		
		t2 = new JTextField();
		t2.setFont(new Font("Raleway",Font.BOLD,14));
		
		b1 = new JButton("Withdraw");
		b1.setFont(new Font("Raleway",Font.BOLD,18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("Back");
		b2.setFont(new Font("Raleway",Font.BOLD,18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3 = new JButton("Exit");
		b3.setFont(new Font("Raleway",Font.BOLD,18));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		//form
		
		setLayout(null);
		
		l3.setBounds(620,10,80,30);
		add(l3);
		
		t2.setBounds(700,10,40,30);
		add(t2);
		
		l1.setBounds(150,150,800,60);
		add(l1);
		
		l2.setBounds(290,210,800,60);
		add(l2);
		
		t1.setBounds(250,300,300,50);
		add(t1);
		
		b1.setBounds(260,380,125,50);
		add(b1);
		
		b2.setBounds(415,380,125,50);
		add(b2);
		
		b3.setBounds(300,550,200,50);
		add(b3);
		
		//adiing actionlistener to the buttons
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		//styling the panel
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
		try {
			if (e.getSource()==b1) {
				String amount = t1.getText();
				Date date = new Date();
				if (t1.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Enter the amount to Withdraw");
				} else {
					conn c1 = new conn();
					ResultSet rs = c1.s.executeQuery("select * from bank where pin ='" + pin + "'");
					double bal = 0;
					while (rs.next()) {
						if (rs.getString("mode").equals("Deposit")) {
							bal += Integer.parseInt(rs.getString("amount"));
						} else {
							bal -= Integer.parseInt(rs.getString("amount"));
						}
					}
					if (bal < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null,"Insufficient balance");
					return;
					}
						String q = "insert into bank values('" + pin + "','"+date+"','withdraw',null,'" + amount + "')";
						c1.s.executeUpdate(q);
					JOptionPane.showMessageDialog(null, "rs." + amount + "withdraw Successfully");
					new Transcations(pin).setVisible(true);
				}
			}
			else if (e.getSource()==b2){
				new Transcations(pin).setVisible(true);
				setVisible(false);
			}
			
			else if (e.getSource()==b3){
				System.exit(0);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		withdrawal wd= new withdrawal("");
		wd.setResizable(false);
		wd.setVisible(true);
	}
}
