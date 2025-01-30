package com.example.springboot_practice.domain.notification.application;

import com.example.springboot_practice.domain.notification.domain.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@RequiredArgsConstructor
public class SseEmitterService {
    private final Map<String, SseEmitter> emitters = new ConcurrentHashMap<>();

    public SseEmitter subscribe(String accountId) {
        SseEmitter emitter = new SseEmitter(Long.MAX_VALUE);
        emitters.put(accountId, emitter);

        emitter.onCompletion(() -> emitters.remove(accountId));
        emitter.onTimeout(() -> emitters.remove(accountId));
        emitter.onError((e) -> emitters.remove(accountId));

        return emitter;
    }

}
