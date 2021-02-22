import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        //задание 9 - расчёт количества кадров
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество минут: ");
        int minutes = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите FPS: ");
        int fps = in.nextInt();
        int kol_frames = frames(minutes, fps);
        System.out.printf("Количество кадров: %s", kol_frames);
    }

    private static int frames(int minu, int fps) {
        return 60*minu*fps;
    }
}
