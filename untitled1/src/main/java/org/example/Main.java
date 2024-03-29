package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//здесь мы импортируем библиотеки, которые используем далее в программе

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter FR = new FileWriter("C:\\Users\\Ilyam\\OneDrive\\Рабочий стол\\Students.txt"); //здесь, мы создаем новый FileWriter, с помощью которого будем записывать информацию о наших студентах в файл
        Scanner sc = new Scanner(System.in);//здесь, создаем сканер, с помоью которого мы будем вводить значения для наших переменных
        System.out.println("Добро пожаловать в программу!");//ну как не поздороваться

        boolean addMoreStudents = true; //задаем переменную, которая будет изменять свое значение в дальнейшем в зависимотси от того, хочет ли пользователь вписать еще одного студента
        while (addMoreStudents) {//создаем цикл, с помощью которого мы будем вписывать студентов повторно
            System.out.println("Введите возраст студента");//с помощью System.out.println мы выводим в консоль текст
            int age = sc.nextInt();//благодаря "Scanner", мы может передавать данные в переменную
            sc.nextLine(); // не прописав данную строчку кода, у нас не будет появляться возможность ввода в консоль ФИО студента. Он просто будет миновать данную строчку
            System.out.println("Введите ФИО студента");//Опять выводим
            String fio = sc.nextLine();//Опять вводим
            System.out.println("Введите средний балл студента");//Опять выводим
            double srb = sc.nextDouble();//И опять вводим
            sc.nextLine(); // Добавлэта строчка нужна для очистки буфера после считывания переменной типа double

            FR.write(" Возраст студента: " + age + "\n ФИО студента: " + fio + "\n Средний балл студента: " + srb + "\n _____________________\n\n");
            //Строчкой выше, мы располагаем наши данные в файле, дабавив обозначения того, что мы выводим
            System.out.println("Хотите добавить еще одного студента? (да/нет)");//Данной строчкой мы выбираем как раз таки хотм ли мы добавить студента или нет
            String answer = sc.nextLine();//Вводим да или нет
            addMoreStudents = answer.equalsIgnoreCase("да"); //В данной строчке мы сравниваем введенный ранее ответ с "да" и затем возвращаем в переменную addMoreStudents true или false. То есть если эта переменная = true, тогда цикл повторяется
        }
        FR.close();
                    //этими двумя строчками мы закрываем оба открытых потока: FileWriter и Scanner
        sc.close();
    }
}
