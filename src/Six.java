import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        //задание 6 - покраска стен
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество квадратных метров, которые вы можете нарисовать с имеющейся у вас краской: ");
        int kol = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите ширину одной стены в метрах: ");
        int width = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите длину одной стены в метрах: ");
        int length = in.nextInt();
        int walls = howManyWalls(kol, width, length);
        System.out.printf("Количество стен, которые вы можете покрасить: %s", walls);
    }

    private static int howManyWalls(int k, int w, int l) {
        int wal;
        wal = k/(w*l);
        return wal;
    }
}
