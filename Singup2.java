package com.AsimulatorSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Singup2 extends JFrame implements ActionListener {
	
	// required numbers of the fields.
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12,l13;
	JTextField t1, t2, t3;
	JRadioButton r1, r2, r3, r4;
	JButton b1;
	JComboBox c1, c2, c3, c4, c5;
	String formno;
	
	//created a constructor.
	Singup2(String formno) {
		this.formno=formno;
		setTitle( "NEW ACCOUNT APPLICATION FORM-Page2");
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/AsimulatorSystem/images/s.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		 l13 = new JLabel(i3);
		l13.setBounds(150,0,100,100);
		add(l13);
		//declaring and styling the lables.
		l1 = new JLabel("Page 2: Additional Details");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Raleway", Font.BOLD, 22));
		
		l2 = new JLabel("Religion: ");
		l2.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l3 = new JLabel("Category:");
		l3.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l4 = new JLabel("Income:");
		l4.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l5 = new JLabel("Educational:");
		l5.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l11 = new JLabel("Qualification: ");
		l11.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l6 = new JLabel("occupation:");
		l6.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l7 = new JLabel("PAN Number:");
		l7.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l8 = new JLabel("citizen Number:");
		l8.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l9 = new JLabel("Senior Citizen:");
		l9.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l10 = new JLabel("Existing Account:");
		l10.setFont(new Font("Raleway", Font.BOLD, 16));
		
		l12 = new JLabel("Form No:");
		l12.setFont(new Font("Raleway", Font.BOLD, 16));
		
		//button styling.
		
		b1 = new JButton("Next");
		b1.setFont(new Font("Raleway", Font.BOLD, 14));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		//text-field initializing and declaring
		
		t1 = new JTextField();
		t1.setFont(new Font("Raleway", Font.BOLD, 14));
		
		t2 = new JTextField();
		t2.setFont(new Font("Raleway", Font.BOLD, 14));
		
//		t3 = new JTextField();
//		t3.setFont(new Font("Raleway", Font.BOLD, 13));
		
		
		// radio buttons initializing and styling
		
		r1 = new JRadioButton("yes");
		r1.setFont(new Font("Raleway", Font.BOLD, 14));
		r1.setBackground(Color.WHITE);
		
		r2 = new JRadioButton("NO");
		r2.setFont(new Font("Raleway", Font.BOLD, 14));
		r2.setBackground(Color.WHITE);
		
		ButtonGroup groupradio = new ButtonGroup();
		groupradio.add(r1);
		groupradio.add(r2);
		
		r3 = new JRadioButton("yes");
		r3.setFont(new Font("Raleway", Font.BOLD, 14));
		r3.setBackground(Color.WHITE);
		
		r4 = new JRadioButton("NO");
		r4.setFont(new Font("Raleway", Font.BOLD, 14));
		r4.setBackground(Color.WHITE);
		
		ButtonGroup groupradio2 = new ButtonGroup();
		groupradio2.add(r3);
		groupradio2.add(r4);
		
		
		// initializing declaring and styling the combo box
		String[] religion = {"Hindu", "Muslim", "Sikh", "Christian", "others"};
		c1 = new JComboBox(religion);
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Raleway", Font.BOLD, 14));
		
		String[] category = {"General", "OBC", "sc", "ST", "others"};
		c2 = new JComboBox(category);
		c2.setBackground(Color.WHITE);
		c2.setFont(new Font("Raleway", Font.BOLD, 14));
		
		String[] income = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Above 10,00,000"};
		c3 = new JComboBox(income);
		c3.setBackground(Color.WHITE);
		c3.setFont(new Font("Raleway", Font.BOLD, 14));
		
		String[] education = {"Non-Graduate", "Graduate", "post-Graduate", "Doctrate", "others"};
		c4 = new JComboBox(education);
		c4.setBackground(Color.WHITE);
		c4.setFont(new Font("Raleway", Font.BOLD, 14));
		
		String[] occupation = {"Salaried", "Self-Employeed", "Business", "Student", "Retired", "others"};
		c5 = new JComboBox(occupation);
		c5.setBackground(Color.WHITE);
		c5.setFont(new Font("Raleway", Font.BOLD, 14));
		
		setLayout(null);
		
		
		//setting the bounds according to the lines.
		l12.setBounds(680, 10, 75, 30);
		add(l12);
		
//		t3.setBounds(760, 10, 60, 30);
//		add(t3);
		
		l1.setBounds(280, 30, 600, 40);
		add(l1);
		
		l2.setBounds(100, 120, 100, 30);
		add(l2);
		
		c1.setBounds(350, 120, 320, 30);
		add(c1);
		
		l3.setBounds(100, 170, 100, 30);
		add(l3);
		
		c2.setBounds(350, 170, 320, 30);
		add(c2);
		
		l4.setBounds(100, 220, 100, 30);
		add(l4);
		
		c3.setBounds(350, 220, 320, 30);
		add(c3);
		
		l5.setBounds(100, 270, 250, 30);
		add(l5);
		
		c4.setBounds(350, 270, 320, 30);
		add(c4);
		
		l11.setBounds(100, 290, 150, 30);
		add(l11);
		
		l6.setBounds(100, 340, 150, 30);
		add(l6);
		
		c5.setBounds(350, 340, 320, 30);
		add(c5);
		
		l7.setBounds(100, 390, 150, 30);
		add(l7);
		
		t1.setBounds(350, 390, 320, 30);
		add(t1);
		
		l8.setBounds(100, 440, 180, 30);
		add(l8);
		
		t2.setBounds(350, 440, 320, 30);
		add(t2);
		
		l9.setBounds(100, 490, 150, 30);
		add(l9);
		
		r1.setBounds(350, 490, 100, 30);
		add(r1);
		
		r2.setBounds(460, 490, 100, 30);
		add(r2);
		
		l10.setBounds(100, 540, 180, 30);
		add(l10);
		
		r3.setBounds(350, 540, 100, 30);
		add(r3);
		
		r4.setBounds(460, 540, 100, 30);
		add(r4);
		
		b1.setBounds(570, 600, 100, 30);
		add(b1);
		
		b1.addActionListener(this);
		
		getContentPane().setBackground(Color.lightGray);
		
		setSize(850, 850);
		setLocation(200, 20);
		setVisible(true);
	}
	
	
	/**
	 * Invoked when an action occurs.
	 *
	 * @param e the event to be processed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		String religion = (String) c1.getSelectedItem();
		String category = (String) c2.getSelectedItem();
		String income = (String) c3.getSelectedItem();
		String education = (String) c4.getSelectedItem();
		String occupation = (String) c5.getSelectedItem();
		
		String pan = t1.getText();
		String citizen = t2.getText();
		
		String senior = " ";
		if (r1.isSelected()) {
			senior = "yes";
		} else if (r2.isSelected()) {
			senior = "No";
		}
		
		String account = " ";
		if (r3.isSelected()) {
			account = "yes";
		} else if (r4.isSelected()) {
			account = "No";
		}
		
		try {
			if (t2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "PLEASE FILL ALL REQUIRED FIELDS");
			} else {
				conn c1 = new conn();
				String q1 = "insert into Singup2 values('" + religion + "','" + category + "','" + income + "','" + education + "','" + occupation + "','" + pan + "','" + citizen + "','" + senior + "','" + account + "')";
				c1.s.executeQuery(q1);
				
				new Singup3(formno).setVisible(true);
				setVisible(false);
				
			}
			if (e.getSource()==b1){
				new Singup().setVisible(true);
				setVisible(false);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Singup2 s2=new Singup2(" ");
		s2.setVisible(true);
		s2.setResizable(false);
	}
}