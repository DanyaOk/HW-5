public class Main {
    public static void main(String[] args) {

        int clientOs=0;
        if (clientOs==0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if (clientOs==1) {
            System.out.println("Установите версию приложения для Android по ссылке");


    }

        int clientDeviceYear=2015;
        if (clientDeviceYear<=2015 && clientOs==0) {
            System.out.println("Установите облегченную версию для iOS по ссылке");
        }else if (clientDeviceYear<=2015 && clientOs==1) {
            System.out.println("Установите облегченную версию для Android по ссылке");}

int year=2016;
        if ((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.println(year + " год является високосным");
        }else {
            System.out.println(year+" год не является високосным");
        }

int deliveryDistance=95;
        int day=1;

        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: "+day);
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется дней: "+(day+1));

        }else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней: "+(day+2));
        }else {
            System.out.println("Доставки нет");
        }

        int mounthNumber=12;
        switch (mounthNumber) {
            case 1:
            case 2:
            case 12:
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
            default:
            System.out.println("Такого месяца не существует");
        }

    }

    }

