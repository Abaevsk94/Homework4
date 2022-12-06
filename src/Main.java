import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Задача 1");

        int firstAge = 28;
        int secondAge = 13;
        if (firstAge > 18) {
            System.out.println("Если возраст человека равен " + firstAge + ", то он совершеннолетний");
        } else {
            System.out.println("Если возрас человека равен " + firstAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (secondAge > 18) {
            System.out.println("Если возраст человека равен " + secondAge + ", то он совершеннолетний");
        } else {
            System.out.println("Если возрас человека равен " + secondAge + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // task 2
        System.out.println("Задача 2");
        int outdoorTemperature1 = 2;
        int outdoorTemperature2 = 7;
        if (outdoorTemperature1 < 5) {
            System.out.println("Если на улице " + outdoorTemperature1 + " градуса, то нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + outdoorTemperature1 + " градусов, то можно идти без шапки");
        }
        if (outdoorTemperature2 < 5 ) {
            System.out.println("Если на улице " + outdoorTemperature2 + " градуса, то нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + outdoorTemperature2 + " градусов, то можно идти без шапки");
        }

        // task 3
        System.out.println("Задача 3");
        int firstSpeed = 59;
        int secondSpeed = 61;
        if (firstSpeed > 60) {
            System.out.println("Если скорость " + firstSpeed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + firstSpeed + " км/ч, то можно ездить спокойно");
        }
        if (secondSpeed > 60) {
            System.out.println("Если скорость " + secondSpeed + " км/ч, то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + secondSpeed + " км/ч, то можно ездить спокойно");
        }


    }
}