package com.ibm.fscc.kafka.model;

import javax.persistence.Entity;

@Entity
public class RegistrationEntity {

    private int registrationId;

    private String CIC_Location;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String emailId;

    // private String status;

    private int cellNumber;

    public int getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(int registrationId) {
        this.registrationId = registrationId;
    }

    public String getCIC_Location() {
        return CIC_Location;
    }

    public void setCIC_Location(String CIC_Location) {
        this.CIC_Location = CIC_Location;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return emailId;
    }

    public void setEmail(String email) {
        this.emailId = email;
    }

    // public String getStatus() {
    // return status;
    // }

    // public void setStatus(String status) {
    // this.status = status;
    // }

    public int getCellNumber() {
        return cellNumber;
    }

    public int setCellNumber(int cellNumber) {
        return cellNumber;
    }

}
