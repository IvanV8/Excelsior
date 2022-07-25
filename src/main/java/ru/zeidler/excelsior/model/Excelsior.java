package ru.zeidler.excelsior.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "excelsior", schema = "excelsior_db")
@Data
public class Excelsior {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "period",nullable = false)
    private Date period;

    @ManyToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks  stock;

    @Column(name = "target")
    private Double target;

    @Column(name="exit")
    private Double exit;

    @Column(name="power")
    private Double power;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
