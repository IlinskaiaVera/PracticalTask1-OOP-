import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
       //задание 7 - исправление ошибок функции
       Scanner in = new Scanner(System.in);
       System.out.print("Введите число, чтобы узнать, что делает данная функция: ");
       int number = in.nextInt();
       int result = squared(number);
       System.out.printf("Это функция, которая возводит число в степень 2 :). И результат: %s", result);
    }
    private static int squared(int a) { //squared, а не squaed. (int a), а не (int b) -_-
        return a*a;
    }
}
