package q2;
public class Cylinder extends Circle{
    private double height;
     public Cylinder(double height, double radius, int x, int y){
        super(radius, x, y);
        this.height = height;
     }
     public double getHeight(){
         return this.height;
     }
     public void setHeight(double height){
         this.height = height;
     }
     public double area(){
        return super.area()*2+Math.PI*this.height;
     }
}
