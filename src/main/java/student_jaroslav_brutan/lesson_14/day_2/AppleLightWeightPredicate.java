package student_jaroslav_brutan.lesson_14.day_2;

public class AppleLightWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple){
        return apple.getWeight() < 150;
    }
}
