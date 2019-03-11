package controller;
import view.datingFrame;



public class datingController
{

    private datingFrame appFrame;

	public void start()
	{
		
		this.appFrame = new datingFrame(this);
	}

}
