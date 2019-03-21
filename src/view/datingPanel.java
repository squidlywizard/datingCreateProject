package view;

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
	public datingPanel(datingController appController) {
		super();
	yes = new JButton ("y-yes");
	no = new JButton("n-no");
	next = new JButton("next");
	dates = new JTextField("im odea, im looking for love", 600);
	demi = new ImageIcon(getClass().getResource("/view/image/demiFinal.png"));
	

	
	setupPanel();
	setupLayout();	
	setupListeners();}

 public void setupPanel()
 {
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
