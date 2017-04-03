import java.util.Scanner;


public class Kitchen implements Runnable{
	private Shared s;


   public Kitchen(Shared s)
  {
	this.s=s;
  }
  public void run()
  {
	while(true)
	{
		
		if(s.isEmpty()==1)
		{
			try{
			Thread.sleep(2000);
			}
			catch(Exception e){}
		}
		else
		{
			int time=s.remove();
			System.out.println("order delivered within "+time+ " secs");
			try{
				Thread.sleep(time*1000);
				}
				catch(Exception e){}
			
			
		 }
	}
  }
} 


