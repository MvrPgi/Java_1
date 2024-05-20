package LESSON7ACTIVITY;


public class animal {
  
    private String  name;
    private String color;
    private int age;
  
    animal() {}
    public animal(String name, String color, int age) {
      this.name = name;
      this.color = color;
      this.age = age;
    }
    public void setname(String name) {
        this.name = name;
    }
  
    public void setcolor(String color) {
        this.color = color;
    }
  
    public void setage(int age) {
        this.age = age;
    }
  
    // Getter methods
    public String getname() {
        return name;
    }
  
    public String getcolor() {
        return color;
    }
  
    public int getage() {
        return age;
    }
    // Setter methods
    public void setName(String name) {
      this.name = name;
    }

    public void setColor(String color) {
      this.color = color;
    }

    public void setAge(int age) {
      this.age = age;
    }
  }
  
  
  

