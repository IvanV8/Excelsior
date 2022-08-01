package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Journal;
import ru.zeidler.excelsior.model.Stocks;

import java.util.Date;
import java.util.List;
import java.util.Optional;


public interface JournalRepository extends JpaRepository<Stocks, Long> {

    List<Journal> getJournal(Long uId, Date d1, Date d2);


}