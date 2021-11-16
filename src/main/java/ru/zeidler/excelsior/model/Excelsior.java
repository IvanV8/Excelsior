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
    private Long id;

    @Column(name = "period",nullable = false)
    private Date period;

    @Column(name = "stock_id")
    private Long  stock_id;

    @Column(name = "target")
    private Double target;

    @Column(name="exit")
    private Double exit;

    @Column(name="power")
    private Double power;
}
