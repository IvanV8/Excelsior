package ru.zeidler.excelsior.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/portfliolist")
public class PorfolioListController {

    private final PortfolioService portflioListService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PortfolioDTO> getDataPers() {
        return ResponseEntity.ok(persListService.getDataPers());
    }

}
