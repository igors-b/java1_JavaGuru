package student_dmitrijs_jasvins.lesson_8.day_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class Shape {
    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
