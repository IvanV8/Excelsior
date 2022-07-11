package ru.zeidler.excelsior.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
public class PositionDTO {
    public UserDTO user;
    public  StockDTO stock;
    public Long quantaty;
    public Double price;
    public Double summ;

}
