package ru.zeidler.excelsior.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stocks",schema = "excelsior_db")
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

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
