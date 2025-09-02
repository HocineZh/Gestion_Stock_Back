package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bon_achat_detail")
@Data
@NoArgsConstructor
public class BonAchatDetail {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "quantite")
    @Nonnull
    private int quantite;

    @Column(name = "prix")
    @Nonnull
    private double prix;


    @Column(name = "type_quantite")
    @Nonnull
    private double type_quantite;

    @ManyToOne
    @JoinColumn(name = "id_bon_achat")
    private BonAchat bonAchat;

    @ManyToOne
    @JoinColumn(name = "id_variation")
    private VariationProduit variationProduit;
}
