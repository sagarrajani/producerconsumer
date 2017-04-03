
public class Shared {
	
	int items[]={0,0,0,0,0,0,0,0,0,0};
	int front=-1,rear=-1;
	public synchronized void setItems(int []items)
	{
		this.items=items;
	}
	public synchronized void setFront(int front)
	{
		this.front=front;
	}
	public synchronized void setRear(int rear)
	{
		this.rear=rear;
	}
	public synchronized int[] getItems()
	{
		return items;
	}
	public synchronized int getFront()
	{
		return front;
	}
	public synchronized int getRear()
	{
		return rear;
	}
	public synchronized int isFull()
	{
		if((front==0&&rear==9)||(rear==front-1)||(rear==0&&front==9))
		{
			return 1;
		}
		return 0;
	}
	public synchronized void add(int no)
	{
		if(rear==9){
			items[0]=no;
			rear=0;
			
		}
		else if(front==-1&&rear==-1)
		{ 
		      front=rear=0;
		      items[rear]=no;
		}
		else{
			rear++;
			items[rear]=no;
		}
	}
  public synchronized int isEmpty()
  {
	if(front==-1&&rear==-1)
	{
		return 1;
	}
	 return 0; 
  } 
  public synchronized int remove()
  {
	  int k=front;
	  if(front==9)
	  {   
		  front=0;
		 
	  }
	  else if(front==rear)
	  {
		  front=rear=-1;
		  
	  }
	  else
	  {
	  front++;
	  }
	  return items[k];
	  
	  
  }

}
