package com.ranjith.Model;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class User {
    private String email;
    private String pwd;
    private String firstName;
    private String lastName;
    private String country;
    private String state;
    private String favoriteLanguage;
    private String operatingSystem;
    private LinkedHashMap<String, String> stateOptions;

    public User() {

        // populate state using java
        stateOptions = new LinkedHashMap<String, String>();

        stateOptions.put("TN", "Tamil Nadu");
        stateOptions.put("KL", "Kerala");
        stateOptions.put("MI", "Mumbai");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public LinkedHashMap<String, String> getStateOptions() {
        return stateOptions;
    }

    public void setStateOptions(LinkedHashMap<String, String> stateOptions) {
        this.stateOptions = stateOptions;
    }
}
