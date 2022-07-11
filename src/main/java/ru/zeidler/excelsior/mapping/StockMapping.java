package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.model.Stocks;

@Mapper
public interface StockMapping {
    @Mappings({
            @Mapping(target="id", source="ID"),
            @Mapping(target="ticker", source="Ticker"),
            @Mapping(target="alt_ticker", source="Alt_Ticker"),
            @Mapping(target="lot", source="Lot"),
            @Mapping(target="company", source="Company")
    })
    StockDTO stockDTO(Stocks stock);

    @Mappings({
            @Mapping(target="ID", source="id"),
            @Mapping(target="Ticker", source="ticker"),
            @Mapping(target="Alt_ticker", source="alt_Ticker"),
            @Mapping(target="Lot", source="lot"),
            @Mapping(target="Company", source="company")
    })
    Stocks Stock(StockDTO stockDTO);

}
