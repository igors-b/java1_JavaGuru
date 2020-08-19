package student_valerija_ionova.lesson_7.homeworks.level_1.task_1_3;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class WordServiceVariant2 {

    private String [] testToWordsArray(String text){
        return text.split(" ");
    }

    private String mostFrequentWord(String [] wordsArray){
        int maxNumberOfWords = 0;
        String mostFrequentWord = "";
        for (String word : wordsArray){
            int currentNumberOfWords = countNumberOfCurrentWord(word, wordsArray);
            if (currentNumberOfWords > maxNumberOfWords){
                mostFrequentWord = updateMostFrequentWord(word);
                maxNumberOfWords = updateNumberOfMostFrequentWord(currentNumberOfWords);
            }
        }
        return mostFrequentWord;
    }

    @CodeReviewComment(teacher = "Зачем этот метод нужен? Он же вообще ничего не делает?")
    private String updateMostFrequentWord(String word){
        return word;
    }

	@CodeReviewComment(teacher = "Зачем этот метод нужен? Он же вообще ничего не делает?")
    private int updateNumberOfMostFrequentWord(int number){
        return number;
    }

    private int countNumberOfCurrentWord(String word, String [] wordsArray){
        int currentNumberOfWords = 0;
        for (String currentWord : wordsArray){
            if (word.equalsIgnoreCase(currentWord)){
                currentNumberOfWords ++;
            }
        }
        return currentNumberOfWords;
    }

    String wordService(String text){
        return mostFrequentWord(testToWordsArray(text));
    }
}
