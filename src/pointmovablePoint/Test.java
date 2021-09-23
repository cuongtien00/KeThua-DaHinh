package pointmovablePoint;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(5,7);
        for(float a:point.getXY()){
            System.out.println(a);
        }
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(3,6);
       float[] arr = movablePoint.getSpeed();
        for(float a:arr){
            System.out.println(a);
        }
        System.out.println(movablePoint);
    }
}
