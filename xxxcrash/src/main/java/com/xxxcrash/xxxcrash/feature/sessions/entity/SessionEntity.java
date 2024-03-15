package com.xxxcrash.xxxcrash.feature.sessions.entity;

import com.xxxcrash.xxxcrash.feature.user.entity.UserEntity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class SessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session", nullable = false)
    private Integer id_session;

    @Column(name = "end_session", nullable = false)
    private Date end_session;

    @OneToOne
    @JoinColumn(name = "id")
    private UserEntity user;

    public SessionEntity(Integer id_session, Date end_session, UserEntity user) {
        this.id_session = id_session;
        this.end_session = end_session;
        this.user = user;
    }

    public Integer getId_session() {
        return id_session;
    }

    public void setId_session(Integer id_session) {
        this.id_session = id_session;
    }

    public Date getEnd_session() {
        return end_session;
    }

    public void setEnd_session(Date end_session) {
        this.end_session = end_session;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}


