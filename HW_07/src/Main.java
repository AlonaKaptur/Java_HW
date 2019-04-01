import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] array = {new Rectangle("blue", 6, 7),
                new Rectangle("brown", 4, 7), new Rectangle("red", 2, 5),
                new Rectangle("black", 7, 6), new Rectangle("white", 4, 3),
                new Circle("gray", 2), new Circle("red", 5),
                new Circle("black", 9), new Triangle("green", 12, 3, 9),
                new Triangle("white", 7, 4, 6)};
        printFigures(array);
        System.out.println("Calculate figures area: " + getFiguresArea(array));

        System.out.println("Figures area: " + Arrays.toString(getEachFiguresArea(array)));

    }

    public static void printFigures(Shape[] array) {
        for (Shape shape : array) {
            System.out.println(shape.toString());
        }
        System.out.println();
    }


    public static double getFiguresArea(Shape[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i].calcArea();
        }
        return result;
    }


    public static double[] getEachFiguresArea(Shape[] array) {
        double rectangle = 0;
        double circle = 0;
        double triangle = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Rectangle) {
                rectangle += array[i].calcArea();
            } else if (array[i] instanceof Circle) {
                circle += array[i].calcArea();
            } else if (array[i] instanceof Triangle) {
                triangle += array[i].calcArea();

            }
        }
        return new double[]{rectangle, circle, triangle};
    }
}
