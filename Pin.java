package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Pin extends JFrame implements ActionListener {
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2;
	String pin;

	Pin(String pin){
		this.pin=pin;
		//styling and declaring the labels, text-fields, buttons

		l1=new JLabel("CHANGE YOUR PIN");
		l1.setFont(new Font("System",Font.BOLD,35));
//
//		l2 = new JLabel("	Current Pin");
//		l2.setFont(new Font("System",Font.BOLD,22));

		l3= new JLabel("New Pin");
		l3.setFont(new Font("System",Font.BOLD,22));

		l4 = new JLabel("Re-Enter the new Pin");
		l4.setFont(new Font("System",Font.BOLD,20));

		t1 = new JTextField();
		t1.setFont(new Font("Raleway",Font.BOLD,22));

		t2 = new JTextField();
		t2.setFont(new Font("Raleway",Font.BOLD,22));

		t3 = new JTextField();
		t3.setFont(new Font("Raleway",Font.BOLD,22));

		b1= new JButton("Change");
		b1.setFont(new Font("Raleway",Font.BOLD,18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2= new JButton("Back");
		b2.setFont(new Font("Raleway",Font.BOLD,18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		//providing action-listeners to buttons

		b1.addActionListener(this);
		b2.addActionListener(this);

		setLayout(null);

		// provinds and setting the locations of all the labels text-field and buttons

		l1.setBounds(220,130,800,60);
		add(l1);

//		l2.setBounds(100,240,150,40);
//		add(l2);

		l3.setBounds(100,300,150,40);
		add(l3);

		l4.setBounds(100,360,280,40);
		add(l4);

//		t1.setBounds(310,240,360,40);
//		add(t1);

		t2.setBounds(310,300,360,40);
		add(t2);

		t3.setBounds(310,360,360,40);
		add(t3);

		b1.setBounds(220,460,160,50);
		add(b1);

		b2.setBounds(400,460,160,50);
		add(b2);


		// styling the panel
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
			String npin =t1.getText();
			String rpin = t2.getText();
		

			if (e.getSource()==b1){
//				if (npin.equals("")){
//					JOptionPane.showMessageDialog(null,"Please Enter Current Pin");
//				}
				if (npin.equals("")){
					JOptionPane.showMessageDialog(null,"Enter New Pin");
				}
				if (rpin.equals("")){
					JOptionPane.showMessageDialog(null,"Re-Enter New Pin");
				}

				if (t2.getText().equals(t2.getText())){
					conn c1 = new conn();

					String q1 = "update bank set pin ='"+rpin+"'where pin ='"+pin+"'";
					String q2 ="update login set pin ='"+rpin+"'where pin='"+pin+"'";
					String q3 = "update Singup3 set pin ='"+rpin+"'where pin='"+pin+"'";

					c1.s.executeQuery(q1);
					c1.s.executeQuery(q2);
					c1.s.executeQuery(q3);

					JOptionPane.showMessageDialog(null,"Pin Changes Successfully");
					setVisible(false);
					new Transcations(pin).setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Pin Entered Doesnot Matched");
				}
			}
			else if (e.getSource()==b2){
				new Transcations(pin).setVisible(true);
				setVisible(false);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Pin p = new Pin("");
		p.setResizable(false);
		p.setVisible(true);
	}
}
