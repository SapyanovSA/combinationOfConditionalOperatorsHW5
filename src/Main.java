
public class Main {
    public static void main(String[] args) {

        // Задача 1
        int clientOS = 1;
        System.out.println("Задача 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

        //Задача 2
        int clientIOS = 1;
        int clientDeviceYear = 2015;
        System.out.println("Задача 2");
        if (clientIOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientIOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientIOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientIOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();

        //Задача 3
        int year = 2021;
        System.out.println("Задание 3");
        if (year > 1584 && (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)) {
            System.out.println(year + " год не является високосным.");
        } else if (year >= 1584 & (year % 4 == 0 || year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println("Весокосный год был введен в 1584 году.");
        }
        System.out.println();

        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        System.out.println("Задача 4");
        if (deliveryDistance < 20) {
            System.out.println("Ответ: Потребуется " + deliveryDays + " день.");
        } else if (deliveryDistance <= 60) {
            deliveryDays += 1;
            System.out.println("Ответ: Потребуется " + deliveryDays + " дня.");
        } else if (deliveryDistance <= 100) {
            deliveryDays += 2;
            System.out.println("Ответ: Потребуется " + deliveryDays + " дня.");
        } else {
            System.out.println("Ответ: Доставки нет.");
        }
        System.out.println();

        // Задача 5
        int monthNumber = 12;
        System.out.println("Задание 5");
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Ответ: " + monthNumber + "-й месяц относится к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ответ: " + monthNumber + "-й месяц относится к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Ответ: " + monthNumber + "-й месяц относится к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Ответ: " + monthNumber + "-й месяц относится к сезону осень.");
                break;
            default:

        }

    }
}
