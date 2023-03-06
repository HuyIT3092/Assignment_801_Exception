import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    static double a;
    static double b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("enter number a: ");
            a = sc.nextDouble();

            System.out.print("enter number a: ");
            b = sc.nextDouble();

            Double result = div(a,b);

            System.out.printf(" a / b = %.3f", result);

        } catch (InputMismatchException e) {
            System.out.println("input is not number!");
            return;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
    public static double div(double aa, double bb) {
        if (bb == 0) {
            throw new ArithmeticException("div is invalid!");
        }
        return aa / bb;
    }
}
