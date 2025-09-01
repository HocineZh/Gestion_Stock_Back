package com.example.gstm.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class BonAchatDetail {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long idBonAchatDetail;

    private Integer quantite;

    private Double prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "id_bon_achat")
    private BonAchat bonAchat;

    @ManyToOne
    @JoinColumn(name = "id_variation")
    private VariationProduit variationProduit;
}
