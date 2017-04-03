
public class Shared {
	private int items[]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	private int size=-1;
    public synchronized void setArray(int []items)
    {
    	this.items=items;
    
    }
    public synchronized void setSize(int size)
    {
    	this.size=size;
    }
    public synchronized int[] getArray()
    {
    	return items;
    }
    public synchronized int getSize()
    {
    	return size;
    }
}
