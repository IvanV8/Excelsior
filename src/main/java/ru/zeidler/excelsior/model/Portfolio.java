package ru.zeidler.excelsior.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "portfolio")
@Data
public class Portfolio {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_id")
    private Long  user_id;

    @Column(name = "stock_id")
    private Long  stock_id;

}
