public class PlaneSeat{
    int seatId;
    boolean assigned = false;
    int customerId = 0;

    public PlaneSeat(int seatId){
        this.seatId = seatId;
    }
    
    public int getSeatId(){
        return this.seatId;
    }
    public int getCustomerId(){
        return this.customerId;
    }
    public boolean isOccupied(){
        return this.assigned;
    }
    public void assign(int cust_id){
        assigned = true;
        customerId = cust_id;
    }
    public void unAssign(){
        assigned = false;
        customerId = 0;
    }
}