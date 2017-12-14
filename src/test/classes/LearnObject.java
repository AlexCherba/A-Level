package test.classes;

import java.util.*;

/*
Class Object
*/
public class LearnObject {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println("o1 is " + o1 + " " + o1.hashCode() +
                "\no2 is " + o2 + " " + o2.hashCode()
        );
        System.out.println(o1.equals(o2) ? "Equals" : "Not equals");

        String s = "Hello";
        LearnObject l = new LearnObject();
        System.out.println(l.getClass());

        Noda noda1 = new Noda();
        Noda noda2 = new Noda();
        System.out.println(noda1.hashCode() + " - " + noda2.hashCode());
        noda1.name = "S10";
        noda1.name = "W20";
        System.out.println(noda1.hashCode() + " - " + noda2.hashCode());

        String s1 = "Hello!!!";
        String s2 = "Hello!!!";
        Integer i1 = 24;
        Integer i2 = 24;
        System.out.println(s1.hashCode() + " - " + s2.hashCode());
        System.out.println(i1.hashCode() + " - " + i2.hashCode());
        System.out.println(i1 + " - " + i2);

        Integer i3 = i1;
        i1 = 12;
        System.out.println(i3 + " " + i1);


        new Scanner(System.in).nextLine();
        for (Integer i = 0; i < 100000; i++) {
            for (Integer key : MapInteger.getRandomKeys())
                MapInteger.put(key, i);
        }
        new Scanner(System.in).nextLine();

    }

}

class Noda {
    String name;
    int age;
}

class MapInteger {
    static Map<Integer, Set<Integer>> subSets = new HashMap<Integer, Set<Integer>>();

    public static void put(Integer key, int value) {
        if (!subSets.containsKey(key)) subSets.put(key, new HashSet<Integer>());
        subSets.get(key).add(value);
    }

    public static Collection<Integer> getRandomKeys() {
        List<Integer> vals = new ArrayList<Integer>();
        for (int i = 0; i < (int) (Math.random() * 500); i++) {
            vals.add((int) (Math.random() * 1000));
        }
        return vals;
    }

    public static void main(String[] args) {
    }
}
