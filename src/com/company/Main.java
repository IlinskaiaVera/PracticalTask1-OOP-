package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //задание 1 - минуты в секунды
        Scanner in = new Scanner(System.in); /*Используем класс scanner, который
                                             в свою очередь использует System.in
                                                    для ввода с консоли*/
        System.out.print("Введите количество минут: ");
        int minutes = in.nextInt(); //записываем введённное значение в переменную
                              // nextLine() - для String, nextFloat() - для float (лол)
        int seconds = convert(minutes);
        System.out.printf("Перевод минут в секунды: %s", seconds);

    }

    //функция convert для задания 1
    private static int convert(int n) { //указываем какой тип переменных (тут int) должен передаваться методу
        return n*60;
    }
}