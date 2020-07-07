package student_dmitrijs_jasvins.lesson_5.day_5;


import java.util.Random;

public class ArrayUtil {
    public int[] createArray(int arrayLength) {
        int[] array = new int[arrayLength];
        return array;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) + 1;
        }
    }

    public void printArrayInformation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);
        }

    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int findMinNumber(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
