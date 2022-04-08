package datastructure;

public class Queue {
	
	int size=4, front=0, rear=0;
	int [] Que=new int[size];
	
	public  boolean isFull() {
		if (rear==size)
			return true;
		else
		return false;
	}
	
	public  boolean isEmpty() {
		if (rear==front)
			return true;
		else
		return false;
	}

	public  void enQue(int ele) {
		if (isFull())
			System.out.println("Que is full");
		else {
			Que[rear]=ele;
			rear++;
			display();
		}
	}
		
		public  void deQue() {
			if (isEmpty())
				System.out.println("Que is empty");
			else {
				for (int i=0;i<rear-1;i++)
					Que[i]=Que[i+1];
				rear--;
				display();
				}			
		}
		public  void display() {
			for (int i=front; i<rear; i++)
				System.out.print(Que[i]+" ");
			System.out.println();
		}
			
}


