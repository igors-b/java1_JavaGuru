package student_jaroslav_brutan.lesson_10.day_2.task_4;

public class DayOfTheWeekDetectorSwitchVersion implements DayOfTheWeekDetector {

    public String detectDayName(int number){
        switch (number){
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
            case 7: return "Sunday";
            default: return "Enter number from 1 to 7!";
        }
    }
}
