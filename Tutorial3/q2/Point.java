package q2;
public class Point{
    protected int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "[" + x + "," + y + "]"; 
    };
    public void setPoint(int x, int y){

    };
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}
