package student_roberts_kupcs.lesson_10.level_4.Task_12;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
