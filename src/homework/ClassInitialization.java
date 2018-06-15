package homework;

/*
поля объекта инициализируются в следующем порядке:

1.Статические поля класса Parent;
2.Статический блок инициализации класса Parent;
3.Статические поля класса Сhild;
4.Статический блок инициализации класса Child;
5.Нестатические поля  класса Parent;
6.Нестатический блок инициализации класса Parent;
7.Конструктор класса Parent;
8.Нестатические поля  класса Сhild;
9.Нестатический блок инициализации класса Сhild;
10.Конструктор класса Сhild.
*/
public class ClassInitialization {

    public static void main(String[] args) {
        Child child = new Child();
    }

    public static class Parent {
        static String pName1 = "Alex";
        String pName2 = "Sa";

        {
            System.out.println("5 Parent variable: " + pName2);
            System.out.println("6 Parent block");
        }

        static {
            System.out.println("1 Parent static variable: " + pName1);
            System.out.println("2 Parent static block");
        }

        Parent() {
            System.out.println("7 Parent constructor");
        }
    }

    public static class Child extends Parent {
        static String cName1 = "Alex";
        String cName2 = "Sa";

        {
            System.out.println("8 Child variable: " + cName2);
            System.out.println("9 Child block");
        }

        static {
            System.out.println("3 Child static variable: " + cName1);
            System.out.println("4 Child static block");
        }

        public Child() {
            System.out.println("10 Child constructor");
        }
    }
}

