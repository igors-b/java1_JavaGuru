package teacher.lesson_5.homework.level_x.super_task_1;

public class Task28 {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new ArrayUtil();
		int[] array = arrayUtil.newArrayWithRandomLength();
		arrayUtil.fillArrayWithRandomNumbers(array);
		arrayUtil.printArray(array);
		int minNumber = arrayUtil.findMinInArray(array);
		System.out.println("Min number = " + minNumber);
	}

}
