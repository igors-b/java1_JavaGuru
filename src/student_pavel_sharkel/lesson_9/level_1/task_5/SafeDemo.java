package student_pavel_sharkel.lesson_9.level_1.task_5;

class SafeDemo {
    public static void main(String[] args) {

        Safe safe = new Safe(0000, 150);

        safe.putMoney(0000, 15);
        safe.getMoney(0001, 20);
    }
}
