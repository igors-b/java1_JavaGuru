package student_volodya_danilin.lesson_8.level_3.Task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class LoanSystem {

    abstract boolean canReceiveLoan(Human human);
}

/*
Абстрактный метод не может быть записан в неабстрактный класс.
 */