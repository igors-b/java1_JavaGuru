package student_valerija_ionova.lesson_3.day_6.Task_24;

public class WashMachineDemo {
    public static void main(String[] args){
        WashMachine washMachine = new WashMachine("AEG", 489, true);
        washMachine.presentation();
        washMachine.on();
        washMachine.of();

        WashMachine washMachine2 = new WashMachine("LOM", 2.9, false);
        washMachine2.presentation();
        washMachine2.on();
        washMachine2.of();

    }
}