package ru.zeidler.excelsior.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quotes", schema = "excelsior_db")
@Data
@EqualsAndHashCode(of="id")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private Date period;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="stock_id",nullable = false)
    private Stocks stock;

    private Double open;

    private Double high;

    private Double low;

    private Double close;

    private Double volume;
}
