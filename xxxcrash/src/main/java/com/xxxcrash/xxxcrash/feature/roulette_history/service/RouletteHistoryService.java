package com.xxxcrash.xxxcrash.feature.roulette_history.service;


import com.xxxcrash.xxxcrash.feature.roulette_history.entity.RouletteHistoryEntity;

import java.util.List;

public interface RouletteHistoryService {
    RouletteHistoryEntity createRouletteHistory(RouletteHistoryEntity rouletteHistoryEntity);
    List<RouletteHistoryEntity> getAllRouletteHistory();
    void deleteRouletteHistory(Long rouletteHistoryId);
}