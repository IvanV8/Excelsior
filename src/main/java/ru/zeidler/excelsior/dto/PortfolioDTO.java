package ru.zeidler.excelsior.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
public class PortfolioDTO {

    private String name;
    private UserDTO user;
    private  List<PositionDTO>  positions;

    @Getter
    @Setter
    @RequiredArgsConstructor
    public class PositionDTO {
        private  StockDTO stock;
        private Long quantaty;
        private Double price;
        private Double summ;
    }

}
