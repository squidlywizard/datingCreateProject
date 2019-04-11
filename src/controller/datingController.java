package controller;
import javax.swing.JOptionPane;

import view.datingFrame;
import model.datingModel;



public class datingController
{

	private datingModel mode;
    private datingFrame appFrame;
    private String name;
    private boolean worth;

	public void start()
	{
		//name = JOptionPane.showInputDialog(null, "what is your name?");
		//mode.buildspeechList();
		//mode.isWorthy(name);
	//	worth = mode.getWorth();
		
	
		this.appFrame = new datingFrame(this);
	}

}
