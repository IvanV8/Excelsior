package ru.zeidler.excelsior.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
public class StockDTO extends AbstractDTO {

    String ticker;
    String company;
    Long lot;
    String alt_ticker;
}
