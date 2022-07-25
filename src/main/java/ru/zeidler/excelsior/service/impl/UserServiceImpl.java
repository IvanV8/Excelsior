package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.model.Users;
import ru.zeidler.excelsior.repository.UserRepository;
import ru.zeidler.excelsior.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepositary;

    @Override
    public List<Users> findAll() {
        return userRepositary.findAll();
    }

    @Override
    public Users findById(Long id)  {


        return userRepositary.findByPrimaryId(id);

    }
}
