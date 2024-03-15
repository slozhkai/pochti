package com.xxxcrash.xxxcrash.feature.user.dto;

import java.util.Date;

public class UserDTOResponce {
    Long id;
    String login;
    String email;
    String password;
    Date date;
    Float balance;


    public UserDTOResponce(Long id, String login, String email, String password, Date date, float balance) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.date = date;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Date getDate() {
        return date;
    }
    public Float getBalance() {
        return balance;
    }
}
