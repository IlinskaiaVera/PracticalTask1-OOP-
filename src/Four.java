import java.util.Scanner;


public class Four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число для проверки деления на 5: ");
        int number = in.nextInt();
        boolean result = divisibleByFive(number);
        System.out.printf("Результат: %s", result);
    }

    private static boolean divisibleByFive(int number) {
        if (number%5 == 0) {
            return true;
        }
        else {
            return false;
        }
        }
    }
