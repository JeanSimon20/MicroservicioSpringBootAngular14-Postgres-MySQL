package com.jsimon.inmueble.model;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "inmueble")
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 150, nullable = false)
    private String name;

    @Column(name = "direction", length = 500, nullable = false)
    private String direction;

    @Column(name = "picture", nullable = true)
    private String picture;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "fecha", nullable = false)
    private LocalDateTime fecha;
}
