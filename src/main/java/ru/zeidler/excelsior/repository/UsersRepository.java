package ru.zeidler.excelsior.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zeidler.excelsior.model.Users;



public interface UsersRepository extends JpaRepository<Users, Long> {

}
