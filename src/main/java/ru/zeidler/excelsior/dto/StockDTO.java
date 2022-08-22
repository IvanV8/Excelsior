package ru.zeidler.excelsior.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@RequiredArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class StockDTO extends AbstractDTO {

    Long id;
    String ticker;
    String company;
    Long lot;
    String alt_ticker;
}
