package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;


public class Fastcash extends JFrame implements ActionListener {
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	Fastcash(String pin){
		this.pin=pin;
		//styling the labels text-field and buttons.
		
		l1 = new JLabel("Select the withdrawl Amount");
		l1.setFont(new Font("Raleway",Font.BOLD,38));
		
		l2= new JLabel("Enter Pin");
		l2.setFont(new Font("Railway",Font.BOLD,13));
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway", Font.BOLD,13));
		
		b1= new JButton("100");
		b1.setFont(new Font("Raleway",Font.BOLD,18));
		b1.setBackground(Color.black);
		b1.setForeground(Color.WHITE);
		
		b2= new JButton("500");
		b2.setFont(new Font("Raleway",Font.BOLD,18));
		b2.setBackground(Color.black);
		b2.setForeground(Color.WHITE);
		
		b3= new JButton("1000");
		b3.setFont(new Font("Raleway",Font.BOLD,18));
		b3.setBackground(Color.black);
		b3.setForeground(Color.WHITE);
		
		b4= new JButton("3000");
		b4.setFont(new Font("Raleway",Font.BOLD,18));
		b4.setBackground(Color.black);
		b4.setForeground(Color.WHITE);
		
		b5= new JButton("6000");
		b5.setFont(new Font("Raleway",Font.BOLD,18));
		b5.setBackground(Color.black);
		b5.setForeground(Color.WHITE);
		
		b6= new JButton("12000");
		b6.setFont(new Font("Raleway",Font.BOLD,18));
		b6.setBackground(Color.black);
		b6.setForeground(Color.WHITE);
		
		b7= new JButton("Back");
		b7.setFont(new Font("Raleway",Font.BOLD,18));
		b7.setBackground(Color.black);
		b7.setForeground(Color.WHITE);
		
		setLayout(null);
		
		//setting the bounds and positions of labels,text-field and buttons
		
		l2.setBounds(640,10,60,40);
		add(l2);
		
		t1.setBounds(710,10,60,40);
		add(t1);
		
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
		
		//providing actions listeners to buttons
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		// panels styling and declaration
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800,800);
		setLocation(200,0);
		setUndecorated(true);
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
			String amount= ((JButton)e.getSource()).getText().substring(3);
			conn c1 = new conn();
			ResultSet rs = c1.s.executeQuery("select * from bank where pin ='" + pin + "'");
			double balance = 0;
			while (rs.next()) {
				if (rs.getString("mode").equals("Deposit")) {
					balance += Integer.parseInt(rs.getString("amount"));
				} else {
					balance -= Integer.parseInt(rs.getString("amount"));
				}
				if (balance < Integer.parseInt(amount)) {
					JOptionPane.showMessageDialog(null, "Insufficient balance");
					return;
				}
			}
			if (e.getSource()==b7){
				this.setVisible(true);
				new Transcations(pin).setVisible(true);
			}
			else{
				Date date = new Date();
				String q = "insert into bank values('" + pin + "','"+date+"','withdraw',null,'" + amount + "')";
				c1.s.executeUpdate(q);
				JOptionPane.showMessageDialog(null, "rs." + amount + "withdraw Successfully");
				new Transcations(pin).setVisible(true);
			}
//
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=100;
//					 String q1= "insert into bank values('"+pin+"',null,100,'"+balance+"')";
//
//					 c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+100+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			else if (e.getSource()==b2){
//				conn c1 = new conn();
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=500;
//					String q1= "insert into bank values('"+pin+"',null,500,'"+balance+"')";
//
//					c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+500+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			else if (e.getSource()==b3){
//				conn c1 = new conn();
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=1000;
//					String q1= "insert into bank values('"+pin+"',null,1000,'"+balance+"')";
//
//					c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+1000+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			else if (e.getSource()==b4){
//				conn c1 = new conn();
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=3000;
//					String q1= "insert into bank values('"+pin+"',null,3000,'"+balance+"')";
//
//					c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+3000+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			 else if (e.getSource()==b5){
//				conn c1 = new conn();
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=6000;
//					String q1= "insert into bank values('"+pin+"',null,6000,'"+balance+"')";
//
//					c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+6000+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			else if (e.getSource()==b6){
//				conn c1 = new conn();
//
//				ResultSet rs = c1.s.executeQuery("select * from where pin = '"+amount+"'");
//
//				if (rs.next()){
//					 pin= rs.getString("pin");
//
//					balance = rs.getDouble("balance");
//
//					balance -=12000;
//					String q1= "insert into bank values('"+pin+"',null,12000,'"+balance+"')";
//
//					c1.s.executeQuery(q1);
//				}
//				JOptionPane.showMessageDialog(null,"Rs."+12000+"Debited SUccessfully");
//
//				new Transcations(pin).setVisible(true);
//				setVisible(false);
//
//			}
//			else if (e.getSource()==b7){
//				System.exit(0);
		
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("error"+ex);
		}
	}
	
	public static void main(String[] args) {
		Fastcash fc = new Fastcash("");
		fc.setVisible(true);
	}
}
