package ru.zeidler.excelsior.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(of="id")
@Table(name = "users",schema = "excelsior_db")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    private String name;
    private Double credit;

    private Double startcapital;

    private Double reserved;

    private String portfolio_code;

    private Double feePercent;

    private Double limitPercent;

    private Double maxRisk;

    private Boolean optimalcapital;

    private Boolean test;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "user_id")
    private List<PortfolioPosition> portfolios =new ArrayList<>();

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

    public void Users() {
        createdAt = new Date();
        updatedAt = new Date();
    }
}



