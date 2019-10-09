package by.it.zhyshko.lesson03;

/*
Lesson 03. Task A1. Калькулятор.
Напишите программу, которая считывает с клавиатуры два целых числа a и b
после этого выводит через пробел:

сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (результат выводится как тип int).

после этого еще раз выводит через пробел
сумму, разность, произведение, частное и остаток от деления
этих чисел двух чисел (но результат выводится как тип double).

Для считывания данных с клавиатуры используйте метод nextInt() объекта класса Scanner.
Создать Scanner можно так:
Scanner sc=new Scanner(System.in);

Требования:
1. В программе необходимо создать объект типа Scanner.
2. Программа должна считывать два числа типа int с клавиатуры.
3. Программа должна дважды выводить в строку пять чисел через пробел.
4. Программа должна выводить int сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.
5. Программа должна выводить double сумму, разность, произведение, частное и остаток от деления этих чисел двух чисел.

Пример:

Ввод:
7 2
Вывод:
9 5 14 3 1
9.0 5.0 14.0 3.5 1.0

 */
import java.util.Scanner;
class TaskA1 {
    public static void main(String[] args) {
        System.out.println("Ввод:\r");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = a + b;
        int out = a - b;
        int mult = a * b;
        int quot = a / b;
        int resid = a % b;
        System.out.println("Вывод:\r");
        System.out.println(sum + " " + out + " " + mult + " " + quot + " " + resid);
        double sum1 = a + b;
        double out1 = a - b;
        double mult1 = a * b;
        double quot1 = (double) a / b;
        double resid1 = a % b;
        System.out.println(sum1 + " " + out1 + " " + mult1 + " " + quot1 + " " + resid1);
    }
}
