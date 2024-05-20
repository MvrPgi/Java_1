package LESSON7ACTIVITY;

public class MyClass {

  public static void main(String[] args) {
    cars c = new cars ("Toyota", "Corolla", 2020);
    System.err.println("--------------------------------");
    // Using getter methods to access private attributes
    System.out.println(c.getBrand());
    System.out.println(c.getModel());
    System.out.println(c.getYear());

    
    fruits f = new fruits("apple", "red", 5);
    System.err.println("--------------------------------");
    // Using getter methods to access private attributes
    System.out.println(f.getname());
    System.out.println(f.getcolor());
    System.out.println(f.getexpiration());
  
    animal a = new animal("Dog", "Brown", 5);
   
    System.err.println("--------------------------------");
    // Using getter methods to access private attributes
    System.out.println(a.getname());
    System.out.println(a.getcolor());
    System.out.println(a.getage());
  }
  } 

 