package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bon_vente")
@Data
@NoArgsConstructor
public class BonVente {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date")
    @Nonnull
    private LocalDate date;


    @Column(name = "client")
    @Nonnull
    private String client;

    @Column(name = "total")
    @Nonnull
    private double total;
}
