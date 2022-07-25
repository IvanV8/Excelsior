package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.service.QuoteService;
import ru.zeidler.excelsior.service.StockService;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stocks")
public class StockController {


    private final StockService stockService;


    @GetMapping(value = "/getbyticker", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<StockDTO> getByTicker(@RequestParam String ticker) {
             StockDTO stock = stockService.GetStockByTicker(ticker);

        return ResponseEntity.ok()
                .body(stock);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> getAll() {
        List<StockDTO> stocks = stockService.GetAllStocks();
        return ResponseEntity.ok()
                .body(stocks);
    }

}
