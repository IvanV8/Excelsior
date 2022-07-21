package ru.zeidler.excelsior.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "quotes",schema = "excelsior_db")
@Data
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "period",nullable = false)
    private Date period;

    @ManyToOne
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks stock;

    @Column(name = "open")
    private Double open;

    @Column(name="high")
    private Double high;

    @Column(name="low")
    private Double low;

    @Column(name="close")
    private Double close;

    @Column(name="volume")
    private Double volume;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
