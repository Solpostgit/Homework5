public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
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
        Boolean leapYear = (year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0); // определяем високосный год, как
        // каждый четвертый и не каждый сотый, или каждый четырёхсотый.
        if (leapYear) {
            System.out.printf("%d год является високосным \n", year);
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
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        }
        else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            deliveryTime = deliveryTime + 1;
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        }
        else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            deliveryTime = deliveryTime + 2;
            System.out.printf("Потребуется дней: %d \n", deliveryTime);
        }
        else System.out.println("Доставки нет");
    }
    public static void task5 () {
        System.out.println();
        System.out.println("task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Январь - принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль - принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март - принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель - принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май - принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь - принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль - принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август - принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь - принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь - принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь - принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь - принадлежит к сезону зима");
                break;
            default:
                System.out.println("Программа не выполняется");
        }
    }
}