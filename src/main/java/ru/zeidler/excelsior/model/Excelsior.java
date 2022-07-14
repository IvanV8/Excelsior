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
    private Long Id;

    @Column(name = "period",nullable = false)
    private Date Period;

    @ManyToOne
    @JoinColumn(name="stock_id", nullable=false)
    private Stocks  Stock;

    @Column(name = "target")
    private Double Target;

    @Column(name="exit")
    private Double Exit;

    @Column(name="power")
    private Double Power;

    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    private Date updatedAt;
}
