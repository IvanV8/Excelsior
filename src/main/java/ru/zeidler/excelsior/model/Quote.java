package ru.zeidler.excelsior.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quotes")
@Data
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "period",nullable = false)
    private Date Period;

    @ManyToOne
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks Stock;

    @Column(name = "open")
    private Double Open;

    @Column(name="high")
    private Double High;

    @Column(name="low")
    private Double Low;

    @Column(name="close")
    private Double Close;

    @Column(name="volume")
    private Double volume;
}
