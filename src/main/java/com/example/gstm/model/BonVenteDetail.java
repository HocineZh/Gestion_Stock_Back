package com.example.gstm.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "bon_vente_detail")
@Data
@NoArgsConstructor
public class BonVenteDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "quantite")
    @Nonnull
    private int quantite;

    @Column(name = "prix_vente")
    @Nonnull
    private Double prix_vente;

    @Column(name = "type_quantite")
    @Nonnull
    private Double type_quantite;

    @ManyToOne
    @JoinColumn(name = "id_bon_vente")
    private BonVente bonVente;

    @ManyToOne
    @JoinColumn(name = "id_variation")
    private VariationProduit variationProduit;

}
