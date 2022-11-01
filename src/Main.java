public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ 3 - задача 1:");
        int humanAge = 15;
        if (humanAge>=2 && humanAge<7) {
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в детский сад");
        } else if (humanAge>=7 && humanAge<=18) {
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в школу");
        } else if (humanAge>18 && humanAge<=24) {
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить в университет");
        } else if (humanAge>24) {
            System.out.println("Если возраст человека равен "+humanAge+", то ему нужно ходить на работу");
        }

        System.out.println("ДЗ 3 - задача 2:");
        if (humanAge<=5) {
            System.out.println("Ребенок не может кататься на аттракционе");
        } else if (humanAge>5 && humanAge<=14) {
            System.out.println("Ребенок может кататься на аттракционе только в сопровождении взрослого");
        } else if (humanAge>14) {
            System.out.println("Ребенок может кататься на аттракционе без сопровождения взрослого");
        }

        System.out.println("ДЗ 3 - задача 3:");
        int one = 10;
        int two = 20;
        int three = 30;
        if (one>two && one>three) {
            System.out.println(one);
        } else if (two>one && two>three) {
            System.out.println(two);
        } else if (three>one && three>two) {
            System.out.println(three);
        } else {
            System.out.println("Числа равны");
        }
    }
}