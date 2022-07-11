package ru.zeidler.excelsior.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "excelsior")
@Data
public class Excelsior {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long Id;

    @Column(name = "period",nullable = false)
    private Date Period;

    @JoinColumn(name="stock_id", nullable=false)
    private Stocks  Stock;

    @Column(name = "target")
    private Double Target;

    @Column(name="exit")
    private Double Exit;

    @Column(name="power")
    private Double Power;
}
