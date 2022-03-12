
public class LinkedQueue {
	private Node front;
	private Node rear;
	private int numberElements;
	public LinkedQueue() {
		front = null;
		rear=null;
		numberElements = 0;
	}
	
	public void enqueue(Object item) {
		if(front==null) {
			Node newNode = new Node(item);
			rear = newNode;
			front = newNode;
		}
		else {
			Node newNode = new Node(item);
			rear.setLink(newNode);
			rear=newNode;
		}
		numberElements++;
	}
	
	public Object dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		else {
			Object data = front.getData();
			front = front.getLink();
			numberElements--;
			return data;
		}
	}
	
	
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return null;
		}
		else 
			return front.getData();
		
	}
	
	public boolean isEmpty() {
		return front == null;
	}
	public int size() {
		return numberElements;
	}
	
	public void median() {
		Node temp = front;
		int median = 0;
		int number1 = 0;
		int number2 = 0;
		if(numberElements %2 == 0) {
			for (int i = 0; i < numberElements /2+1 ; i++) {
				if(i == (numberElements /2)-1)
					number1 = (int)temp.getData();
				else
					number2 = (int)temp.getData();
				temp = temp.getLink();
			}
			median = (number1+number2) /2;
		}
		else {
			for (int i = 0; i < numberElements /2 ; i++) {
				temp=temp.getLink();
			}
			median = (int)temp.getData();
		}
		
			
		System.out.println("Median of the queue: "+ median);;
	}
	
}
