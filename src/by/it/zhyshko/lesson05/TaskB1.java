package by.it.zhyshko.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("Первая строка");
        list.add("Вторая строка");
        list.add("Третья строка");
        list.add("Четвёртая строка");
        list.add("Пятая строка");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

}
