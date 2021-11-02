package com.pb.boichuk.hw5;

public class Book {
    private String name = "НЕТ";    // название
    private String author = "НЕТ";     // автор книги
    private String year = "1900 до н.э.";       // год издания

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    String getInfo() {
        return "[Название: " + name + ", автор книги: "
                + author + ", год издания: " + year + "]";
    }
}
