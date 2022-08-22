package ru.zeidler.excelsior.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "portfolio_position",schema = "excelsior_db")
@Data
public class PortfolioPosition {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long primaryId;

    @ManyToOne(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", nullable=false)
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks stock;

    private Double quantaty;

    private Double price;

    private Double amount;


    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;


}
