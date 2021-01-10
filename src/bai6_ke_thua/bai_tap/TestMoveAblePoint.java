package bai6_ke_thua.bai_tap;

public class TestMoveAblePoint {
    public static void main(String[] args) {
        MoveAblePoint moveAblePoint = new MoveAblePoint(2,3,4,5);
        System.out.println(moveAblePoint);
        System.out.println("move x,y"+ moveAblePoint.move());
        System.out.println("move x,y"+ moveAblePoint.move());
        System.out.println("move x,y"+ moveAblePoint.move());
    }
}
