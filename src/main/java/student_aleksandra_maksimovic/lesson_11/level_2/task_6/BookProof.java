package student_aleksandra_maksimovic.lesson_11.level_2.task_6;

public class BookProof {

    boolean isBookByAuthor(Book book, String author) {

        return (book.getAuthor().equals(author));
    }

    boolean isBookWithTitle(Book book, String title) {

        return (book.getTitle().equals(title));
    }


}