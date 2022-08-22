package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.service.QuoteService;
import ru.zeidler.excelsior.util.AppError;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/quotes")
public class QuotesController {


    private final QuoteService quoteService;



    @GetMapping(value = "/getbyticker", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<QuoteDTO>> getByTicker(@RequestParam String ticker,
                                                      @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d1,
                                                      @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d2) {
             List<QuoteDTO> quotes = quoteService.GetQuotes(ticker, d1, d2);

        return ResponseEntity.ok()
                .body(quotes);
    }

    @GetMapping(value = "/getbyday", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getByTicker(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d) {
        try {
                List<QuoteDTO> quotes = Optional.of(quoteService.GetQuotes(d)).orElseThrow();
                return new ResponseEntity<>(quotes, HttpStatus.OK);
             } catch (Exception e) {
                return new ResponseEntity<>(new AppError(HttpStatus.NOT_FOUND.value(),
                        "Quotes not found"),
                        HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = "/save", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveQuote(@RequestBody QuoteDTO q  ) {
        quoteService.SaveQuote(q);
        return ResponseEntity.ok().build();



    }

}
