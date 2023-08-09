public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();/*
        task5 (); */
    }
    public static void task1 () {
        System.out.println("task 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else
            System.out.println("Используйте телефон с iOS или Android");
        System.out.println();
    }
    public static void task2 () {
        System.out.println("task 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else System.out.println("Установите версию приложения для Android по ссылке");
        }
        else
            System.out.println("Используйте телефон с iOS или Android");
        System.out.println();
    }
    public static void task3 () {
        System.out.println("task 3");
        int year = 2021;
        Boolean leapYear = year % 4 == 0; // Если деление на 4 без остатка, то год високосный
        if (leapYear) {
            System.out.printf("%d год является високосным", year);
        }
        else
            System.out.printf("%d год не является високосным \n", year);
    }
    public static void task4 () {
        System.out.println();
        System.out.println("task 4");
        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance < 20) {
            System.out.printf("Потребуется дней: %d", deliveryTime);
        }
        else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            deliveryTime = deliveryTime + 1;
            System.out.printf("Потребуется дней: %d", deliveryTime);
        }
        else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            deliveryTime = deliveryTime + 2;
            System.out.printf("Потребуется дней: %d", deliveryTime);
        }
        else System.out.println("Доставки нет");
        System.out.println();
    }
}