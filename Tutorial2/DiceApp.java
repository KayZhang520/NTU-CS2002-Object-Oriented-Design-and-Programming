import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please roll the first dice.");
        sc.nextLine();

        dice1.setDiceValue();
        dice1.printDiceValue();

        System.out.println("Please roll the second dice.");
        sc.nextLine();

        dice2.setDiceValue();
        dice2.printDiceValue();  
        
        System.out.println("The total value is: " + (dice1.getDiceValue()+dice2.getDiceValue()));
        sc.close();
    }

}
