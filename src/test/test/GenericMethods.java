package test;

import java.util.ArrayList;
import java.util.List;

class GenericMethods {
    public static <T> void fill(List<T> list, T val) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}

class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        System.out.println("Список до обработки дженерик-методом: " + intList);
        GenericMethods.fill(intList, 0);
        System.out.println("Список после обработки дженерик-методом: "
                + intList);
    }
}