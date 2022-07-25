package ru.zeidler.excelsior.service;

import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.dto.QuoteDTO;

import java.util.Date;
import java.util.List;

public interface ExcesliorService {

    List<ExcelsiorDTO> GetExceslior(Date day);

    List<ExcelsiorDTO> GetExcelsior(String ticker, Date d1, Date d2);
}

