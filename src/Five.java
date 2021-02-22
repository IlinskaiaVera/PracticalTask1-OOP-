import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        //задание 5 - логический оператор "&&"
        Scanner in = new Scanner (System.in);
        System.out.print("Пожалуйста, введите первое логическое значение: ");
        boolean a = in.nextBoolean();
        in = new Scanner (System.in);
        System.out.print("Пожалуйста, введите второе логическое значение: ");
        boolean b = in.nextBoolean();
        boolean result = and(a,b);
        System.out.printf("Результат: %s", result);
    }

    private static boolean and(boolean a, boolean b) {
        if (a == true && b == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
