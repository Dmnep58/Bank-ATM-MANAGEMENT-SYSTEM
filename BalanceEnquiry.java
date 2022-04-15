package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
	String pin;
	int balance = 0;
	
	BalanceEnquiry(String pin) {
		this.pin = pin;
		JLabel l1 = new JLabel();
		l1.setForeground(Color.BLACK);
		l1.setFont(new Font("System", Font.BOLD, 16));
		try {
			conn c1 = new conn();
			ResultSet rs = c1.s.executeQuery("select * from bank where pin ='" + pin + "'");
			while (rs.next()) {
				if (rs.getString("mode").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				} else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
			}
		} catch (Exception ex) {
		
		}
		l1.setText("your current account balance is " + balance);
		JButton b = new JButton("Back");
		
		setLayout(null);
		l1.setBounds(120, 250, 400, 35);
		add(l1);
		b.setBounds(300, 323, 150, 35);
		add(b);
		
		setSize(560, 580);
		setLocation(200, 0);
		setUndecorated(true);
		
		b.addActionListener(this);
		
		
	}
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		new Transcations(pin).setVisible(true);
	}

	public static void main(String[] args) {
		new BalanceEnquiry("").setVisible(true);
	}
}

