import java.util.Scanner;
public class PlaneApp {
    public static void main(String[] args){
        PlaneApp app = new PlaneApp();
        app.start();
    }
    private Plane plane = new Plane();
    public void start(){
        System.out.println("(1)Show number of seats");
        System.out.println("(2)Show the list of empty seats");
        System.out.println("(3)Show the list of seat assignments by seat ID");
        System.out.println("(4)Show the list of seat assignements by customer ID");
        System.out.println("(5)Assign a customer to a seat");
        System.out.println("(6)Remove a seat from assignment");
        System.out.println("(7)Exit");
        int x=0;
        Scanner sc = new Scanner(System.in);
        while(x!=7){
            System.out.println("Please enter the number of your choice");
            x = sc.nextInt();
            int sid, cid;
            switch(x){
                case 1: 
                    plane.showNumberEmptySeats();
                    break;
                case 2:
                    plane.showEmptySeats();
                    break;
                case 3:
                    plane.showAssignedSeats(true);
                    break;
                case 4:
                    plane.showAssignedSeats(false);
                    break;
                case 5:
                    System.out.println("Please enter Seat ID: "); 
                    sid = sc.nextInt();
                    System.out.println("Pease enter Customer ID: ");
                    cid = sc.nextInt();
                    plane.assignSeat(sid, cid);
                    break;
                case 6:
                    System.out.println("Please enter Seat ID: "); 
                    sid = sc.nextInt();
                    plane.unAssignSeat(sid);
                    break;
                case 7:
                    break;
            }
        }
        sc.close();
    }
}
