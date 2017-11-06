package CodeInClass;

/*142. Треугольник задан координатами своих вершин. Составить программу вычисления его площади.*/
public class SquareTriangle {
    public static void main(String[] args) {
        int x1 = 2, x2 = 4, x3 = 10, y1 = 3, y2 = 6, y3 = 4;
        double lengthA, lengthB, lengthC;
        lengthA = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        lengthB = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        lengthC = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
        System.out.println(lengthA + " " + lengthB + " " + lengthC);

        double halfPerimeter = (lengthA + lengthB + lengthC) / 2;

        double squareTr = Math.sqrt(halfPerimeter * (halfPerimeter - lengthA) * (halfPerimeter - lengthB) * (halfPerimeter - lengthB));
        System.out.println(squareTr);
    }
}
