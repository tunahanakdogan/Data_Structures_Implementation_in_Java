import java.util.Random;

public class Main {

	public static void main(String[] args) {
		SingleLinkList list = new SingleLinkList();
		Random random = new Random();
		for (int i = 0; i < 16; i++) {
			int randomNumber = random.nextInt(5);
			if(randomNumber == 0) {
				list.insert('A');
			}
			else if(randomNumber == 1) {
				list.insert('B');
			}
			else if(randomNumber == 2) {
				list.insert('C');
			}
			else if(randomNumber == 3) {
				list.insert('D');
			}
			else if(randomNumber == 4) {
				list.insert('E');
			}
		}
		
		list.display();
		list.barGraph();
	
		
		
	}

}
