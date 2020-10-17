package student_dmitrijs_jasvins.lesson_11.day_6.UI;

import student_dmitrijs_jasvins.lesson_11.day_6.BookDatabase;


public class FindUniqueBooksUIAction implements UIAction {

    BookDatabase bookDatabase;

    public FindUniqueBooksUIAction(BookDatabase bookDatabase) { this.bookDatabase = bookDatabase; }

    @Override
    public void execute() {
        System.out.println("Unique books in library: " + bookDatabase.findUniqueBooks());
    }
}
