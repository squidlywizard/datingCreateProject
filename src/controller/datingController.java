package controller;
import javax.swing.JOptionPane;

import view.datingFrame;



public class datingController
{

    private datingFrame appFrame;
    private String name;

	public void start()
	{
		//name = JOptionPane.showInputDialog(null, "what is your name?");
		//System.out.println(name);
	
		this.appFrame = new datingFrame(this);
	}

}
