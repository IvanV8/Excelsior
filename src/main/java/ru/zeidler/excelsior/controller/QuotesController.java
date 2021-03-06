package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.mapping.QuoteMapping;
import ru.zeidler.excelsior.model.Quote;
import ru.zeidler.excelsior.service.QuoteService;
import ru.zeidler.excelsior.service.StockService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quotes")
public class QuotesController {

    private final QuoteService quoteService;
    private final QuoteMapping quoteMapping;

    @GetMapping(value = "/getbyticker", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<QuoteDTO>> getByTicker(@RequestParam String ticker,
                                                      @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d1,
                                                      @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d2) {
             List<Quote> quotes = quoteService.GetQuotes(ticker, d1, d2);

        return ResponseEntity.ok()
                .body(quoteMapping.quoteDTO(quotes));
    }

    @GetMapping(value = "/getbyday", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<QuoteDTO>> getByTicker(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d) {
        List<Quote> quotes = quoteService.GetQuotes(d);
        return ResponseEntity.ok()
                .body(quoteMapping.quoteDTO(quotes));
    }

}
