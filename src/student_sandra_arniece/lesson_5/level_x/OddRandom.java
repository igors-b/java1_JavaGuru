package student_sandra_arniece.lesson_5.level_x;

class OddRandom {

    public static void main(String[] args) {
        ArrayUtil xxx = new ArrayUtil();
        int[] array = xxx.createArray(4);
        xxx.fillArrayWithRandomNumbers(array);
        xxx.printArray(array);
        xxx.findOddNumbers(array);
    }

}
