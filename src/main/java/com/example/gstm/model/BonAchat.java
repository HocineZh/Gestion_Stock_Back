package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "bon_achat")
@Data
@NoArgsConstructor
public class BonAchat {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "date")
    @Nonnull
    private LocalDate date;

    @Column(name = "fournisseur")
    @Nonnull
    private String fournisseur;


    @Column(name = "total")
    @Nonnull
    private Double total;
}
