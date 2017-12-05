package test.b_extends_a;

public class B extends A{
    private int varB1 = 200;

    public static void main(String[] args) {
        A linkA = new B();
        B linkB = new B();
//        System.out.println(linkA.varA1);
        System.out.println(linkA.varA2);
        System.out.println(linkB.varB1);
    }

    public int getVarB1() {
        return varB1;
    }

    public void setVarB1(int varB1) {
        this.varB1 = varB1;
    }
}
