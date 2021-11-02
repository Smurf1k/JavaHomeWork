package com.pb.boichuk.hw5;

public class Reader {
    private String FIO = "Петров В. В."; // ФИО
    private int numberRTicket = "000001";  // номер читательского билета
    private String faculty = "названиеФакультета";  // факультет
    private String dateOfBirth = "01.01.1990"; // дата рождения
    private String telephoneNumber = "0980009898"; // телефон

    public Reader(String FIO, int numberRTicket, String faculty, String dateOfBirth, String telephoneNumber) {
        this.FIO = FIO;
        this.numberRTicket = numberRTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
    }

    public Book() {

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNumberRTicket() {
        return numberRTicket;
    }

    public void setNumberRTicket(int numberRTicket) {
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

    String getInfo() {
        return "[ФИО: " + FIO + ", номер читательского билета: "
                + numberRTicket + ", факультет: " + faculty + ", дата рождения: "
                + dateOfBirth + ", телефон: " + telephoneNumber + "]";
    }
}
