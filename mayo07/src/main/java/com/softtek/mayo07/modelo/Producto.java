package com.softtek.mayo07.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productop")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(length = 20, nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private double precioUnitario;

    @Column(nullable = false)
    private int unidadesStock;
}