public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        //Задание 2
        int clientOSYear = 2015;
        if (clientOS == 0) {
            if (clientOSYear < 2015)
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            else
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (clientOSYear < 2015)
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            else
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 3
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4
        int deliveryDistance = 95;
        int deliveryTime = 1; //в пределах 20км
        if (deliveryDistance >= 20)
            deliveryTime++;
        if (deliveryDistance >= 60 && deliveryDistance < 100)
            deliveryTime++;
        System.out.println("Потребуется дней: " + deliveryTime);

        //Задание 5
        int monthNumber = 12;
        if (monthNumber > 13) {
            System.out.println("Выполнено условие, при котором программа не будет выполняться.");
        } else {
            switch (monthNumber) {
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
                default:
                    System.out.println("Такого месяца не существует");
            }
        }
    }
}