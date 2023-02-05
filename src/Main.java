public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println(" ");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println(" ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает сутки.");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает двое суток.");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Доставка в пределах " + deliveryDistance + " км занимает трое суток.");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
        System.out.println(" ");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
        System.out.println(" ");
    }


}