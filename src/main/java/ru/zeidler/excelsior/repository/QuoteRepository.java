package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Quote;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Long> {


    @Query(value="SELECT qu.*, ti.ticker FROM excelsior_db.quotes  qu" +
            "     LEFT OUTER JOIN excelsior_db.stocks ti ON qu.stock_id = ti.id" +
            "     WHERE qu.period >= :PeriodStart" +
            "     AND qu.period <=:PeriodEnd" +
            "     AND ti.ticker = :Ticker",
            nativeQuery = true)
    List<Quote> findByStock_TickerEqualsAndPeriodIsBetween(String Ticker, Date PeriodStart, Date PeriodEnd);

    Optional<Quote> findByStock_TickerIsStartingWith(String Ticker);

    List<Quote> findByPeriodIs(Date Period);
}