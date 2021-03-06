import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        //задание 8 - банковское дело(?)
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение prob: ");
        double prob = in.nextDouble();
        in = new Scanner(System.in);
        System.out.print("Введите значение prize: ");
        int prize = in.nextInt();
        in = new Scanner(System.in);
        System.out.print("Введите значение pay: ");
        int pay = in.nextInt();
        boolean result = profitableGamble(prob, prize, pay);
        System.out.printf("Результат операции: %s", result);
    }

    private static boolean profitableGamble(double pro, int pri, int pa) {
        return (pro*pri>pa);
        }
    }
