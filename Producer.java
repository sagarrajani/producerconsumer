
public class Producer implements Runnable {
    
	private Shared s;
	private boolean k=true;
	
	public Producer(Shared s)
	{
		
		this.s=s;
	}
	public void run() {
		while(k){
	
		int t=s.getSize();
		int arr[]=s.getArray();
		if(t==9)
		{
			try{
				Thread.sleep(5000);
				}
				catch(Exception e){}
		
			
		}
		else{
			arr[++t]=1;
			System.out.println("Produced");
			s.setSize(t);
			
			s.setArray(arr);
			System.out.println(s.getSize());
			try{
				Thread.sleep(1000);
				}
				catch(Exception e){}
			
		}
		
	
		
			
	}
	

}
}
