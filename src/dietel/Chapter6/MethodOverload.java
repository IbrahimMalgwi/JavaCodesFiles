package dietel.Chapter6;

public class MethodOverload {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %.2f%n", square(7.5));
    }

    public static int square(int intValue){
        System.out.printf("%n Called square with integer argument:  %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue){
        System.out.printf("%n Called square with double argument: %.2f%n", doubleValue);
        return doubleValue * doubleValue;
    }
}
