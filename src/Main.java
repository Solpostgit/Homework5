public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();/*
        task3 ();
        task4 ();
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
}