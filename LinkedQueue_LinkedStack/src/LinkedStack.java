
public class LinkedStack {
	private Node top;
	private int numberElements;
	public LinkedStack() {
		top = null;
		numberElements = 0;
	}
	
	public void push(Object item) {
		Node newNode = new Node(item);
		newNode.setLink(top);
		top = newNode;
		numberElements++;
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			Object data = top.getData();
			top=top.getLink();
			numberElements--;
			return data;
		}
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		else {
			return top.getData();
		}
	}
	public boolean isEmpty() {
		return top == null;
	}
	public int size() {
		return numberElements;
	}

}
