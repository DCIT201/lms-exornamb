/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Welcome to the Library Management System!";

    }
    

    public static void main(String[] args) {

        // Step : Dispay the app's name
        System.out.println(new App().getGreeting());

        // Step 2: Add Books to the Library
    Library.addBook(new Book("BEHIND THE SHADOW", "BANIBENSU JENNIFER", 2005));
    Library.addBook(new Book("AMARI AND THE NIGHT BROTHERS", "ADELAIDE TWUM", 1999));
    
    // Step 3: Add Patrons to the Library
    Library.addPatron(new Patron("ADWOA", 20, "NA Cres Street", "05449690584", "adwoa@gmail.com"));
    Library.addPatron(new Patron("ESE", 28, "NA Descrent Street", "0245678904", "ese@gmail.com"));

    // Step 4: Display Books
    System.out.println("\nAll of the books in the Library:");
    Library.displayBooks();
    System.out.println("\n");

    // Step 5: Borrow a Book
    Library.borrowBook("BEHIND THE SHADOW", "ESE");

    // Step 6: Try to Borrow an Already Borrowed Book
    System.out.println("\n");
    System.out.println("\nAdwoa tries to borrow an already borrowed book");
    Library.borrowBook("BEHIND THE SHADOW", "ADWOA");

    // Step 7: Return the Book
    System.out.println("\n");
    Library.returnBook("BEHIND THE SHADOW", "ESE");

    // Step 8: patron borrows the returned book
    System.out.println("\n");
    System.out.println("\nAdwoa tries to borrow 'BEHIND THE SHADOW' again:");
    Library.borrowBook("BEHIND THE SHADOW", "ADWOA");

    // Step 9: Display Library's patrons
    System.out.println("\n");
    System.out.println("\nAll patrons:");
    Library.displayPatrons();



    }
}

