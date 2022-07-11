package ru.zeidler.excelsior.model;

import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "stocks")
@Data

public class Stocks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "ticker", nullable = false)
    String Ticker;

    @Column(name = "company", nullable = false)
    String Company;

    @Column(name = "lot")
    Long Lot;

    @Column(name = "alt_ticker")
    String Alt_ticker;




}
