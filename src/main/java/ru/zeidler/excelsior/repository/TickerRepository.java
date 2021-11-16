package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TickerRepository extends JpaRepository<Ticker, Long> {
}