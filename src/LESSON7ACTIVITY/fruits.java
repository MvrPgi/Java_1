package LESSON7ACTIVITY;


public class fruits {
  
  private String  name;
  private String color;
  private int expiration;

fruits() {}
  public fruits(String name, String color, int expiration) {
    this.name = name;
    this.color = color;
    this.expiration = expiration;

  }
  // Getter methods
  public String getname() {
      return name;
  }

  public String getcolor() {
      return color;
  }

  public int getexpiration() {
      return expiration;
  }
}


