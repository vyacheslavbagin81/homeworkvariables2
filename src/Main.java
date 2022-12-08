import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }public static void task1(){
        System.out.println("Задача 1");
        System.out.println("Для установки приложения укажите вашу ОС. Если у Вас iOS - нажмите 0, если Android - 1");
        Scanner scn = new Scanner(System.in);
        int clientOS = scn.nextInt();
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
        }
    }public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Для установки приложения укажите вашу ОС. Если у Вас iOS - нажмите 0, если Android - 1");
        Scanner scn = new Scanner(System.in);
        int clientOS = scn.nextInt();
        System.out.println("Так же укажите год выпуска телефона");
        Scanner scn1 = new Scanner(System.in);
        int clientDeviceYear = scn1.nextInt();
        if (clientDeviceYear < 2015) {
            switch (clientOS) {
                case 0:
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
            }
        }else
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case 1:
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
            }
    }public static void task3(){
        System.out.println("Задача 3");
        System.out.println("Введите год что бы узнать висакосный он или нет");
        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" год является високосным");
            }else System.out.println(year+" год не является високосным");
        } else if (year%4==0) {
            System.out.println(year+" год является високосным");
        }else {
            System.out.println(year+" год не является високосным");
        }
    }public static void task4(){
        System.out.println("Задача 4");
        System.out.println("Для определения срока поставки укажите растояние до адреса доставки");
        Scanner scn = new Scanner(System.in);
        int deliveryDistance  = scn.nextInt();
        int minimumDeliveryTime = 1;
        if (deliveryDistance<20){
            System.out.println("Потребуется дней: "+minimumDeliveryTime);
        } else if (deliveryDistance<60) {
            System.out.println("Потребуется дней: "+(minimumDeliveryTime+1));
        } else if (deliveryDistance<100) {
            System.out.println("Потребуется дней: "+(minimumDeliveryTime+1+1));
        }else System.out.println("Свыше 100 км доставки нет.");
    }public static void task5() {
        System.out.println("Задача 5");
        System.out.println("Для определения времени года напишите номер месяца");
        Scanner scn = new Scanner(System.in);
        int monthNumber = scn.nextInt();
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Сейчас зима");
                break;
            case 3, 4, 5:
                System.out.println("Сейчас весно");
                break;
            case 6, 7, 8:
                System.out.println("Сейчас лето");
                break;
            case 9, 10, 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Что-то ввели не правильно.");
        }
    }
}