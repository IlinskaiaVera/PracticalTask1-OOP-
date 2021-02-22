import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        //задание 3 - очки футбольной команды
        Scanner in = new Scanner(System.in);
        System.out.print("Введите, сколько раз выиграла команда: ");
        int win = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите, сколько раз была ничья: ");
        int draw = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите, сколько раз выиграла команда: ");
        int lose = in.nextInt(); /*вообще можно даже не спрашивать, сколько раз проиграли,
                                         ведь очки от проигрыша всегда нулевые*/
        int points = footballPoints(win,draw);
        System.out.printf("Количество очков, набранных футбольной командой: %s", points);
    }

    private static int footballPoints(int w, int d) {
        return w*3 + d;
    }
}
