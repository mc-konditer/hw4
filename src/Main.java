public class Main {
    public static void main(String[] args) {
    int age = 17;
    if (age >= 18) {
        System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний!)");
    } else if (age > 0 && age < 18) {
        System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать...=(");
    }

    int temperature = -1;
    if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
    } else {
        System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
    }

    int speed = 65;
    if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то  придется заплатить штраф.");
    } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    }

    int age1 = 8;
    if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");
    } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу.");
    } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то его место в университете.");
    } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу.");

    }

    int age2 = 14;
    if (age2 < 5) {
        System.out.println("Если возраст ребенка равен " + age2 + ", то ему нельзя кататься на аттракционе👎.");
    } else if (age2 >= 5 && age2 < 14) {
        System.out.println("Если возраст ребенка равен " + age2 + ", то ему  можно кататься на аттракционе в сопровождении👍.");
    } else {
        System.out.println("Если возраст ребенка равен " + age2 + ", то ему  можно кататься на аттракционе без сопровождения взрослого🤘.");
    }

    int passengers = 100;
    int capacity = 102;
    int sittingPlace = 60;
    int standingPlace = capacity - sittingPlace;
    if (passengers >= 0 && passengers < sittingPlace) {
        System.out.println("Если пассажираов " + passengers + ", то в вагоне " + (capacity - passengers) + " свободных мест(а), из них " + (sittingPlace - 42) + " сидячих и " + standingPlace + " стоячих мест(а).");
    } else if (passengers >= sittingPlace && passengers < capacity) {
        System.out.println("Если пассажираов " + passengers + ", то в вагоне нет свободных сидячих мест, а осталось лишь "+ (capacity - passengers) + " стоячих мест(а).");
    } else {
        System.out.println("Свободных мест в вагоне не осталось...");

    }

    int one = 1;
    int two = 2;
    int three = 3;
    if (one > two && one > three) {
        System.out.println("Наибольшее число one");
    } else if (two > three) {
        System.out.println("Наибольшее число two");
    } else {
        System.out.println("Наибольшее число three");
    }


    }
}