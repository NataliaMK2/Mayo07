package com.softtek.mayo07.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "lugares")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLugar;

    @Column(length = 40)
    private String nombreLugar;


}