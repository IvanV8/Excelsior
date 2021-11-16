package ru.zeidler.excelsior.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class StockDTO {
    String ticker;
    String company;
    Long lot;
    String alt_ticker;
}
