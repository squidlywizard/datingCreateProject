package view;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.image.*;


import javax.swing.*;
import controller.datingController;


public class datingPanel extends JPanel 
{

private JButton yes;
private JButton no;
private JButton next;
private JTextField dates;
private ImageIcon demi;
private SpringLayout Layout;
	public datingPanel(datingController appController) {
		super();
		this.Layout = new SpringLayout();
	demi = new ImageIcon(getClass().getResource("/view/image/demiFinal.png"));
	yes = new JButton ("y-yes");
	Layout.putConstraint(SpringLayout.WEST, yes, 127, SpringLayout.WEST, this);
	no = new JButton("n-no");
	Layout.putConstraint(SpringLayout.NORTH, yes, 0, SpringLayout.NORTH, no);
	Layout.putConstraint(SpringLayout.NORTH, no, 249, SpringLayout.NORTH, this);
	Layout.putConstraint(SpringLayout.EAST, no, -153, SpringLayout.EAST, this);
	next = new JButton("next");
	dates = new JTextField("im odea", 40);
	Layout.putConstraint(SpringLayout.SOUTH, dates, -55, SpringLayout.SOUTH, this);
	Layout.putConstraint(SpringLayout.EAST, dates, -53, SpringLayout.EAST, this);
	dates.setEditable(false);
	
	

	
	setupPanel();
	setupLayout();	
	setupListeners();}

 public void setupPanel()
 {
	 this.setLayout(Layout);
	this.add(yes);
	this.add(no);
	this.add(next);
	this.add(dates);
	
	
	
	
 }
 public void setupLayout()
 {
	
 }
 public void setupListeners()
 {
	
 }
}
