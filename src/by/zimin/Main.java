package by.zimin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        /**1.	выведите на консоль все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/

        Scanner sc = new Scanner(System.in);
        for (int i = 1000; i < 10_000; i = i + 3) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------Tas2------------------------------------------------------");
        /**2.	выведите на консоль первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

        for (int i = 0, j = 1; i < 55; i++) {

            System.out.print(j + " ");
            j = j + 2;
        }
        System.out.println("\n--------------------------------Tas3------------------------------------------------------");
        /**3.	выведите на консоль все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/
        for (int i = 90; i > 0; i = i - 5) {
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------Tas4------------------------------------------------------");
        /**4.	выведите на консоль первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
        for (int i = 0, j = 2; i < 20; i++) {

            System.out.print(j + " ");
            j = j * 2;
        }
        System.out.println("\n--------------------------------Task5------------------------------------------------------");
        /**5.	* выведите на консоль все положительные делители натурального числа,
         * введённого пользователем с клавиатуры.*/

        System.out.println("Enter a positive  number ");
        if (sc.hasNextInt() || sc.nextInt() > 1) {
            int number = sc.nextInt();

            for (int i = 1; i <= number; i++) {
                if ((number % i) == 0) {
                    System.out.println("The number is divisible by: " + i);
                }
            }
        } else {
            System.out.println("Something went wrong try again!");
        }

        /**6.* Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем,
         *  что первый и второй члены последовательности равны единицам,
         *  а каждый следующий — сумме двух предыдущих.*/
        int count = 0;
        int fibonacci1 = 0;
        System.out.println("The number fibonacci : " + fibonacci1);
        int fibonacci2 = 1;
        System.out.println("The number fibonacci : " + fibonacci2);
        while (count <= 8) {
            int nextFibonacci = fibonacci1 + fibonacci2;
            System.out.println("The number fibonacci : " + nextFibonacci);
            fibonacci1 = fibonacci2;
            fibonacci2 = nextFibonacci;
            count++;
        }

        /**7.* В городе N есть большой склад на котором существует 50000 различных полок.
         * Для удобства работников руководство склада решило заказать для каждой полки табличку
         * с номером от 00001 до 50000 в местной типографии, но, когда таблички напечатали, оказалось,
         * что печатный станок из-за неисправности не печатал цифру 2, поэтому все таблички, в номерах
         * которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать.
         * Напишите программу, которая подсчитает сколько всего таких ошибочных табличек оказалось в
         * бракованной партии*/
        int[] shelvesInTheWarehouse = new int[50_000];
        int count1 = 0;
        for (int i = 0; i < 50_000; i++) {
            shelvesInTheWarehouse[i] = i;
            int n = shelvesInTheWarehouse[i];
            while (n > 0) {
                int temp = n % 10;
                if (temp == 2) {
                    count1++;
                    n = 0;
                }
                n /= 10;
            }
        }
        System.out.println("The number of defective plates is: " + count1);


    }


}







