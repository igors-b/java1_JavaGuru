package student_igors_bartkevics.lesson_11.homework.level_2.task_10;

class BookValidator {

    boolean isBookByAuthor(Book book, String author) {
        return (book.getAuthor().equals(author));
    }

}