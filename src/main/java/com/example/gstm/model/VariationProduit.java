package com.example.gstm.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class VariationProduit {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String couleur;

    private String taille;

    private String reference; // SKU

    private Double prix_min;

    private Double prix_max;

    @ManyToOne
    @JoinColumn(name = "id_produit")
    private Produit produit;


}
