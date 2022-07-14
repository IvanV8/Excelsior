package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.model.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsersMapping {

    public UserDTO userDTO(Users user);
    public List<UserDTO> userDTO(List<Users> usersList);


}
