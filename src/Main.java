public class Main {
    public Main() {
    }

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
        var age = 42;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int c = -5;
        if (c >= 5) {
            System.out.println("На улице " + c + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + c + " , нужно надеть шапку, а то лысину простудишь)).");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 120;
        if (speed <= 60) {
            System.out.println("Ваша скорость" + speed + " можно ездить спокойно");
        } else {
            System.out.println("Ваша скорость " + speed + " , придется пострадать материально, заплатив штраф)).");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 12;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст равен " + age + " то нужно ходить в детсад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст равен " + age + " то нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст равен " + age + " то нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст равен " + age + " то нужно ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int age = 8;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + " то он не может кататься");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься только в сопровождении взрослого. " +
                    "Если взрослого нет, то кататься нельзя.");
        } else if (age >= 14 ) {
            System.out.println("Если возраст ребенка равен " + age + " то он может кататься без сопровождения взрослого.");

        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int people = 59;
        if (people <= 102 && people <= 60) {
            System.out.println("Если вагоне  " + people + " человек, то есть сидячие места");
        } else if (people >= 60 && people <= 102) {
            System.out.println("Если вагоне  " + people + " человек, то есть стоячие места");
        } else if (people > 102) {
            System.out.println("Вагон полностью заполнен");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число  " + one + " наибольшее из трех чисел");
        } else if (two > one && two > three) {
            System.out.println ("Число  " + two + " наибольшее из трех чисел");
        } else if (three > two && three > one) {
            System.out.println("Число  " + three + " наибольшее из трех чисел");
        }
    }
}

