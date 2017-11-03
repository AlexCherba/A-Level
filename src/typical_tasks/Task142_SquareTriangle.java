package typical_tasks;

/*142. Треугольник задан координатами своих вершин. Составить программу вычисления его площади.*/

public class Task142_SquareTriangle {

    public static void main(String[] args) {
        int x1 = 2,  y1 = -3;
        int x2 = 1,  y2 = 1;
        int x3 = -6, y3 = 5;

        method1(x1, y1, x2, y2, x3, y3); // Обычный способ
        method2(x1, y1, x2, y2, x3, y3); // Формула Герона
    }

    private static void method1(int x1, int y1, int x2, int y2, int x3, int y3) {
        double squareTr = Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2;
        System.out.println("S1 = " + squareTr);
    }

    private static void method2(int x1, int y1, int x2, int y2, int x3, int y3) {
        double lengthA, lengthB, lengthC;
        lengthA = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        lengthB = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
        lengthC = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double halfPerimeter = (lengthA + lengthB + lengthC) / 2;
        double squareTr = Math.sqrt(halfPerimeter * (halfPerimeter - lengthA) * (halfPerimeter - lengthB) * (halfPerimeter - lengthC));
        System.out.println("S2 = " + squareTr);
    }

}
