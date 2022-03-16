
public class DoubleLinkedList {
	private Node head;
	private Node tail;
	public DoubleLinkedList() {
		head = null;
		tail = null;
	}
	public void add(Object dataToAdd) {
		if(head == null && tail == null) {
			Node newNode = new Node(dataToAdd);
			head = newNode;
			tail = newNode;
		}
		else {
			Node newNode = new Node(dataToAdd);
			newNode.setPrev(tail);
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	public int size() {
		int count = 0;
		Node temp = head;
		while(temp!=null) {
			count++;
			temp=temp.getNext();
		}
		return count;
	}
	public void displayHeadToTail() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.getData()+ " ");
			temp=temp.getNext();
		}
	}
	public void displayTailToHead() {
		Node temp = tail;
		while(temp!= null) {
			System.out.print(temp.getData()+ " ");
			temp=temp.getPrev();
		}
	}
	public void swap(int number) {
		Node temp = head;
		Object data1= null;
		Object data2= null;
		int count= 0;
		while(temp!=null) {
			if(count==number-1)
				data1 = temp.getData();
			temp = temp.getNext();
			if(count== 8-number)
				data2=temp.getData();
			count++;
		}
		if(number == 1 || number == 9) {
			data1 = tail.getData();
			tail.setData(head.getData());
			head.setData(data1);
		}
		else {
			temp = head;
			for (int i = 0; i < number-1; i++) {
				temp=temp.getNext();
				if(i == number-2)
					temp.setData(data2);
			}
			
			temp = head;
			for (int i = 0; i < 9-number; i++) {
				temp=temp.getNext();
				if(i == 8-number)
					temp.setData(data1);
			}
		}
		
	}
}
