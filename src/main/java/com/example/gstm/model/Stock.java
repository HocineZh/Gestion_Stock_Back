package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stock")
@Data
@NoArgsConstructor
public class Stock {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "quantite")
    @Nonnull
    private int quantite;

    @Column(name = "type_quantite")
    @Nonnull
    private String type_quantite;

    @OneToOne
    @JoinColumn(name = "id_variation")
    private VariationProduit variationProduit;
}
