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
    private Long id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private Users User;

    @ManyToOne
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks Stock;

    @Column(name = "period",nullable = false)
    private Date Period;

    @Column(name = "quantaty")
    private Long Quantaty;

    @Column(name = "price")
    private Double Price;

    @Column(name = "fees")
    private Double Fees;

    @Column(name = "summ")
    private Double Summ;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;

}
