package ru.zeidler.excelsior.mapping;

import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.Users;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface UsersMapping {

    public  UserDTO toUserDTO(Users user);
    public  List<UserDTO> toUserDTO(List<Users> user);
    public  Users toUser(UserDTO userDTO);
}
