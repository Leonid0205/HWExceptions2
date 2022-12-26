import java.util.Scanner;

/**
 * Разработайте программу, которая выбросит Exception,
 * когда пользователь вводит пустую строку. Пользователю
 * должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class Task2 {
    public static String check(String text) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(text);
                String result = scanner.nextLine();
                if (result == null || result.isEmpty() || result.trim().isEmpty()) {
                    throw new Exception();
                } else {
                    return result;
                }
                
            } catch (Exception e) {
                System.out.print("\n");
                System.out.println("Exception! The inputed string shouldnt be empty. Try again...\n");
                continue;
            }
        }
    }

    public static void main(String[] args) {
        String result = check("Input a string: ");
        System.out.println("Result: " + result);
    }
}
