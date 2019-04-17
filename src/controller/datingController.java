package controller;
import javax.swing.JOptionPane;

import view.datingFrame;




public class datingController
{


    private datingFrame appFrame;
    private String name;
    private boolean worthiness;
    private String[] response;

	public void start()
	{
		buildspeechList();
		
		
		

		
		this.appFrame = new datingFrame(this);
		
	}
	   public boolean isWorthy (String name)
	     {
		   name.toLowerCase();
		   if(name.equals(""))
		   {
			   return false;
		   }
		   else if(name.substring(0,1).equals("q")||name.substring(0,1).equals("w")||name.substring(0,1).equals("e")||name.substring(0,1).equals("r")||name.substring(0,1).equals("t")||name.substring(0,1).equals("y")||name.substring(0,1).equals("u")||name.substring(0,1).equals("i")||name.substring(0,1).equals("o")||name.substring(0,1).equals("p")||name.substring(0,1).equals("a")||name.substring(0,1).equals("s")||name.substring(0,1).equals("d")||name.substring(0,1).equals("f")||name.substring(0,1).equals("g"))
		   {
			   return true;
		   }
		   else
		   {
			   return false;
		   }
		
	     }
	   public void buildspeechList()
	   {
		   response = new String[8];
		   response[0]= "lets be together forever";
		   response[1]= "I will wait for you";
		   response[2]= "ha creep";
		   response[3]= "OH are you to good for me then?";
		   response[4]= "do you love me?";
		   
		   
	   }
	   public Boolean getWorth()
	   {
		   return worthiness;
	   }
	   public String getspeech(int I) {
		   return response[I];
	   }

}
