import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        //задание 2 - очки за баскетбольный матч
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество забитых 2-х очковых: ");
        int two_points = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите количество забитых 3-х очковых: ");
        int three_points = in.nextInt();
        int result = points (two_points, three_points);
        System.out.printf("Очки за матч: %s", result);
    }
    //функция points для задания 2
    private static int points(int n, int k) {
        return n*2 + k*3;
    }
}
