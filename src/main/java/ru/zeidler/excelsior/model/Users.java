package ru.zeidler.excelsior.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @Column(name = "id")
    private Long primaryId;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private Double Credit;

    @Column(name = "start_capital")
    private Double StartCapital;

    @Column(name = "reserved")
    private Double Reserved;

    @Column(name = "portfolio_code")
    private String Portfolio_code;

    @Column(name = "fee_percent")
    private Double FeePercent;

    @Column(name = "limit_percent")
    private Double LimitPercent;

    @Column(name = "max_risk")
    private Double MaxRisk;

    @Column(name = "optimal_capital")
    private Boolean OptimalCapital;

    @Column(name = "test")
    private Boolean Test;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy="user")
    @JoinColumn(name = "user_id")
    private List<PortfolioPosition> Portfolios =new ArrayList<>();
}



