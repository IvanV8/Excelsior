package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.model.Stocks;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StockMapping {

    public StockDTO stockDTO(Stocks stock);
    public List<StockDTO> stockDTO(List<Stocks> stockList);


    public Stocks Stock(StockDTO stockDTO);


}
