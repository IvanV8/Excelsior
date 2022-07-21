package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.mapping.QuoteMapping;
import ru.zeidler.excelsior.model.Quote;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.repository.QuoteRepository;
import ru.zeidler.excelsior.service.QuoteService;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuoteServiceImpl implements QuoteService {


    private QuoteRepository quoteRepository;

    @Override
    public List<Quote> GetQuotes(Date day) {

        List<Quote> quotes = quoteRepository.findByPeriodIs( day);
        return quotes;
    }

    @Override
    public List<Quote> GetQuotes(String ticker, Date d1, Date d2) {
        List<Quote> quotes = quoteRepository.findByStock_TickerEqualsAndPeriodIsBetween(ticker, d1, d2);
        return quotes;

    }
}
