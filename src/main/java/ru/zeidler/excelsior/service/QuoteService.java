package ru.zeidler.excelsior.service;

import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.model.Quote;

import java.util.Date;
import java.util.List;

@Service
public interface QuoteService {

    List<QuoteDTO> GetQuotes(Date day);

    List<QuoteDTO> GetQuotes(String ticker, Date d1, Date d2);

    void SaveQuote(QuoteDTO quoteDTO);
}

