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
    private Long primaryId;

    @Column(name = "ticker", nullable = false)
    String ticker;

    @Column(name = "company", nullable = false)
    String company;

    @Column(name = "lot")
    Long lot;

    @Column(name = "alt_ticker")
    String alt_ticker;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
