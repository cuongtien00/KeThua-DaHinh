package Point;

public class Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(2,3,5);
        for (float a: point3D.getXYZ()){
            System.out.println(a);
        }
    }
}
