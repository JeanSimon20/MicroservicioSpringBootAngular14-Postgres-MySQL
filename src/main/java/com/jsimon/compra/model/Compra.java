package com.jsimon.compra.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "compra")
public class Compra implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "inmueble_id", nullable = false)
    private Long inmuebleId;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "fechacompra",nullable = false)
    private LocalDateTime fechacompra;

}
