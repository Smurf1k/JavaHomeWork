package com.pb.boichuk.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Reader reader1 = new Reader();

        book1.setName("Name_Book1");
        book2.setName("Name_Book2");
        book3.setName("Name_Book3");
        book1.setAuthor("Author_Book1");
        book2.setAuthor("Author_Book2");
        book3.setAuthor("Author_Book3");
        book1.setYear("2010 г.");
        book2.setYear("2015 г.");
        book3.setYear("2020 г.");

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());

        System.out.println(reader1.getInfo());
    }
}

