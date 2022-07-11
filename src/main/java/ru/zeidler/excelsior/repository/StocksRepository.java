package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zeidler.excelsior.model.Stocks;

public interface StocksRepository extends JpaRepository<Stocks, Long> {
    Stocks findByTicker(String ticker);

}