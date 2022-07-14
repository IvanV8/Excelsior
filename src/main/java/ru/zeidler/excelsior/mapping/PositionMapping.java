package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import ru.zeidler.excelsior.dto.PositionDTO;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.PortfolioPosition;
import ru.zeidler.excelsior.model.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PositionMapping {

    public PositionDTO toPositionDTO(PortfolioPosition position);
    public List<PositionDTO> toPositionDTO(List<PortfolioPosition> position);
    public PortfolioPosition toPortfolioPosition(PositionDTO positionDTO);
}
