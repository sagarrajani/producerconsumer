
public class MAIN {

	public static void main(String[] args) {
		
		Shared s=new Shared();
		EatingArea ea=new EatingArea(s);
		Kitchen k=new Kitchen(s);
		Thread t1=new Thread(ea);
		Thread t2=new Thread(k);
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(Exception e){}

	}

}
