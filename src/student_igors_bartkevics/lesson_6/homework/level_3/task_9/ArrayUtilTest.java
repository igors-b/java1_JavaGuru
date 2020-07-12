/*
Добавьте в класс ArrayUtil метод для проверки содержит ли массив целых чисел указынное число.
Напишите автоматические тесты в классе ArrayUtilTest доказывающие, что ваша реализация метода работает правильно.
 */
package student_igors_bartkevics.lesson_6.homework.level_3.task_9;

import java.util.Random;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.arrayContainsSelectedNumber();
    }

    ArrayUtil arrayUtil = new ArrayUtil();
    Random random = new Random();

    public void arrayContainsSelectedNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult(arrayUtil.isArrayContainsSelectedNumber(array,1), "Array contains selected number");
    }

    public void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void shouldCreateArray() {
        int[] array = arrayUtil.createArray(3);
        boolean condition = (array.length == 3);
        checkResult(condition, "Create array");
    }

    public void shouldFillArrayWithRandomNumbers() {
        int[] array = new int[10];
        int sum = 0;
        arrayUtil.fillArrayWithRandomNumbers(random, array);
        for (int i = 0; i < array.length; i++ ) {
            sum += array[i];
        }
        checkResult(!(sum==0),"Fill array with random numbers");
    }

    public void shouldFindMaxNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMaxNumber(array) == 9), "Find max number");
    }

    public void shouldFindMinNumber() {
        int[] array = {2,3,4,6,9,0,1};
        checkResult((arrayUtil.findMinNumber(array) == 0), "Find min number");
    }

}
