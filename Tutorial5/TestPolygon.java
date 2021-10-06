public class TestPolygon {
    Polygon p;    
    public TestPolygon(Polygon p){
        this.p = p;
    }
    public static void main(String[] args){
        Triangle t1 = new Triangle("triangle1", 5, 5);
        TestPolygon testObj = new TestPolygon(t1);
        testObj.printArea();
    }
    public void printArea(){
        System.out.println("This polygon has an area of "+ p.calArea());
    }
}
