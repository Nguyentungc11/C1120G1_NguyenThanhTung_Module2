package test;

public class staff {
  protected String name;
  protected int age;

    public staff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getL(){
        return 500;
    }
}


