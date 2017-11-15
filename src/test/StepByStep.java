public class StepByStep {


    public static void main(String[] args) {
        System.out.println("out method main");
//        A objectA = new A();
//        System.out.println();
        B objectB = new B();
    }
}

class A {
    static { System.out.print("a1 "); }
    { System.out.print("a2 "); }
    A(){  System.out.print("a3 ");  };
}
class B extends A {
    static { System.out.print("b1 "); }
    { System.out.print("b2 "); }
    B(){ System.out.print("b3 ");  };
}
