package com.devtiro.pharmacy.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_article", nullable = false)
    private String nameArticle; // Utilisation de camelCase ici

    @Column(name = "quantite")
    private double quantite;

    @Column(name = "prix")
    private int prix;

    @Column(name = "description")
    private String description;
}
