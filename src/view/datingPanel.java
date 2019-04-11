package view;


import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.image.*;



import javax.swing.*;
import controller.datingController;


public class datingPanel extends JPanel 
{
private datingController app;

private JLabel imageLabel;
private JButton yes;
private JButton no;
private JButton next;
private JTextField dates;

private ImageIcon demi;

private SpringLayout Layout;

	public datingPanel(datingController appController) {
		super();
		this.app = app;
		this.Layout = new SpringLayout();
	    this.demi = new ImageIcon(getClass().getResource("/view/image/demi.jpeg"));
	    
	    yes = new JButton ("y-yes");
	    yes.setVisible(false);
	    no = new JButton("n-no");
	    no.setVisible(false);
	    imageLabel = new JLabel();
	    
	    imageLabel.setIcon(demi);
	
	    next = new JButton("next");
	    dates = new JTextField("im taylor do love me?", 40);
	
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
	this.add(imageLabel);
	imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
	imageLabel.setHorizontalTextPosition(JLabel.CENTER);
	
	
	
	
	
	
	
 }
 public void setupLayout()
 {   Layout.putConstraint(SpringLayout.NORTH, yes, 61, SpringLayout.NORTH, this);
	    Layout.putConstraint(SpringLayout.WEST, yes, 71, SpringLayout.WEST, this); Layout.putConstraint(SpringLayout.NORTH, no, 0, SpringLayout.NORTH, yes); Layout.putConstraint(SpringLayout.NORTH, imageLabel, 93, SpringLayout.SOUTH, yes);
	    Layout.putConstraint(SpringLayout.WEST, imageLabel, 0, SpringLayout.WEST, this);Layout.putConstraint(SpringLayout.EAST, no, 0, SpringLayout.EAST, dates);
	    Layout.putConstraint(SpringLayout.WEST, dates, 29, SpringLayout.WEST, this);
	    Layout.putConstraint(SpringLayout.EAST, dates, -106, SpringLayout.EAST, this);
	    Layout.putConstraint(SpringLayout.NORTH, next, 0, SpringLayout.NORTH, dates);
	    Layout.putConstraint(SpringLayout.WEST, next, 5, SpringLayout.EAST, dates);
	    Layout.putConstraint(SpringLayout.SOUTH, dates, -35, SpringLayout.SOUTH, this);
	    Layout.putConstraint(SpringLayout.NORTH, dates, 40, SpringLayout.SOUTH, imageLabel);
 }
 public void setupListeners()
 {
	
 }
}
