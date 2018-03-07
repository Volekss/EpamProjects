package com.company.Task21.Model;

public class Patient implements Comparable<Patient>{
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private long phoneNumber;
    private int cardID;
    private String diagnose;




    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "First name: "+firstName+"\t Last name: "+lastName+"\t Patronymic: "+patronymic+"" +
                "\t Address: "+address+"\t Phone number: "+phoneNumber+"\t CardID: "+cardID+
                "\t Diagnose: "+diagnose;
    }

    @Override
    public int compareTo(Patient o) {
        return firstName.compareTo(o.getFirstName());
    }
}
