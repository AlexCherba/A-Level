package test.test;

public class HashCodeAndEquals {
    public static void main(String[] args) {
        BlackBox object1 = new BlackBox(5, 10);
        BlackBox object2 = new BlackBox(5, 10);
        System.out.println("Equals? " + object1.equals(object2));
        System.out.println("HashCode object1" + object1.hashCode());
        System.out.println("HashCode object2" + object2.hashCode());
        System.out.println("Hashcode = ? " + (object1.hashCode() == object2.hashCode()));
    }
}

class BlackBox {
    int varA;
    int varB;

    BlackBox(int varA, int varB) {
        this.varA = varA;
        this.varB = varB;
    }
}