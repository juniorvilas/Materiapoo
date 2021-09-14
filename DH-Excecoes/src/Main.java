
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2, divisao;
        try {
            System.out.println("Primeiro número");
            num1=scanner.nextInt();
            System.out.println("Divisor");
            num2=scanner.nextInt();

            divisao = num1 / num2;
            System.out.println(divisao);
        }
        catch (InputMismatchException e)
        {
            System.err.println("Error na entrada");
        }
        catch (ArithmeticException e)
        {
            System.err.println("Error - divisão por zero");
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }

    }
}