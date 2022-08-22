package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.mapping.StockMapping;
import ru.zeidler.excelsior.mapping.UsersMapping;
import ru.zeidler.excelsior.model.Users;
import ru.zeidler.excelsior.repository.UserRepository;
import ru.zeidler.excelsior.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private final UserRepository userRepositary;

    @Autowired
    private final UsersMapping userMapping;


    @Override
    public List<UserDTO> findAll() {
        List<Users> u = userRepositary.findAll();
        return userMapping.toUserDTO(u);
    }

    @Override
    public UserDTO findById(Long id)  {

        return userMapping.toUserDTO( userRepositary.getById(id));

    }
}
