package lab1;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input: ");
		String choice = sc.next().toUpperCase();
		
		switch(choice) {
			case "A": {
				System.out.println("Action movie fan");
				break;
			}
			
			case "C":{
				System.out.println("Comedy movie fan");
				break;
			}
			
			case "D":{
				System.out.println("Drama movie fan");
				break;
			}
			default:
				System.out.println("Invalid choice");
		}
	}

}
