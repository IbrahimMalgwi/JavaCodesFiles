package dietel.Chapter6;

import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("X1: ");
        double x1 = input.nextDouble();

        System.out.print("Y1: ");
        double y1 = input.nextDouble();

        System.out.print("X2: ");
        double x2 = input.nextDouble();

        System.out.print("Y2: ");
        double y2 = input.nextDouble();
        input.close();

        System.out.printf("%nDistance between the points (%.1f, %.1f) (%.1f, %.1f) is %.1f%n", x1, y1, x2, y2,
                distance(x1, y1, x2, y2));
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
