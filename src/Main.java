
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        byte age = 23;
        if (age >= 18){
            System.out.println("Если возраст человека равен "+ age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен "+ age + " он недостиг совершеннолетия, нужно немного подождать.");
        }
        System.out.println(" ");

        System.out.println("Задание 2:");
        byte temp = 2;
        if (temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " можно идти без шапки.");
        }
        System.out.println(" ");

        System.out.println("Задание 3:");
        byte speed = 90;
        if (speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        System.out.println(" ");

        System.out.println("Задание 4:");
        byte years = 70;
        if (years < 2){
            System.out.println("Если возраст человека равен " + years + ", то ему пора спать.");
        } else if (years >= 2 && years <= 6){
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else if (years > 7 && years < 18) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        } else if (years >= 18 && years < 24){
            System.out.println("Если возраст человека равен " + years + ", то его место в университете.");
        } else if (years >= 24 ) {
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        } else if (years > 60) {
            System.out.println("Если возраст человека равен " + years + ", то он может отдохнуть.");
        }
        System.out.println(" ");
    }
}