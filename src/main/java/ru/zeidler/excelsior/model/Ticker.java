package ru.zeidler.excelsior.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "ticker")
@Table(schema = "excelsior_db")
@Data
public class Ticker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="stock")
    private String stock;

}
