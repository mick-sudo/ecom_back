package fr.insy2s.Commerce.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String adresse;

    private String ville;

    private String code_postal;

    private Boolean statut_adresse;

    @ManyToOne
    private Utliisateur utliisateur;

    @OneToMany(mappedBy = "adresse")
    private List<Facture> factures;

    @OneToMany(mappedBy = "adresse")
    private List<Commande> commandes;
}
