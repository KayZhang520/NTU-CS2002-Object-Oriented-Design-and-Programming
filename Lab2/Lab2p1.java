import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
 public static void main(String[] args)
 {
int choice;
Scanner sc = new Scanner(System.in);
do {
System.out.println("Perform the following methods:");
System.out.println("1: multiplication test");
System.out.println("2: quotient using division by subtraction");
System.out.println("3: remainder using division by subtraction");
System.out.println("4: count the number of digits");
System.out.println("5: position of a digit");
System.out.println("6: extract all odd digits");
System.out.println("7: quit");
choice = sc.nextInt();
switch (choice) {
 case 1: mulTest();
 break;
 case 2: 
	 System.out.println(divide(25, 7));
 break;
 case 3: /* add modulus() call */
	 int a = sc.nextInt();
	 int b = sc.nextInt();
	 System.out.println(modulus(a, b));
 break;
 case 4: /* add countDigits() call */
	 int arg = sc.nextInt();
	 int x = countDigits(arg);
	 if(x<0)System.out.println("error!, negative number!");
	 else System.out.println("Number of digits: x");
 break;
 case 5: /* add position() call */
	 int arg3 = sc.nextInt();
	 int arg4 = sc.nextInt();
	 System.out.println("result is : " + position(arg3, arg4));
 break;
 case 6: /* add extractOddDigits() call */
	 	int arg5 = sc.nextInt();
	 	long ans = extractOddDigits(arg5);
	 	if(ans == -2)System.out.println("error msg!");
	 	else System.out.println("result is : " + ans);
 break; 

 case 7: System.out.println("Program terminating �.");
}
} while (choice < 7);
 }
 /* add method code here */
 public static void mulTest() {
	 Scanner sc = new Scanner(System.in);
	 int ans, score;
	 score = 0;
	 Random rand = new Random();
	 for(int x=0; x<5; x++) {
		 int a, b;
		 a = rand.nextInt((9 - 1) + 1) + 1;
		 b = rand.nextInt((9 - 1) + 1) + 1;
		 System.out.println("How much is " + a + " times " + b + "?");
		 ans = sc.nextInt();
		 if(ans == a*b)score++;
	 }
	 System.out.println(score + " out of 5 is correct.");
	 sc.close();
 }
 public static int divide(int m, int n) {
	 int sum = m;
	 int count = 0;
	 while(sum>=n) {
		 count++;
		 sum-=n;
	 }
	 return count;
 }
 public static int modulus(int m, int n) {
	 int sum = m;
	 while(sum>=n) {
		 sum-=n;
	 }
	 return sum;
 }
 public static int countDigits(int n) {
	 if(n<0)return -1;
	 int digits = 0;
	 int num = n;
	 while(num!=0) {
		num=num/10;
		digits++;
	 }
	 return digits;
 }
 public static int position(int n, int digit) {
	 int digits = countDigits(n);
	 int sum = n;
	 int lastDigit;
	 int digitCount = 0;
	 for(int x = digits;x>0;x--) {
		 lastDigit = sum%10;
		 sum = sum/10;
		 digitCount++;
		 if(lastDigit == digit)return digitCount;
	 }
	 return -1;
 }
 public static long extractOddDigits(long n) {
	 if(n<0)return -2;
	 long num = n;
	 int weight = 1;
	 long newNum = 0;
	 int lastDigit;
	 while(num!=0) {
		 lastDigit = (int)num%10;
		 num = num/10;
		 if(lastDigit%2!=0) {
			 newNum+=weight*lastDigit;
			 weight *= 10;
		 }
	 }
	 if(weight==1)return -1;
	 
	 return newNum;
	 
 }
}
