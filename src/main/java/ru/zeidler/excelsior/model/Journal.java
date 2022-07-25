package ru.zeidler.excelsior.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "journal" ,schema = "excelsior_db")
@Data
public class Journal {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long primaryid;

    @ManyToOne(fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
    @JoinColumn(name ="user_id")
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks stock;

    @Column(name = "period",nullable = false)
    private Date period;

    @Column(name = "quantaty")
    private Long quantaty;

    @Column(name = "price")
    private Double price;

    @Column(name = "fees")
    private Double fees;

    @Column(name = "summ")
    private Double summ;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
