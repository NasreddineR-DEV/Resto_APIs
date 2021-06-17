package com.resto.oncf.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table (name="reclamation")
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id_Reclamation;

    @NotBlank
    @Size(min=3, max = 50)
    private String Objet ;

    @NotBlank
    @Size(min=3, max = 50)
    private String Sujet;

    private LocalDate Date ;

    private String username ;

    private int vue ;

    public void setDate(LocalDate date) {
        Date = date;
    }

    public Reclamation(String Objet, String Sujet , String Username) {
        this.Objet = Objet;
        this.Sujet = Sujet;
        Date = java.time.LocalDate.now();
        username = Username ;
        vue = 0 ;
    }

    public Long getId_Reclamation() {
        return Id_Reclamation;
    }

    public void setId_Reclamation(Long id_Reclamation) {
        Id_Reclamation = id_Reclamation;
    }

    public String getObjet() {
        return Objet;
    }

    public void setObjet(String objet) {
        Objet = objet;
    }

    public String getSujet() {
        return Sujet;
    }

    public void setSujet(String sujet) {
        Sujet = sujet;
    }

    public LocalDate getDate() {
        return Date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVue() {
        return vue;
    }

    public void setVue(int vue) {
        this.vue = vue;
    }
}
