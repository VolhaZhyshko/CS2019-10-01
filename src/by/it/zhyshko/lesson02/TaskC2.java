package by.it.zhyshko.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
import java.util.Scanner;
class TaskC2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i = a + b;
        String x = Integer.toBinaryString(a);
        String y = Integer.toBinaryString(b);
        String z = Integer.toBinaryString(i);
        System.out.println("DEC:" + a + "+" + b + "=" + i);
        System.out.println("BIN:" + x + "+" + y + "=" + z);
        x = Integer.toHexString(a);
        y = Integer.toHexString(b);
        z = Integer.toHexString(i);
        System.out.println("HEX:" + x + "+" + y + "=" + z);
        x = Integer.toOctalString(a);
        y = Integer.toOctalString(b);
        z = Integer.toOctalString(i);
        System.out.println("OCT:" + x + "+" + y + "=" + z);
    }


}
