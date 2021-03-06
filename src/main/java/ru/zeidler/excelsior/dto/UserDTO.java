package ru.zeidler.excelsior.dto;


import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
public class UserDTO extends AbstractDTO {
    public String name;
    public Double credit;
    public Double startCapital;
    public Double reserved;
    public String portfolio_code;
    public Double feePercent;
    public Double limitPercent;
    public Double maxRisk;
    public Boolean optimalCapital;
    public Boolean test;

    public List<PositionDTO> positions = new ArrayList<>();
}

