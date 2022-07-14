package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.model.Stocks;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StockMapping {
    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="ticker", source="ticker"),
            @Mapping(target="alt_ticker", source="alt_ticker"),
            @Mapping(target="lot", source="lot"),
            @Mapping(target="company", source="company")
    })
    public StockDTO stockDTO(Stocks stock);
    public List<StockDTO> stockDTO(List<Stocks> stockList);

    @Mappings({
            @Mapping(target="id", source="id"),
            @Mapping(target="ticker", source="ticker"),
            @Mapping(target="alt_ticker", source="alt_ticker"),
            @Mapping(target="lot", source="lot"),
            @Mapping(target="company", source="company")
    })
    public Stocks Stock(StockDTO stockDTO);


}
