package com.example.bfcmapi;

public class whoami {
    private String firstName;
    private String lastName;
    

    public whoami(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }
}
