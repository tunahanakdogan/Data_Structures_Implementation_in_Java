
public class Main {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue("Berker", 5);
		q.insert("Kemal", 2);
		q.insert("Elif", 7);
		q.insert("Fatma", 3);
		q.insert("Murat", 6);
		q.insert("Sevgi", 0);
		q.insert("Mustafa", 1);
		q.insert("Merve", 4);
		
		q.showQueue();
		q.removeMaxPriority();
		q.showQueue();
	}

}
