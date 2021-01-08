package bai4_class_and_object.bai_tap;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    @Override
    public String
    toString() {
        if(isOn()) {
            return "Fan{ " +
                    "Fan is on " +
                    "speed= " + speed +
                    ", on =  " + on +
                    ", radius = " + radius +
                    ", color= '" + color + '\'' +
                    '}';
        }else {
            return "Fan{" +
                    "Fan is off " +
                    "speed = " + speed +
                    ", on = " + on +
                    ", radius =" + radius +
                    ", color = " + color + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan(1,true,10,"yellow");
        Fan fan2 = new Fan(0,false,5,"blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
