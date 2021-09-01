package lab1;
import java.util.*;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int starting, ending, increment, i;
		
		System.out.println("starting: ");
		starting = sc.nextInt();
		
		System.out.println("ending: ");
		ending = sc.nextInt();
		
		System.out.println("increment: ");
		increment = sc.nextInt();
		
		if(ending<starting)
			System.out.println("invalid indexes.");
		
		else {
			System.out.println("US$         S$");
			System.out.println("--------------");
			//for
			for(i=starting;i<=ending;i+=increment) {
				if(i>9)
					System.out.println(i + "          " + i*1.82);
				else
					System.out.println(i + "           " + i*1.82);
				}
				
			//while
			System.out.println("US$         S$");
			System.out.println("--------------");
			i=starting;
			while(i<=ending) {
				if(i>9)
					System.out.println(i + "          " + i*1.82);
				else
					System.out.println(i + "           " + i*1.82);
				i+=increment;
			}
			
			//do-while
			System.out.println("US$         S$");
			System.out.println("--------------");
			i=starting;
			do {
				if(i>9)
					System.out.println(i + "          " + i*1.82);
				else
					System.out.println(i + "           " + i*1.82);
				i+=increment;
			}
			while(i<=ending);
		}
	}		
}
