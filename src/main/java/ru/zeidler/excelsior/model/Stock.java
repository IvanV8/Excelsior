package ru.zeidler.excelsior.model;

import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "stocks")
@Data

public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ticker", nullable = false)
    String ticker;

    @Column(name = "company", nullable = false)
    String company;

    @Column(name = "lot")
    Long lot;

    @Column(name = "alt_ticker")
    String alt_ticker;




}
