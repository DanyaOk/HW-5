public class Main {
    public static void main(String[] args) {

        int clientOS=0;
        if (clientOS==0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }else if (clientOS==1) {
            System.out.println("Установите версию приложения для Android по ссылке");


    }

        int clientDeviceYear=2015;
        if (clientDeviceYear<=2015 && clientOS==0) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        }else if (clientDeviceYear<=2015 && clientOS==1) {
            System.out.println("Установите облегченную версию для Android по ссылке");}

        int year=2016;
        if (year==2004 ||year==2008 ||year==2012 ||year==2016 ||year==2020 ||year==2024 ||year==2028 ||year==2032) {
            System.out.println("Год високосный");
        } else if (year==2000) {
            System.out.println("Год невисокосный");
        }else {
            System.out.println("Год невисокосный");
        }

int deliveryDistance=95;
        int day1=1;
        int day2=day1+1;
        int day3=day2+1;
        int day4=day3+1;
        if (deliveryDistance<=20) {
            System.out.println("Потребуется дней: "+day1);
        } else if (deliveryDistance>20 && deliveryDistance<=60) {
            System.out.println("Потребуется дней: "+day2);

        }else if (deliveryDistance>60 && deliveryDistance<=100) {
            System.out.println("Потребуется дней: "+day3);
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

