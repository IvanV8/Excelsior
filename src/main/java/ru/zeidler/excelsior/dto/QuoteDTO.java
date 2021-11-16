package ru.zeidler.excelsior.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
public class QuoteDTO {

    private Date period;
    private StockDTO stock;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
}
