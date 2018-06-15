package homework;

/*
* При перегрузке, примитивны могут расширяться к более старшим типам
* */

public class OverloadMethods {

    public static void main(String[] args) {
        OverloadMethods obj = new OverloadMethods();
        obj.method(1);
    }

    private void method(byte byteVar){
        System.out.println("Selected method with byte");
    }
    private void method(short shortVar){
        System.out.println("Selected method with short");
    }
/*
    private void method(int intVar){
        System.out.println("Selected method with int");
    }
*/
    private void method(long longVar){
        System.out.println("Selected method with long");
    }
}
