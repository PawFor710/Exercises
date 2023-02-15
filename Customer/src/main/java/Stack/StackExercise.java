package Stack;

import java.util.Stack;

public class StackExercise {

    public void Stack() {

        Book theBook1 = new Book(
                "Paradyzja", "Janusz Zajdel", 2004);
        Book theBook2 = new Book(
                "Pan lodowego ogrodu", "Jarosław Grzędowicz", 2005);
        Book theBook3 = new Book(
                "Rok 1984", "George Orwell", 1949);
        Book theBook4 = new Book(
                "Rzeźnia numer pięć", "Kurt Vonnegut", 1969);
        Book theBook5 = new Book(
                "Nieznośna lekkość bytu", "Milan Kundera", 1982);
        Book theBook6 = new Book(
                "Mock: pojedynek", "Marek Krajewski", 2018);

        Stack<Book> books = new Stack<>();

        System.out.println("initial stack size: " + books.size());

        books.push(theBook4);
        books.push(theBook3);
        books.push(theBook1);
        books.push(theBook6);
        books.push(theBook2);
        books.push(theBook5);

        System.out.println("Stack size after adding books: " + books.size());



        Book firstDeletedBook = books.pop();

        System.out.println("Name of first deleted book: " + firstDeletedBook.getTitle());

        books.pop();
        books.pop();
        books.pop();
        books.pop();
        Book lastDeletedBook = books.pop();

        System.out.println("Name of last deleted book: " + lastDeletedBook.getTitle());
        System.out.println("Stack size after deleting all books: " + books.size());
    }

}
