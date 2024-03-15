package com.xxxcrash.xxxcrash.feature.sessions.controller;

import com.xxxcrash.xxxcrash.feature.sessions.entity.SessionEntity;
import com.xxxcrash.xxxcrash.feature.sessions.service.SessionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    @PostMapping
    public SessionEntity createSession(@RequestBody SessionEntity sessionEntity) {
        return sessionService.createSession(sessionEntity);
    }

    @GetMapping
    public List<SessionEntity> getAllSessions() {
        return sessionService.getAllSessions();
    }

    @DeleteMapping("/{sessionId}")
    public void deleteSession(@PathVariable Long sessionId) {
        sessionService.deleteSession(sessionId);
    }
}
