import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод
 * дробного числа (типа float), и возвращает введенное значение.
 * Ввод текста вместо числа не должно приводить к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {

    public static float check(String text) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(text);
                Float digit = scanner.nextFloat();
                return digit;
            } catch (InputMismatchException e) {
                System.out.print("\n");
                System.out.println("InputMismatchException! Try again...\n");
                scanner.nextLine();
                continue;
            }
        }
    }

    public static void main(String[] args) {
        float digit = check("Input a float digit: ");
        System.out.println("The digit is: " + digit);
    }
    
}