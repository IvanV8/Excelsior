package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Stocks;

import java.util.List;
import java.util.Optional;

public interface StocksRepository extends JpaRepository<Stocks, Long> {
    //@Query(value = "SELECT * FROM stocks s " +
     //       "WHERE s.ticker = :ticker",
      //      nativeQuery = true)
    Optional<Stocks> findByTicker(String ticker);

    List<Stocks> findAllBy();

}