package com.resto.oncf.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="plats")
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Plat ;

    @NotBlank
    @Size(min=3, max = 50)
    private String Nom_Plat;

    @NotBlank
    private float Prix ;

    @NotBlank
    private Integer Id_Menu ;

    public Plat() {}

    public Plat(@NotBlank String Nom_Plat, @NotBlank float Prix, @NotBlank Integer id_Menu) {
        this.Nom_Plat = Nom_Plat;
        this.Prix = this.Prix;
        Id_Menu = id_Menu;
    }

    public Long getId_Plat() {
        return Id_Plat;
    }

    public void setId_Plat(Long id_Plat) {
        Id_Plat = id_Plat;
    }

    public String getNom_Plat() {
        return Nom_Plat;
    }

    public void setNom_Plat(String nom_Plat) {
        Nom_Plat = nom_Plat;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }

    public Integer getId_Menu() {
        return Id_Menu;
    }

    public void setId_Menu(Integer id_Menu) {
        Id_Menu = id_Menu;
    }
}
