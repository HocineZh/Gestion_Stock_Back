package com.example.gstm.model;

import jakarta.persistence.*;

public class Stock {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "quantite", nullable = false)
    private int quantite;


    @OneToOne
    @JoinColumn(name = "id_variation")
    private VariationProduit variationProduit;
}
