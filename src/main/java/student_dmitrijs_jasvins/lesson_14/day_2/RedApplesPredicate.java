package student_dmitrijs_jasvins.lesson_14.day_2;

public class RedApplesPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
