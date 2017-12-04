package test;


/*
    Порядок инициализации объекта в Java
*/
public class StepByStep {


    public static void main(String[] args) {
        System.out.println("out method main");
//        A objectA = new A();
//        System.out.println();
//        B.print();
//        B.print();
//        System.out.println("-------");
        B objectB1 = new B();
        System.out.println("-------");
        B objectB2 = new B();
    }
}

class A {
    static { System.out.println("a1 "); }
    { System.out.println("a2 "); }
    A(){  System.out.println("a3 ");  };
}
class B extends A {
    static { System.out.println("b1 "); }
    { System.out.println("b2 "); }
    B(){ System.out.println("b3 ");  };

    static void print(){
        System.out.println("b4 from static method");
    }

}
