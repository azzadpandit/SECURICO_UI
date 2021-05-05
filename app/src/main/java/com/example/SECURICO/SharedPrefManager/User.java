package com.example.SECURICO.SharedPrefManager;

public class User {
    int id;
    String CUSTOMER_NAME,PHONE,EMAIL,ADDRESS,USERNAME,PASSWORD;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCUSTOMER_NAME() {
        return CUSTOMER_NAME;
    }

    public void setCUSTOMER_NAME(String CUSTOMER_NAME) {
        this.CUSTOMER_NAME = CUSTOMER_NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public User(int id, String CUSTOMER_NAME, String PHONE, String EMAIL) {
        this.id = id;
        this.CUSTOMER_NAME = CUSTOMER_NAME;
        this.PHONE = PHONE;
        this.EMAIL = EMAIL;
        this.ADDRESS = ADDRESS;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
    }



}
