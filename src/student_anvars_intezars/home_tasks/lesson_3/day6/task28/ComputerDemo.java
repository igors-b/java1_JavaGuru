package student_anvars_intezars.home_tasks.lesson_3.day6.task28;

public class ComputerDemo {

        public static void main(String[] args) {
            Computer dell = new Computer("Dell", "XXX-1");
            String manufacturer = dell.getManufacturer();
            String model = dell.getModel();
            System.out.println("Computer manufacturer = " + manufacturer);
            System.out.println("Computer model = " + model);
        }

    }
