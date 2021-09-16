package q2;
public class Circle extends Point{
    private double radius;
    Circle(double radius, int x, int y){
        super(x, y);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "circle's radius is "+radius+"; its center is located at "+super.toString()+"; and its area is "+this.area();
    }
}
