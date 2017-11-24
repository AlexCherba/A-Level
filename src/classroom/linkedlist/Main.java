package linkedlist;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.addLast("Hello Generics! 1");
        myList.addLast("Hello Generics! 2");
        myList.addLast("Hello Generics! 3");

        System.out.println(myList);
    }

}
