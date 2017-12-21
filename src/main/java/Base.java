/**
 * @author Andrey Strelnikov
 * First Java Class
 * Modifications: 2 programs (Calculator and Find the maximum words in the array)
 * Modifications: Translate inferred  Russian text on English
 */

import Calculater.*;

import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Sum sum = new Sum();
        TextOfField text = new TextOfField();
        Difference difference = new Difference();
        Multiply multiply = new Multiply();
        Division division = new Division();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select action: 1 - Calculator, 2 - Find the maximum or minimum word in the array");
        int choose1 = scanner.nextInt();
        //делаем выбор между двумя программами: 1 - Калькулятор, 2 - Поиск максимального слова в массиве.
        if (choose1 == 1) {
            System.out.println("Select action: 1 - Sum(+), 2 - Difference(-), 3 - Multiply(*), 4 - Division(/)");
            //Добавляем новую переменную choose.
            int choose = scanner.nextInt();
            //Делаем выбор, в зависимости от введенных пользователем чисел: 1 - Сумма, 2 - Вычитание, 3 - Умножение, 4 - Деление.
            switch (choose) {
                case 1:
                    System.out.println("You choose the Amount!");
                    text.getText1();
                    // Водим первое число
                    sum.setA(scanner.nextDouble());
                    // Водим второе число
                    text.getText2();
                    sum.setB(scanner.nextDouble());
                    // Округляем переменную d до 4х знаков после запятой
                    sum.getResultOfSum();
                    scanner.close();
                    break;
                case 2:
                    System.out.println("You chose the Difference!");
                    text.getText1();
                    // Водим первое число
                    difference.setA(scanner.nextDouble());
                    // Водим второе число
                    text.getText2();
                    difference.setB(scanner.nextDouble());
                    // Округляем переменную d до 4х знаков после запятой
                    difference.getResultOfDifference();
                    scanner.close();
                    break;
                case 3:
                    System.out.println("You have chosen Multiplication!");
                    text.getText1();
                    // Водим первое число
                    multiply.setA(scanner.nextDouble());
                    // Водим второе число
                    text.getText2();
                    multiply.setB(scanner.nextDouble());
                    // Округляем переменную d до 4х знаков после запятой
                    multiply.getResultOfMultiply();
                    scanner.close();
                    break;
                case 4:
                    System.out.println("You chose Division!");
                    text.getText1();
                    // Водим первое число
                    division.setA(scanner.nextDouble());
                    // Водим второе число
                    text.getText2();
                    division.setB(scanner.nextDouble());
                    // Округляем переменную d до 4х знаков после запятой
                    division.getResultOfDivision();
                    scanner.close();
                    break;

                default:
                    System.out.println("Out of range");
            }
        } else if (choose1 == 2) {

            //Поиск максимального или минимального элимента в массиве
            System.out.println("You chose the program: Find the maximum or minimum word in the array!");
            System.out.println("Введите длину массива");
            //Вводим размерность массива
            int a = scanner.nextInt();
            String b[] = new String[a];
            // Выводим длину массива
            System.out.println("длина массива = " + b.length);
            //Заполняем элименты массива
            for (int i = 0; i < b.length; i++) {
                System.out.println("Введите элемент массива в индекс: " + i);
                String c = scanner.next();
                b[i] = c;
            }

            System.out.println("Все элементы массива:");
            //выводим все элименты массива

            int k = 0;
            while (k < b.length) {
                System.out.println(+k +" элимент массива =: " + b[k]);
                k++;
            }
            //Выбираем между действиями 1 - Поиск самого длинного слова в массиве, 2 - Поиск самого короткого слова в массиве

            System.out.println("Выберите действие: 1 - Поиск самого длинного слова в массиве, 2 -  Поиск самого короткого слова в массиве");
            int choose2 = scanner.nextInt();
            switch (choose2) {
                case 1:
                    //Поиск самого длинного слова
                    String searchMe = b[0];
                    int max = searchMe.length();
                    for (int i = 0; i < b.length; i++) {
                        if (max < b[i].length()) {
                            max = b[i].length();
                            searchMe = b[i];
                        }
                    }
                    System.out.println("Самое длинное слово = " + searchMe + " Его длина = " + max);
                    break;
                case 2:
                    //Поиск самого короткого слова
                    String searchMe1 = b[0];
                    int min = searchMe1.length();
                    for (int i = 0; i < b.length; i++) {
                        if (min > b[i].length()) {
                            min = b[i].length();
                            searchMe1 = b[i];
                        }
                    }
                    System.out.println("Самое короткое слово = " + searchMe1 + " Его длина = " + min);
                    break;
                default:
                    System.out.println("Out of range");
            }

        } else {
            System.out.println("Out of range");
        }

    }
}
