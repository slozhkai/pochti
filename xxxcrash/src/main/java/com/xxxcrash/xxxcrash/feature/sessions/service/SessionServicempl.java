package com.xxxcrash.xxxcrash.feature.sessions.service;

import com.xxxcrash.xxxcrash.feature.sessions.entity.SessionEntity;
import com.xxxcrash.xxxcrash.feature.sessions.repository.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionServicempl implements SessionService {

    private final SessionRepository sessionRepository;

    public SessionServicempl(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    @Override
    public SessionEntity createSession(SessionEntity sessionEntity) {
        return sessionRepository.save(sessionEntity);
    }

    @Override
    public List<SessionEntity> getAllSessions() {
        return sessionRepository.findAll();
    }

    @Override
    public void deleteSession(Long sessionId) {
        sessionRepository.deleteById(sessionId);
    }


}
