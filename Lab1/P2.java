package lab1;
import java.util.*;
public class P2 {

	public static void main(String[] args) {
		int salary, merit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary: ");
		salary = sc.nextInt();
		System.out.println("Enter merit: ");
		merit=sc.nextInt();
		if(salary>=500 && salary<=600)
			System.out.println("Grade C");
		else if(salary>600 && salary<649) {
			if(merit<10)
				System.out.println("Grade C");
			else
				System.out.println("Grade B");
		}
		else if(salary>=649 && salary<=700){
			System.out.println("Grade B");
		}
		else if(salary>700 && salary<=799) {
			if(merit<20)
				System.out.println("Grade B");
			else
				System.out.println("Grade A");
		}
		else if(salary>799)
			System.out.println("Grade A");
	}

}
