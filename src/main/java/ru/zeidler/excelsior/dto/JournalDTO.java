package ru.zeidler.excelsior.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.zeidler.excelsior.model.Stock;
import ru.zeidler.excelsior.model.Users;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class JournalDTO {
    private Users user;
    private List<Stock> Stocks;
    private Date period;
    private Long quantaty;
    private Double price;
    private Double fees;
    private Double summ;
}
