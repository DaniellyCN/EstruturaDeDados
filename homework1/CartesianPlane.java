package homework1;

public class CartesianPlane {
  private CartesianPoint a;
  private CartesianPoint b;
  
  public CartesianPlane(CartesianPoint a, CartesianPoint b) {
    this.a = a;
    this.b = b;
  } 

  public double getDistance() {
    return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
  }
}
