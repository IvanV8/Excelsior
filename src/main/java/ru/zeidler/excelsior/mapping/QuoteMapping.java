package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.dto.UserDTO;
import ru.zeidler.excelsior.model.Quote;
import ru.zeidler.excelsior.model.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuoteMapping {

    public QuoteDTO quoteDTO(Quote quote);
    public List<QuoteDTO> quoteDTO(List<Quote> quoteList);


}
