package com.pb.boichuk.hw5;

public class Reader {
    private String FIO = "Петров В. В."; // ФИО
    private String numberRTicket = "000001";  // номер читательского билета
    private String faculty = "названиеФакультета";  // факультет
    private String dateOfBirth = "01.01.1990"; // дата рождения
    private String telephoneNumber = "0980009898"; // телефон

    public Reader(String FIO, String numberRTicket, String faculty, String dateOfBirth, String telephoneNumber) {
        this.FIO = FIO;
        this.numberRTicket = numberRTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public Reader() {

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getNumberRTicket() {
        return numberRTicket;
    }

    public void setNumberRTicket(String numberRTicket) {
        this.numberRTicket = numberRTicket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void takeBook(String FIO){
        System.out.println(FIO + " взял 3 книги");
    }

    public void takeBook(String FIO, String faculty){
        System.out.println(FIO + faculty + " взял книги: Приключения, Словарь, Энциклопедия");
    }

    public void takeBook(String FIO, String faculty, String telephoneNumber){
        System.out.println(FIO + telephoneNumber + " взял книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)");
    }

    public void returnBook(String FIO){
        System.out.println(FIO + " вернул 3 книги");
    }

    public void returnBook(String FIO, String faculty){
        System.out.println(FIO + faculty + " вернул книги: Приключения, Словарь, Энциклопедия");
    }

    public void returnBook(String FIO, String faculty, String telephoneNumber){
        System.out.println(FIO + telephoneNumber + " вернул книги: Приключения (Иванов И. И. 2000 г.), Словарь (Сидоров А. В 1980 г.), Энциклопедия (Гусев К. В. 2010 г.)");
    }


    String getInfo() {
        return "[ФИО: " + FIO + ", номер читательского билета: "
                + numberRTicket + ", факультет: " + faculty + ", дата рождения: "
                + dateOfBirth + ", телефон: " + telephoneNumber + "]";
    }
}
