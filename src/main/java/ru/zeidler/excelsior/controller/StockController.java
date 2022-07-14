package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.service.StockService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<StockDTO>> getAllStocks() {
        return ResponseEntity.ok()
                .body(stockService.GetAllStocks());
    }

    @GetMapping(value = "/getbyticker", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StockDTO> getByTicker(@RequestParam String ticker) {
        return ResponseEntity.ok()
                .body(stockService.GetStockByTicker(ticker));
    }
}
