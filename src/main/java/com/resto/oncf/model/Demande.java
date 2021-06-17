package com.resto.oncf.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name= "demande")
public class Demande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_demande ;

    private Long id_plat ;

    private String username ;

    private String etat;

    private String nomplat;




    public Demande(){}

    public Demande(Long id_plat, String username, String etat, String nomplat) {
        this.id_plat = id_plat;
        this.username = username;
        this.etat = etat;
        this.nomplat = nomplat;

    }

    public Long getId_demande() {
        return id_demande;
    }

    public void setId_demande(Long id_demande) {
        this.id_demande = id_demande;
    }

    public Long getId_plat() {
        return id_plat;
    }

    public void setId_plat(Long id_plat) {
        this.id_plat = id_plat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getNomplat() {
        return nomplat;
    }

    public void setNomplat(String nomplat) {
        this.nomplat = nomplat;
    }
}
