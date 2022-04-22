package pro.sky;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1) iphone android laptop
        int clientOS = 1;
        if(clientOS == 1){
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if(clientOS == 0){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // 2) clientDeviceYear
        int clientDeviceYear = 2007;
        if(clientOS==1)
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        else if(clientOS==0)
            if(clientDeviceYear < 2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        // 3) високосным 2020 2024
        int year = 2022;

        if(year%400==0 || (year%4==0) && year%100!=0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // 4) delivery
        int deliveryDistance = 59;
        if(deliveryDistance<20){
            System.out.println("Потребуется дней: "+1);

        } else {
            deliveryDistance = deliveryDistance - 20;
            System.out.println("Потребуется дней: "+ (deliveryDistance/40+2));
        }


        // 5) months
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Неверный номер месяца!");
        }


    }
}
