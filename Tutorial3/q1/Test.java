package q1;

//improvements: drink Class
//improvement 2: private all methods and use a start() method to call the other methods

public class Test {
    public static void main(String[] args){
    	VendingMachine v = new VendingMachine();
    	double drinkCost = v.selectDrink();
    	double amount = v.insertCoins(drinkCost);
    	v.checkChange(amount, drinkCost);
    	v.printReceipt();
    }
}
