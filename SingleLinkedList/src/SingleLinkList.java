
public class SingleLinkList {
	private Node head;
	
	public SingleLinkList() {
		head = null;
	}
	//Add new elements to end of the list.
	public void insert(Object dataToAdd) {
		Node newNode = new Node(dataToAdd);
		if(head == null)
			head = newNode;
		else {
			Node temp = head;
			while(temp.getLink()!= null) {
				temp = temp.getLink();
			}
			temp.setLink(newNode);
		}
	}
	//Add new elements in order by their integer values. Smaller to larger.
	public void insertByOrder(Object dataToAdd) {
		Node temp = head;
		Node previous=null;
		while(temp!=null && (Integer)dataToAdd > (Integer)temp.getData()) {
			previous = temp;
			temp=temp.getLink();			
		}
		if(temp==null) {
			Node newNode = new Node(dataToAdd);
			previous.setLink(newNode);
		}
		else {
			Node newNode = new Node(dataToAdd);
			newNode.setLink(temp);
			previous.setLink(newNode);
		}
	}
	
	public void delete(Object dataToDelete) {
		if(head == null)
			System.out.println("Linked list is empty");
		else {
			while((Integer)head.getData() == (Integer)dataToDelete)
				head=head.getLink();
			Node temp = head;
			Node previous = null;
			while(temp!= null) {
				if((Integer)temp.getData() == (Integer)dataToDelete) {
					previous.setLink(temp.getLink());
					temp = previous;
				}
				previous = temp;
				temp=temp.getLink();
			}
		}
	}
	
	
	//Returns the size of the list.
	public int size() {
		int count = 0;
		if(head==null)
			System.out.println("Single Linked List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				count++;
				temp= temp.getLink();
			}
		}
		return count;
	}
	//If the elements is in the list returns true, otherwise return false.
	public boolean search(Object dataToSearch) {
		boolean flag = false;
		Object item = dataToSearch;
		if(head==null)
			System.out.println("Single Linked List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				if(item == temp.getData())
					flag = true;
				temp = temp.getLink();
			}
		}
		return flag;
	}
	
	//Print list on the console.
	public void display() {
		if(head == null)
			System.out.println("Single Linked List is empty");
		else {
			Node temp = head;
			System.out.print("Randomly generated single linked list: ");
			while(temp != null) {
				System.out.print(temp.getData());
				temp = temp.getLink();
			}
		}
		System.out.println();
	}
	public void barGraph() {
		int aCount = 0;
		int bCount = 0;
		int cCount = 0;
		int dCount = 0;
		int eCount = 0;
		if(head == null)
			System.out.println("Single Linked List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				if((char)temp.getData() == 'A') 
					aCount++;			
				else if((char)temp.getData() == 'B') 
					bCount++;	
				else if((char)temp.getData() == 'C') 
					cCount++;
				else if((char)temp.getData() == 'D') 
					dCount++;				
				else if((char)temp.getData() == 'E') 
					eCount++;
				
				temp = temp.getLink();
			}
		}
		System.out.println("Bar Graph");
		System.out.print("A ");
		for (int i = 0; i < aCount; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("B ");
		for (int i = 0; i < bCount; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("C ");
		for (int i = 0; i < cCount; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("D ");
		for (int i = 0; i < dCount; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.print("E ");
		for (int i = 0; i < eCount; i++) {
			System.out.print("*");
		}
	}
}
