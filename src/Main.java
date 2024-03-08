
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        short age = 23;
        if (age >= 18){
            System.out.println("Если возраст человека равен "+ age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен "+ age + " он недостиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");

        System.out.println("Задание 2:");
        short temp = 2;
        if ( temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " можно идти без шапки.");
        }
        System.out.println(" ");
    }
}