import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		while(true) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Please enter a number between 1 and 9 (Enter 0 to exit): ");
			
			try {
				int number = scn.nextInt();
				if(number < 0 || number > 9) {
					System.out.println("Invalid Input!!! Please enter a number between 1 and 9");
				}
				else if(number == 0)
					break;
				else {
					DoubleLinkedList dll = new DoubleLinkedList();
					dll.add(10);
					dll.add(20);
					dll.add(30);
					dll.add(40);
					dll.add(50);
					dll.add(60);
					dll.add(70);
					dll.add(80);
					dll.add(90);
									
					System.out.print("Double linked list head to tail: ");
					dll.displayHeadToTail();
					System.out.println();
					System.out.print("Double linked list tail to head: ");
					dll.displayTailToHead();
					System.out.println();
					System.out.print("Size of the double linked list: ");
					System.out.println(dll.size());					
					System.out.print("Double linked list after the swap operation: ");
					dll.swap(number);
					dll.displayHeadToTail();
				
				}
			} catch (Exception e) {
				System.out.println("Invalid Input!!! Please enter a number between 1 and 9 ");
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
