package com.xxxcrash.xxxcrash.feature.sessions.service;


import com.xxxcrash.xxxcrash.feature.sessions.entity.SessionEntity;

import java.util.List;

public interface SessionService {
    SessionEntity createSession(SessionEntity sessionEntity);
    List<SessionEntity> getAllSessions();
    void deleteSession(Long sessionId);

}
