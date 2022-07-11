package ru.zeidler.excelsior.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "portfolio_position")
@Data
public class PortfolioPosition {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long Id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users User;

    @ManyToOne
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks  Stock;

    @Column(name = "quantaty")
    private Double Quantaty;

    @Column(name = "price")
    private Double Price;

    @Column(name = "Amount")
    private Double Amount;



}
