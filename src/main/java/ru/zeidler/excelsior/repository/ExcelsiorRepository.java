package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Excelsior;
import ru.zeidler.excelsior.model.Quote;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ExcelsiorRepository extends JpaRepository<Quote, Long> {


    @Query(value="SELECT ex.*, ti.ticker FROM excelsior_db.excelsior  ex" +
            "     LEFT OUTER JOIN excelsior_db.stocks ti ON ex.stock_id = ti.id" +
            "     WHERE ex.period >= :PeriodStart" +
            "     AND ex.period <=:PeriodEnd" +
            "     AND ti.ticker = :Ticker",
            nativeQuery = true)
    List<Excelsior> findByStock_TickerEqualsAndPeriodIsBetween(String Ticker, Date PeriodStart, Date PeriodEnd);

    Optional<Excelsior> findByStock_TickerIsStartingWith(String Ticker);

    List<Excelsior> findByPeriodIs(Date Period);
}