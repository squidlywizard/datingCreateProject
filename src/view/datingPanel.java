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
private int diaolog;
private String name;

private ImageIcon demi;

private SpringLayout Layout;

	public datingPanel(datingController appController) {
		super();
		this.app = appController;
		this.Layout = new SpringLayout();
	    this.demi = new ImageIcon(getClass().getResource("/view/image/demi.jpeg"));
	    
	    yes = new JButton ("y-yes");
	    yes.setVisible(false);
	    no = new JButton("n-no");
	    no.setVisible(false);
	    imageLabel = new JLabel();
	    
	    imageLabel.setIcon(demi);
	
	    next = new JButton("next");
	    dates = new JTextField("im taylor, who are you?", 40);
	
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
	
	diaolog = 0;
	
	
	
	
	
	
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
		next.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				if (diaolog == 0)
				{
					 name = JOptionPane.showInputDialog(null, "what is your name?");
					dates.setText(app.getspeech(4));
					
					diaolog ++;
				}
				if (diaolog == 1)
				{
					no.setVisible(true);
					yes.setVisible(true);
					next.setVisible(false);
		
				}
			}
			
		});
		no.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				if(app.isWorthy(name))
				{
					dates.setText(app.getspeech(1));
				}else
				{
					dates.setText(app.getspeech(3));
				}
				
				no.setVisible(false);
				yes.setVisible(false);

			}
			
		});
		yes.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				if(app.isWorthy(name))
				{
					dates.setText(app.getspeech(0));
				}
				else
				{
					dates.setText(app.getspeech(2));
				}
				
				no.setVisible(false);
				yes.setVisible(false);

			}
			
		});
			
	
 }

}
