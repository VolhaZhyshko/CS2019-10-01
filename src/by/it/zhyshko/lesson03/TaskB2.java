package by.it.zhyshko.lesson03;

/*
Lesson 03. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
import java.util.Scanner;
class TaskB2 {
    public static void main(String[] args) {
        System.out.println("Ввод:\r");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
            double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (- b - Math.sqrt(D)) / (2 * a);
            x2 = (- b + Math.sqrt(D)) / (2 * a);
            System.out.println(x1 + " " + x2);
        }
        else if (D == 0) {
            double x;
            x = - b / (2 * a);
            System.out.println(x);
        }
        else if (D < 0) {
            System.out.println("Отрицательный дискриминант");
        }

        }


}
