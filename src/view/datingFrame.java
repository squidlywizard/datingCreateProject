package view;

import javax.swing.JFrame;

import controller.datingController;
import view.datingPanel;

public class datingFrame extends JFrame
{
	private datingController appController;
	private datingPanel appPanel;
	
	public datingFrame(datingController appController) 
	{
		super();
		
		this.appController = appController;
		this.appPanel = new datingPanel(appController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(600, 971);
		this.setTitle("clothes on back, shoes on my feet");
		this.setResizable(false);
		this.setVisible(true);
	}
}
