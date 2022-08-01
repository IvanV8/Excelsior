package ru.zeidler.excelsior.service;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.Users;

import java.util.List;

@Service
public interface UserService {

      public List<UserDTO> findAll();

      public UserDTO findById(Long id);


}
