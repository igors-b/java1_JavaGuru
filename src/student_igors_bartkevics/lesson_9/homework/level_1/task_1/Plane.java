/*
Task_1:
Создайте класс самолёт и сделайте так,
что бы он был доступен из любого другого класса
в этом пакете и в других пакетах.
Каким оператором доступа для этого надо воспользоваться?
========================================================
Необходимо воспользоваться оператором доступа public.
 */
package student_igors_bartkevics.lesson_9.homework.level_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Plane {
    private String model;
}
