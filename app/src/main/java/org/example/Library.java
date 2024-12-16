package org.example;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> books = new ArrayList<>();
    private static List<Patron> patrons = new ArrayList<>();
    boolean bookFind;


    // To add a book
    public static void addBook(Book book){
        if(book != null){
            books.add(book);
            System.out.println(book.getTitle() + " has been added.");
        }else{
            System.out.println(book.getTitle() + " is null. Add attributes");
        }
    }

    // To add a patron
    public static void addPatron(Patron patron){
        if(patron != null){
            patrons.add(patron);
            System.out.println(patron.getName() + " has been added.");
        }else{
            System.out.println(patron.getName() + " is null. Add attributes");
        }
    }

    // find a book
    public static Book findBook(String title){
        
         for(Book book : books ){
            if (title == book.getTitle()) {
                return book;
                }else{
                    System.out.println("no such book exist.");
                }
        }
        return null;
    }

    // Borrow a book
    public static void borrowBook(String title, String name){
        findBook(title);
        for(Book book : books ){
           if (title == book.getTitle() && book.getStatus() != "borrowed") {
               book.setStatus("borrowed");
               for(Patron patron : patrons ){
                if (name == patron.getName() && patron.getBorrowedBooks().size() < 6) {
                    patron.setBorrowedBook(title);
                    System.out.println(title + " borrowed by " + name);
                    }
            }
               }else{
                System.out.println(title + " is already borrowed");
               }
       }
       
   }

//    Return a book
public static void returnBook(String title, String name){
    for(Book book : books ){
       if (title == book.getTitle()) {
           book.setStatus("available");
           for(Patron patron : patrons ){
            if (name == patron.getName()) {
                patron.removeBorrowedBook(title);
                System.out.println(patron.getName() + " has returned " + title + ".");
                }
        }
           }
   }
   
}


// To display all books
public static void  displayBooks() {
    if (books.isEmpty()) {
        System.out.println("No books in the library.");
    } else {
        for(Book book: books){
            book.displayBook();
            System.out.println("\n");
        }
    }

}

// To display all patrons
public static void displayPatrons() {
    if (patrons.isEmpty()) {
        System.out.println("No registered patrons in the library.");
    } else {
        for(Patron patron: patrons){
            patron.displayPatron();
            System.out.println("\n");
        }
    }

}

}