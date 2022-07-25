package ru.zeidler.excelsior.service;

import org.mapstruct.Mapper;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.Users;

import java.util.List;


public interface UserService {

      public List<Users> findAll();

      public Users findById(Long id);


}
