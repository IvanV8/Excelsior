package ru.zeidler.excelsior.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class ExcelsiorDTO extends AbstractDTO {
    private Date period;
    private StockDTO stock;
    private Double target;
    private Double exit;
    private Double power;

}
