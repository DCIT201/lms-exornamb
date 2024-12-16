package org.example;


public class Book {

    // This is your working class.

    private String title;
    private String author;
    private int yearPublished;
    private static int bookID = 0;
    private int currentBookID;
    private static String status;
    
    // Availability status



    public Book(String title, String author, int yearPublished){
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        bookID++;
        this.currentBookID = bookID;
        status = "available";
        displayBook();
        


    }

    public void displayBook(){
        System.out.println("Book ID: " + getCurrentBookID());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Status: " + getStatus());
    }

    // getters and setters forthe private fields.

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getCurrentBookID() {
        return currentBookID;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
    
}
