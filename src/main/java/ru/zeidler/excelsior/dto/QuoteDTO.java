package ru.zeidler.excelsior.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


import java.util.Date;
@Getter
@Setter
@RequiredArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class QuoteDTO extends AbstractDTO {
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date period;
    @JsonSerialize(contentAs = StockDTO.class)
    private StockDTO stock;
    private Double open;
    private Double high;
    private Double low;
    private Double close;
    private Double volume;
}
