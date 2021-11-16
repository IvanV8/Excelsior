package ru.zeidler.excelsior.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "journal")
@Data
public class Journal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private Users User;

    @OneToMany
    @JoinColumn(name = "stock_id")
    private List<Stock> Stocks;

    @Column(name = "period",nullable = false)
    private Date period;

    @Column(name = "quantaty")
    private Long Quantaty;

    @Column(name = "price")
    private Double Price;

    @Column(name = "fees")
    private Double Fees;

    @Column(name = "summ")
    private Double Summ;

}
