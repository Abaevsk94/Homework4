import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }


    public static void task1() {
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
    }

    public static void task2() {
        System.out.println("Задача 2");
        int outdoorTemperature1 = 2;
        int outdoorTemperature2 = 7;
        if (outdoorTemperature1 < 5) {
            System.out.println("Если на улице " + outdoorTemperature1 + " градуса, то нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + outdoorTemperature1 + " градусов, то можно идти без шапки");
        }
        if (outdoorTemperature2 < 5) {
            System.out.println("Если на улице " + outdoorTemperature2 + " градуса, то нужно надеть шапку");
        } else {
            System.out.println("Если на улице " + outdoorTemperature2 + " градусов, то можно идти без шапки");
        }
    }

    public static void task3() {
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

    public static void task4() {
        System.out.println("Задача 4");
        int age1 = 4;
        int age2 = 15;
        int age3 = 23;
        int age4 = 38;

        if ((age1 > 3) && (age1 < 6)) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if ((age1 > 7) && (age1 < 18)) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if ((age1 > 18) && (age1 < 24)) {
            System.out.println("Если возраст человека равен " + age1 + ", его место в университете");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }
        if ((age2 > 3) && (age2 < 6)) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
        } else if ((age2 > 7) && (age2 < 18)) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");
        } else if ((age2 > 18) && (age2 < 24)) {
            System.out.println("Если возраст человека равен " + age2 + ", его место в университете");
        } else if (age2 > 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу");
        }
        if ((age3 > 3) && (age3 < 6)) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в детский сад");
        } else if ((age3 > 7) && (age3 < 18)) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему нужно ходить в школу");
        } else if ((age3 > 18) && (age3 < 24)) {
            System.out.println("Если возраст человека равен " + age3 + ", то его место в университете");
        } else if (age3 > 24) {
            System.out.println("Если возраст человека равен " + age3 + ", то ему пора ходить на работу");
        }
        if ((age4 > 3) && (age4 < 6)) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if ((age4 > 7) && (age4 < 18)) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в школу");
        } else if ((age4 > 18) && (age4 < 24)) {
            System.out.println("Если возраст человека равен " + age4 + ", то его место в университете");
        } else if (age4 > 24) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему пора ходить на работу");
        }
    }
    static public void task5() {
        System.out.println("задача 5");
        int age1 = 4;
        int age2 = 9;
        int age3 = 15;
        boolean forbidden1 = age1 < 5;
        boolean forbidden2 = age2 < 5;
        boolean forbidden3 = age3 < 5;
        boolean accompanied1 = age1 > 5 && age1 < 14;
        boolean accompanied2 = age2 > 5 && age2 < 14;
        boolean accompanied3 = age3 > 5 && age3 < 14;
        boolean independent1 = age1 >= 14;
        boolean independent2 = age2 >= 14;
        boolean independent3 = age3 >= 14;
        if (forbidden1) {
            {
                System.out.println("Если возраст ребенка равен " + age1 + " то, он не может кататься на аттракционе.");
            }
        } else {
            if (accompanied1)
                System.out.println("Если возраст ребенка равен " + age1 + " то, он может кататься только в сопровождении взрослого.");
            else {
                if (independent1) {
                    System.out.println("Если возраст ребенка равен " + age1 + " то, он может кататься без сопровождения взрослого.");
                }
            }
        }
        if (forbidden2) {
            {
                System.out.println("Если возраст ребенка равен " + age2 + " то, он не может кататься на аттракционе.");
            }
        } else {
            if (accompanied2)
                System.out.println("Если возраст ребенка равен " + age2 + " то, он может кататься только в сопровождении взрослого.");
            else {
                if (independent2) {
                    System.out.println("Если возраст ребенка равен " + age2 + " то, он может кататься без сопровождения взрослого.");
                }
            }
        }
        if (forbidden3) {
            {
                System.out.println("Если возраст ребенка равен " + age3 + " то, он не может кататься на аттракционе.");
            }
        } else {
            if (accompanied3)
                System.out.println("Если возраст ребенка равен " + age3 + " то, он может кататься только в сопровождении взрослого.");
            else {
                if (independent3) {
                    System.out.println("Если возраст ребенка равен " + age3 + " то, он может кататься без сопровождения взрослого.");
                }
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int totalPlacesInOneCarriage = 102;
        int seatingPlacesOneCar = 60;
        int standingPlacesOneCar = totalPlacesInOneCarriage - seatingPlacesOneCar;
        int ticketsPurchased = 1;
        boolean freeSeats = ticketsPurchased < seatingPlacesOneCar && ticketsPurchased < totalPlacesInOneCarriage;
        boolean freeStanding = ticketsPurchased >= seatingPlacesOneCar && ticketsPurchased < totalPlacesInOneCarriage;
        int freeSeatsPlaces =  (totalPlacesInOneCarriage - standingPlacesOneCar) - ticketsPurchased;
        int freeStandingPlaces = totalPlacesInOneCarriage - ticketsPurchased;

        if (freeSeats){
            System.out.println(" В вагоне есть свободные сидячие места в количестве " + freeSeatsPlaces);
        } else
        if (freeStanding){
            System.out.println(" В вагоне есть свободные стоячие  места в количестве " + freeStandingPlaces);
        }
        else {
            System.out.println("свободных мест в вагоне нет");
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        boolean oneBigger = one > two && one > three;
        boolean twoBigger = two > one && two > three;
        boolean threeBigger = three > one && three > two;
        if (oneBigger) {
            System.out.println(one + " - большее из трех чисел");
        } else if (twoBigger) {
            System.out.println(two + " - большее из трех чисел");
        } else if (threeBigger) {
            System.out.println(three + " - большее из трех чисел");
        }
    }
}
