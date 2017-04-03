import java.util.Scanner;


public class EatingArea implements Runnable {
	private Shared s;
	
	public EatingArea(Shared s)
	{
		this.s=s;
	}
	public void run()
	{
		while(true)
		{
			Scanner scr=new Scanner(System.in);
			System.out.print("enter items between 1 to 10 :");
			int no=scr.nextInt();
			if(s.isFull()==1)
			{
				try{
				Thread.sleep(2000);
				}
				catch(Exception e){}
			}
			else
			{
				s.add(no);
				System.out.println("order placed");
				try{
					Thread.sleep(2000);
					}
					catch(Exception e){}
				
				
			}
			
			
			
		}
	}

}
