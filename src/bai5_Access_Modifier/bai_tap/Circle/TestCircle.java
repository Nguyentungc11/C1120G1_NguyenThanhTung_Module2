package bai5_Access_Modifier.bai_tap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        circle.setRadius(12.1);
        System.out.println("Radius : "+ circle.getRadius());
        System.out.println("Area : "+ Math.floor(circle.getArea()*100)/100);
    }
}
