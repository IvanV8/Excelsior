package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Quote;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

    List<Quote> findByStock_TickerEqualsAndPeriodIsBetween(String Ticker, Date PeriodStart, Date PeriodEnd);


    Optional<Quote> findByStock_TickerIsStartingWith(String Ticker);

    List<Quote> findByPeriodIs(Date Period);
}