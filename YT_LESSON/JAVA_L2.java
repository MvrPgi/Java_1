public class JAVA_L2 {
  public static void main(String[] args) {
    String x ="Water";
    String y ="Kool-Aid";
    String temp;  
    temp = x;
    x = y;
    y = temp;
    System.err.println("X: "+x);
    System.err.println("Y: "+y);
    System.err.println("T: "+temp);


  }
}
