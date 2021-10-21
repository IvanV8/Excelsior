package ru.zeidler.excelsior.model;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "deal")
@Setter
@Getter
@RequiredArgsConstructor
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "period",nullable = false)
    private Date period;
    @ManyToOne
    private Ticker ticker;
    @Column(name = "open")
    private float open;
    @Column(name="high")
    private float high;
    @Column(name="low")
    private float low;
    @Column(name="close")
    private float close;
    @Column(name="volume")
    private float volume;
}
