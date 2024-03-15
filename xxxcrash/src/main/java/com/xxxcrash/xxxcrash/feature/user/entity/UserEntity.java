package com.xxxcrash.xxxcrash.feature.user.entity;

import com.xxxcrash.xxxcrash.feature.game.entity.GameEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date", nullable = false)
    private Date date;

    @Column(name = "balance", nullable = false)
    private Float balance;

    @OneToMany
    private List<GameEntity> games;

    UserEntity() {
    }

    public UserEntity(Long id, String login, String email, String password, Date date, Float balance) {
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

    public void setId(Long id_user) {
        this.id = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
