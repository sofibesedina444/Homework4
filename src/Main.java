public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 1 - задача 1:");
        int humanAge = 13;
        if (humanAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (humanAge < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        System.out.println("ДЗ 1 - задача 2:");
        if (humanAge >= 7) {
            System.out.println("Ребенок ходит в школу");
        }
        if (humanAge >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (humanAge >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        System.out.println("ДЗ 1 - задача 3:");
        int numberOfSeatsInTheCar = 102;
        int numbersOfSeats = 60;
        int numbersOfOther = numberOfSeatsInTheCar-numbersOfSeats;
        int seatsUsed = 50;
        int otherUsed = 37;
        if (seatsUsed < numbersOfSeats) {
            System.out.println("В вагоне осталось "+(numbersOfSeats-seatsUsed)+" сидячих мест");
        }
        if (seatsUsed==numbersOfSeats) {
            System.out.println("В вагоне нет сидячих мест");
        }
        if (otherUsed < numbersOfOther) {
            System.out.println("В вагоне осталось "+(numbersOfOther-otherUsed)+" стоячих мест");
        }
        if (otherUsed==numbersOfOther) {
            System.out.println("В вагоне нет стоячих мест");
        if ((seatsUsed+otherUsed) >= numberOfSeatsInTheCar) {
            System.out.println("В вагоне нет свободных мест");
        }
        }
    }
}