package homework1;

public class Main {
    
    public static void main(String[] args) {
        CartesianPoint a = new CartesianPoint(5,9);
        CartesianPoint b = new CartesianPoint(12,10);

        Distance distance = new Distance(a,b);
        System.out.println(distance.getDistance());
    }
}
