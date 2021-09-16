package q2;
public class Test {
    public static void main(String[] args){
        Point point = new Point(4,5);
        System.out.println(point.toString());

        Circle circle = new Circle(1.0, 4, 5);
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(10.0, 5.0, 4, 5);
        System.out.println(cylinder.toString());       
    }
}
