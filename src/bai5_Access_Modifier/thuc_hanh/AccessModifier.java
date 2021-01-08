package bai5_Access_Modifier.thuc_hanh;

public class AccessModifier {
    public static class A {
        public int data = 40;
        public static void msg() {
            System.out.println("Hello java");
        }
    }
    public static class Simple {
        public static void main(String args[]) {
            A obj = new A();
            System.out.println(obj.data);
            A.msg();
        }
    }
}
