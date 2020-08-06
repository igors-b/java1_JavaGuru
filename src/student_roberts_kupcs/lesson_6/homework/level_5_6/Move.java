package student_roberts_kupcs.lesson_6.homework.level_5_6;

//Создайте класс Move с двумя свойствами:
//
//    private int x;
//    private int y;
//
//и конструктором, который принимает два целых числа
//- координаты клетки в которую хочет походить игрок
//и get методами для этих свойств.
//
//В классе TicTacToe создайте метод:
//
//public Move getNextMove() {
//    // запросите у пользователя с консоли две координаты
//    // клетки куда хочет походить игрок
//    // создайте экземпляр класса Move и передайте ему
//    // в конструктор введённые пользователем координаты
//    // верните созданный объект Move из метода.
//}

class Move {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
