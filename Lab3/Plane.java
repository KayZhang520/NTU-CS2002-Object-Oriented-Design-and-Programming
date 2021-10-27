
public class Plane {
    PlaneSeat[] seat = new PlaneSeat[12];
    int numEmptySeat = 12;

    public Plane(){
        for(int i=0;i<12;i++){
            seat[i] = new PlaneSeat(i+1);
        }
    }
    public void showNumberEmptySeats(){
        System.out.println("This plane has "+ numEmptySeat+ " empty seats.");
    }
    public void showEmptySeats(){
        System.out.println("Following seats are available:");
        for(int i=0;i<12;i++){
            if(!seat[i].isOccupied()){
                System.out.println(seat[i].getSeatId());
            }
        }
    }
    public void showAssignedSeats(boolean bySeatId){
        int[] arr = new int[12];
        for(int i=0;i<12;i++){
            arr[i] = 0;
        }
        for(int i=0;i<12;i++){
            if(seat[i].isOccupied()){
                arr[i] = seat[i].getCustomerId();
            }
        }
        System.out.println("The seat assignments are as follow:");
        if(bySeatId){
            for(int i=0;i<12;i++){
                   if(arr[i]!=0){
                       System.out.println("SeatID " + (i+1) + " assigned to Customer ID " + arr[i]);
                   }     
            }
        }
        else{
            //worst case. loop 12 times
            int smallestIndex;
            for(int j=0;j<12;j++){
                smallestIndex = -1;
                for(int i=0;i<12;i++){
                    if(smallestIndex==-1 && arr[i]!=0)smallestIndex = i;
                    else if(arr[i]!=0 && arr[i]<arr[smallestIndex])smallestIndex=i;
                }
                if(smallestIndex != -1){
                    System.out.println("SeatID " + (smallestIndex+1) + " assigned to Customer ID " + arr[smallestIndex]);
                    arr[smallestIndex] = 0;
                }
            }
        }
    


    }
    public void assignSeat(int seatId, int custId){
        for(int i=0;i<12;i++){
            if(seat[i].getSeatId() == seatId){
                if(!seat[i].isOccupied()){
                    seat[i].assign(custId);
                    System.out.println("Seat Assigned");
                    this.numEmptySeat--;
                }
                else System.out.println("Seat already assigned to a customer.");
                break;
            }
        }
    }

    public void unAssignSeat(int seatId){
        for(int i=0;i<12;i++){
            if(seat[i].getSeatId() == seatId){
                seat[i].unAssign();
                System.out.println("Seat Unassigned!");
                this.numEmptySeat++;
            }
        }
    }
}
