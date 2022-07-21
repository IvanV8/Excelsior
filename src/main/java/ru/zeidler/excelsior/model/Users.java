package ru.zeidler.excelsior.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "users",schema = "excelsior_db")
public class Users {
    @Id
    @Column(name = "id")
    private Long primaryId;

    @Column(name = "name")
    private String name;

    @Column(name = "credit")
    private Double credit;

    @Column(name = "start_capital")
    private Double startcapital;

    @Column(name = "reserved")
    private Double reserved;

    @Column(name = "portfolio_code")
    private String portfolio_code;

    @Column(name = "fee_percent")
    private Double feePercent;

    @Column(name = "limit_percent")
    private Double limitPercent;

    @Column(name = "max_risk")
    private Double maxRisk;

    @Column(name = "optimal_capital")
    private Boolean optimalcapital;

    @Column(name = "test")
    private Boolean test;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<PortfolioPosition> portfolios =new ArrayList<>();

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}



