package com.registration.model;

import javax.validation.constraints.*;

public class User {

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Invalid user name")
    private String name;

    @NotNull
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[\\d\\W]).{4,}$", message = "Invalid password")
    private String password;

    @NotNull
    @Pattern(regexp = "^\\d{2}-\\d{2}-\\d{4}$", message = "Invalid dob")
    private String dob;

    @NotNull
    private String ssn;

    public User(String name, String password, String dob, String ssn) {
        this.name = name;
        this.password = password;
        this.dob = dob;
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
