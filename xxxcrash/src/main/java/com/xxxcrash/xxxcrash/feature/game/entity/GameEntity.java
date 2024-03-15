package com.xxxcrash.xxxcrash.feature.game.entity;

import com.xxxcrash.xxxcrash.feature.user.entity.UserEntity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "games")
public class GameEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_game", nullable = false)
    private Integer id_game;

    @Column(name = "kf", nullable = false)
    private Float kf;

    @Column(name = "result", nullable = false)
    private Float result;

    @Column(name = "end_session", nullable = false)
    private Date end_session;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
