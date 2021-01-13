package test;

public class Director extends staff {
    public Director() {
    }

    public Director(String name, int age) {
        super(name, age);
    }

    public int getL(){
        return 1000;
    }
    public void getTen(){
        System.out.println("Trưởng phòng: hung");
    }
}
