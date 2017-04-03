
public class ProdCust {
	 
  
	public static void main(String[] args)
	{
		
		Shared s=new Shared();
		Producer p=new Producer(s);
		Cunsumer c=new Cunsumer(s);
		Thread t1=new Thread(p);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e){}
		}

	}


