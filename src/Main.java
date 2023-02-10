public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var age = 42;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int c = -5;
        if (c >= 5) {
            System.out.println("На улице " + c + " градусов, можно идти без шапки");
            } else {
            if (c <= 5){
                System.out.println("На улице " + c + " , нужно надеть шапку, а то лысину простудишь)).");
            }
        }
    }
}