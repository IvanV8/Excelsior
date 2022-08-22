package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Journal;
import ru.zeidler.excelsior.model.Stocks;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface JournalRepository extends JpaRepository<Journal, Long> {
    @Query(value = "SELECT * from excelsior_db.journal j " +
                   "WHERE  user_id = :uId AND " +
                   "period >= :d1 AND " +
                   "period <= :d2", nativeQuery = true)
    List<Journal> getJournal(Long uId, Date d1, Date d2);

}