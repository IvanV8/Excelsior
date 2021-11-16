package ru.zeidler.excelsior.service;

import ru.zeidler.excelsior.model.Users;

import java.util.List;

public interface UserService {
    Users addUsers(Users user);
    void delete (long id);
    Users editUser();
    List<Users> getAll();
}
