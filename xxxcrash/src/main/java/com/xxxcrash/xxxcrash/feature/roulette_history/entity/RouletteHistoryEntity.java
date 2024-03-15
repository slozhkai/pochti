package com.xxxcrash.xxxcrash.feature.roulette_history.entity;

import com.xxxcrash.xxxcrash.feature.user.entity.UserEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class RouletteHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_history", nullable = false)
    private Integer id_history;

    @Column(name = "kf", nullable = false)
    private Float kf;

    @Column(name = "result", nullable = false)
    private Float result;

    @OneToOne
    @JoinColumn(name = "id")
    private UserEntity user;


    public RouletteHistoryEntity(Integer id_history, Float kf, Float result, UserEntity user) {
        this.id_history = id_history;
        this.kf = kf;
        this.result = result;
        this.user = user;
    }

    public Integer getId_history() {
        return id_history;
    }

    public void setId_history(Integer id_history) {
        this.id_history = id_history;
    }

    public Float getKf() {
        return kf;
    }

    public void setKf(Float kf) {
        this.kf = kf;
    }

    public Float getResult() {
        return result;
    }

    public void setResult(Float result) {
        this.result = result;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}

