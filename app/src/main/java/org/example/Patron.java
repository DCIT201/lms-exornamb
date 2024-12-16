package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Patron {
    private String name;
    private int age;
    private LocalDateTime membershipDate;
    private static int patronNumber = 0;
    private int patronID;
    private String address;
    private String phoneNumber;
    private String email;
    private ArrayList<String> borrowedBooks;

    public Patron(String name, int age, String address,String phoneNumber, String email){

        setName(name);
        setAge(age);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        borrowedBooks = new ArrayList<>();
        
        membershipDate = LocalDateTime.now();
        patronNumber++;
        patronID = patronNumber;
        displayPatron();
        
    }

    public void displayPatron(){
        System.out.println("Patron ID: " + getPatronID());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Start Of Membership: " + getMembershipDate());
        System.out.println("Books Borrowed: " + getBorrowedBooks());
    }


    //  providing the getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getMembershipDate() {
        return membershipDate;
    }

    public int getPatronID() {
        return patronID;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBorrowedBook(String  title){
        borrowedBooks.add(title);
    }

    public void removeBorrowedBook(String title){
        if(borrowedBooks.contains(title)){
            borrowedBooks.remove(title);
        }
        
        
    }

    public ArrayList<String> getBorrowedBooks(){
        return borrowedBooks;
    }

    
}
