package homework;

public class Inheritance {
    public static void main(String[] args) {
        Child obj = new Inheritance().new Child();
        obj.print();
    }

    public class Parent {
        String str = "Parent String";

        public void print(){
            System.out.println("Parent print method");
        }
    }

    public class Child extends Parent{
        String str = "Child String";

        public void print(){
            System.out.println("Child print method");
            super.print();
            System.out.println("Child print Child String: " + str);
            System.out.println("Child print Parent String: " + super.str);
        }
    }
}

