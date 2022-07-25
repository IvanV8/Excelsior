package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.model.Excelsior;
import ru.zeidler.excelsior.model.Quote;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExcelsiorMapping {

    public ExcelsiorDTO excelsiorDTO(Excelsior excelsior);
    public List<ExcelsiorDTO> excelsiorDTO(List<Excelsior> excelsiorList);

    public Excelsior Excelsior(ExcelsiorDTO excelsiorDTO);
}
