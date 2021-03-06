import java.util.Scanner;


public class Four {
    public static void main(String[] args) {
        //задание 4 - деление на 5
        Scanner in = new Scanner(System.in);
        System.out.print("Пожалуйста, введите число для проверки деления на 5: ");
        int number = in.nextInt();
        boolean result = divisibleByFive(number);
        System.out.printf("Результат: %s", result);
    }

    private static boolean divisibleByFive(int number) {
        return number % 5 == 0;
    }
}
