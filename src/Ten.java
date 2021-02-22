import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите делимое: ");
        int dividend = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите делитель: ");
        int divider = in.nextInt();
        int result = mod(dividend, divider);
        System.out.printf("Остаток от деления: %s", result);
    }

    private static int mod(int a, int b) {
        int resdel = a/b;
        int osta = a - resdel*b;
        return osta;
    }
}
