
public class PriorityQueue {
	public Node headNode;
	
	
	public PriorityQueue(String data, int priority) {
		headNode= new Node();
		headNode.setData(data);
		headNode.setPriority(priority);
		headNode.setNext(null);
		
		
		
	}
	
	
	public Node getMaxPriority() {
		return headNode;
	}
	public Node removeMaxPriority() {
		
		headNode = headNode.getNext();
		return headNode;
	}
	
	public boolean isEmpty() {
		if(headNode == null) 
			return true;
		else return false;
	}
	
	public Node insert(String data, int priority) {;
		Node temp = new Node();
		temp.setData(data);
		temp.setPriority(priority);
		
		if(headNode.getPriority() > priority) {
			temp.setNext(headNode);
			headNode = temp;
		}
		else{
			Node start = headNode;
			while(start.getNext() != null &&  start.getNext().getPriority() < priority) {
				start = start.getNext();
				
			}
			temp.setNext(start.getNext());
			start.setNext(temp);
		}
		return headNode;
	}
	public void showQueue() {
		Node start = headNode;
		do {
			System.out.println("Data: "+ start.getData());
			System.out.println("Priority: " + start.getPriority() );
			start = start.getNext();
			
		}while(start.getNext() != null);
			
		
	}
	
}
