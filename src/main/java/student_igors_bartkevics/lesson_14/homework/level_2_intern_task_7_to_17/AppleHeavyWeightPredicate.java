package student_igors_bartkevics.lesson_14.homework.level_2_intern_task_7_to_17;

class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}