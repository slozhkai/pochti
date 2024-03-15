package com.xxxcrash.xxxcrash.feature.roulette_history.repository;


import com.xxxcrash.xxxcrash.feature.roulette_history.entity.RouletteHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RouletteHistoryRepository extends JpaRepository<RouletteHistoryEntity, Long> {

}