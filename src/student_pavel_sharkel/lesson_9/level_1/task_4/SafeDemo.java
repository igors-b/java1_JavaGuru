package student_pavel_sharkel.lesson_9.level_1.task_4;

public class SafeDemo {

    public static void main(String[] args) {

        Safe safe = new Safe(150, 200);

        System.out.println("In safe we have USD: " + safe.dollars);
        System.out.println("In safe we have EUR: " + safe.euros);
    }
}
