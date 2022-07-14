package ru.zeidler.excelsior.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import ru.zeidler.excelsior.model.Users;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class JournalDTO extends AbstractDTO {
    private Users user;
    private List<StockDTO> stocks;
    private Date period;
    private Long quantaty;
    private Double price;
    private Double fees;
    private Double summ;
}
