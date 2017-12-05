package test.b_extends_a;

public class Main {
    public static void main(String[] args) {
        A linkA = new B();
        B linkB = new B();
        System.out.println(linkA.varA2);
//        System.out.println(linkB.varB1);
    }
}
