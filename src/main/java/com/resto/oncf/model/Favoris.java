package com.resto.oncf.model;

import javax.persistence.*;

@Entity
@Table (name="favoris")
public class Favoris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_favoris ;

    private Long Id_Plat ;

    private String username ;

    public Favoris(){}

    public Favoris(Long id_Plat, String username) {
        Id_Plat = id_Plat;
        this.username = username;
    }

    public Long getId_favoris() {
        return id_favoris;
    }

    public void setId_favoris(Long id_favoris) {
        this.id_favoris = id_favoris;
    }

    public Long getId_Plat() {
        return Id_Plat;
    }

    public void setId_Plat(Long id_Plat) {
        Id_Plat = id_Plat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
