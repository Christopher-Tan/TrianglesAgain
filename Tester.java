public class Tester {
    public static void main(String[] args) {
        Point v1 = new Point(0,0);
        Point v2 = new Point(2,2);
        //distanceTo
        System.out.println(v1.distanceTo(v2));
        //equals
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(new Point(0,0)));
        //triangles
        Point v3 = new Point(1,5);
        Triangle t1 = new Triangle(v1, v2, v3);
        Triangle t2 = new Triangle(0,5,2,6,5,1);
    }
}