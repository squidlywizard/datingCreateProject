package model;

public class datingModel
{
private boolean worthiness;
private String[] response;


   public void isWorthy (String name)
     {
	   name.toLowerCase();
	   if(name.substring(0,1).equals("q")||name.substring(0,1).equals("w")||name.substring(0,1).equals("e")||name.substring(0,1).equals("r")||name.substring(0,1).equals("t")||name.substring(0,1).equals("y")||name.substring(0,1).equals("u")||name.substring(0,1).equals("i")||name.substring(0,1).equals("o")||name.substring(0,1).equals("p")||name.substring(0,1).equals("a")||name.substring(0,1).equals("s")||name.substring(0,1).equals("d")||name.substring(0,1).equals("f")||name.substring(0,1).equals("g"))
	   {
		   worthiness = true;
	   }
	   else
	   {
		   worthiness = false;
	   }
	
     }
   public void buildspeechList()
   {
	   response = new String[5];
	   response[0]= "lets be together forever";
	   response[1]= "I will wait for you";
	   response[2]= "ha creep";
	   response[3]= "OH are you to good for me then?";
	   response[4]= "do you love me?";
	   
	   
   }
   public boolean getWorth()
     {
	   return worthiness;
     }
}

