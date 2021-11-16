package ru.zeidler.excelsior.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class UserDTO {
    public String name;
    public Double Credit;
    public Double StartCapital;
    public Double Reserved;
    public String Portfolio_code;
    public Double FeePercent;
    public Double LimitPercent;
    public Double MaxRisk;
    public Boolean OptimalCapital;
    public Boolean Test;
}

