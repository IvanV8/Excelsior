package ru.zeidler.excelsior.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;


@Entity
@Table(name = "portfolio")
@Data
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;


}
