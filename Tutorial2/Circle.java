import java.util.Scanner;

class Circle{
    public static void main(String[] args) {
        System.out.println("==== Circle Computation =====\n|1. Create a new circle |\n|2. Print Area |\n|3. Print circumference |\n|4. Quit |\n=============================");
        int option; boolean haveCircle = false;
        Scanner Sc = new Scanner(System.in);
        option = Sc.nextInt();
        Circle c1 = null;
        while(option!=4){
            option = Sc.nextInt();
            if(option==1){
                System.out.println("Enter the radius to compute the area or circumference");
                double r = Sc.nextDouble();
                c1 = new Circle(r);
                haveCircle = true;
            }
            else if(option == 2){
                if(haveCircle)System.out.println("No circle was created!");
                else{
                    c1.printArea();
                }
            }
            else if(option == 3){
                if(haveCircle)System.out.println("No circle was created!");
                else{
                    c1.printCircumference();
                }
            }
        }
        Sc.close();
    }
    private double radius;
    private static final double PI = 3.14159;//static variables are accessible in non-static methods as well.
    public Circle(double r){
        this.radius = r;
        
    }
    public void setRadius(double r){
        this.radius = r;
    }
    public double getRadius(){
        return this.radius;
    }
    public double area(){
        return PI*radius*radius;
    }
    public double circumference(){
        return 2*PI*radius;
    }
    public void printArea(){
        System.out.println("Radius: " + radius); 
        System.out.println("Area: " + area()); 
    }
    public void printCircumference(){
        System.out.println("Radius: " + radius); 
        System.out.println("Circumference: " + circumference()); 
    }
}