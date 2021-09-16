package q1;
import java.util.*;

class VendingMachine{
    public double change = 0;
    public VendingMachine(){

    }
    // get the drink selection, and return the cost of the drink
    public double selectDrink() {
        Scanner sc = new Scanner(System.in);
        int drinkSelection;
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer ($3.00) |");
        System.out.println("|2. Buy Coke ($1.00) |");
        System.out.println("|3. Buy Green Tea ($5.00) |");
        System.out.println("|============================");
        do{
            System.out.println("Please enter selection: ");
            drinkSelection = sc.nextInt();
        } while (drinkSelection<1 || drinkSelection>3);
        sc.close();
        if(drinkSelection == 1){
            return 3;
        }
        else if(drinkSelection == 2){
        	return 1;
        }
        else if(drinkSelection == 3) {
        	return 5;
        }
        return -1;
    }

    // insert the coins and returns the amount inserted
    public double insertCoins(double drinkCost) {
    	System.out.println("Please insert coins:");
    	System.out.println("========== Coins Input ===========");
    	System.out.println("|Enter 'Q' for ten cents input |");
    	System.out.println("|Enter 'T' for twenty cents input|");
    	System.out.println("|Enter 'F' for fifty cents input |");
    	System.out.println("|Enter 'N' for a dollar input |");
    	double total = 0; double insertedAmt = 0;
    	Scanner sc = new Scanner(System.in);
    	char input;
    	while(total<drinkCost) {
    		input = sc.next().charAt(0);
            switch(input){
            case 'Q': 
                insertedAmt = 0.1;
                break;
            case 'T':
            	insertedAmt = 0.2;
                break;
            case 'F':
            	insertedAmt = 0.5;
                break;  
            case 'N':
            	insertedAmt = 1;
                break;  
            }
            total += insertedAmt;
           System.out.println("Coins inserted: " + total);
    	}
    	sc.close();
        return total;
    }

    // check the change and print the change on screen
    public void checkChange(double amount, double drinkCost) {
        double change = amount - drinkCost;
        System.out.println("change: $ " + change);
    }
    
    // print the receipt and collect the drink
    public void printReceipt(){
        System.out.println("Purchase completed.");
    }
}