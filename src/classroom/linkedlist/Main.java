package classroom.linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.addLast("Hello Generics! 1");
        myList.addLast("Hello Generics! 2");
        myList.addLast("Hello Generics! 3");
        myList.addLast("Hello Generics! 4");
        myList.addLast("Hello Generics! 5");

        System.out.println("First element: "+myList.getFirst()+"\nLast element: "+myList.getLast() + "\nSize: " + myList.getSize());
        System.out.println("---------------");

        myList.removeFirst();
        System.out.println("First element: "+myList.getFirst()+"\nLast element: "+myList.getLast() + "\nSize: " + myList.getSize());
        System.out.println("---------------");
        myList.removeLast();
/*        System.out.println("First element: "+myList.getFirst()+"\nLast element: "+myList.getLast() + "\nSize: " + myList.getSize());
        System.out.println("---------------");
        myList.clear();
        System.out.println("First element: "+myList.getFirst()+"\nLast element: "+myList.getLast() + "\nSize: " + myList.getSize());
        System.out.println("---------------");
*/
        System.out.println(myList.get(5));
        System.out.println(myList.get(4));
        System.out.println(myList.get(3));
        System.out.println(myList.get(2));
        System.out.println(myList.get(1));
        System.out.println(myList.get(0));
    }

}
