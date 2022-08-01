package ru.zeidler.excelsior.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.zeidler.excelsior.dto.ExcelsiorDTO;

import ru.zeidler.excelsior.service.ExcesliorService;


import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/excelsior")
public class ExcelsiorController {


    private final ExcesliorService excelsiorService;


    @GetMapping(value = "/getbyticker", produces = MediaType.APPLICATION_JSON_VALUE)

    public ResponseEntity<List<ExcelsiorDTO>> getByTicker(@RequestParam String ticker,
                                                          @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d1,
                                                          @RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d2) {
             List<ExcelsiorDTO> exceslior = excelsiorService.GetExcelsior(ticker, d1, d2);

        return ResponseEntity.ok()
                .body(exceslior);
    }

    @GetMapping(value = "/getbyday", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ExcelsiorDTO>> getByTicker(@RequestParam @DateTimeFormat(pattern="dd-MM-yyyy") Date d) {
        List<ExcelsiorDTO> exceslior = excelsiorService.GetExceslior(d);
        return ResponseEntity.ok()
                .body(exceslior);
    }

}
