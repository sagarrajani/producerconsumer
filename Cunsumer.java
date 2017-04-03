
public class Cunsumer implements Runnable {
	
	private Shared s;
	private boolean k=true;
	public Cunsumer(Shared s)
	{
		this.s=s;
	}
	public void run() {
		
	while(k)
	{
		int t=s.getSize();
		int arr[]=s.getArray();
		if(t==-1)
		{
			
			try{
				Thread.sleep(5000);
				}
				catch(Exception e){}
			
		}
		else{
			
			arr[t]=-1;
			t--;
			System.out.println("Consumed");
			s.setSize(t);
			s.setArray(arr);
			System.out.println(s.getSize());
			try{
				Thread.sleep(1000);
				}
				catch(Exception e){}
			//System.out.println(s.getArr
			
			
		}
		
	}
		
			
	}

}
