package lab1;
import java.util.*;
public class P4 {

	public static void main(String[] args) {
		int height, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = sc.nextInt();
		if(height<1)
			System.out.println("invalid height.");
		
		else {
			for(i=1;i<=height;i++) {
				for(j=i;j>0;j--) {
					if(j%2==1)
						System.out.print("AA");
					else
						System.out.print("BB");
				}
				System.out.print(" \r\n");
			}
		}

	}

}
