package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "variation_produit")
public class VariationProduit {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "coleur")
    @Nonnull
    private String couleur;

    @Column(name = "taille")
    @Nonnull
    private String taille;

    @Column(name = "reference")
    @Nonnull
    private String reference;

    @Column(name = "prix_min")
    @Nonnull
    private Double prix_min;

    @Column(name = "prix_max")
    @Nonnull
    private Double prix_max;

    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;


}
