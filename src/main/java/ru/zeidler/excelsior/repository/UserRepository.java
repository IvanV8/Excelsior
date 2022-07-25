package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.model.Users;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {

    Users findByName(String name);
    Users findByPrimaryId(Long uID);


}