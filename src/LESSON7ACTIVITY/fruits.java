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
  // Setter methods
  public void setName(String name) {
    this.name = name;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setExpiration(int expiration) {
    this.expiration = expiration;
  }
}



