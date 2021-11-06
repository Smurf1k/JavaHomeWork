package com.pb.boichuk.hw5;

public class Library {
    public void takeBook(String FIO){
        System.out.println(FIO + " взял 3 книги");
    }
/*
    public void takeBook(String FIO, Book book){
        System.out.println(FIO + " имеет номер читательского билета " + book1.author);
    }

    public void takeBook(String FIO, String numberRTicket, String telephoneNumber){
        System.out.println(FIO + " имеет номер читательского билета: " + numberRTicket + " и номер: " + telephoneNumber);
    }

    public void returnBook(String FIO){
        System.out.println(FIO + " вернул 3 книги");
    }

    public void returnBook(String FIO, String numberRTicket){
        System.out.println(FIO + " имеет номер читательского билета " + numberRTicket);
    }

    public void returnBook(String FIO, String numberRTicket, String telephoneNumber){
        System.out.println(FIO + " имеет номер читательского билета: " + numberRTicket + " и номер: " + telephoneNumber);
    }
*/
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        int numberInt = 3;

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

        reader1.takeBook("Петров В. В.");
        reader1.returnBook("Петров В. В.");
        //  reader1.takeBook("Петров В. В.", " MyAuthor");
    }
}

