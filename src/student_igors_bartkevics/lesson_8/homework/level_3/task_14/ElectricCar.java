package student_igors_bartkevics.lesson_8.homework.level_3.task_14;

class ElectricCar extends Car {

    private int batteryCharge;


    @Override
    void accelerate() {
        batteryCharge--;
    }
}

