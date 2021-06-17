package com.resto.oncf.repository;

import com.resto.oncf.model.Demande;
import com.resto.oncf.model.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface PlatRepository extends JpaRepository<Plat, Long> {

    @Query(value = "SELECT plats.Id_Plat,plats.Nom_Plat,plats.Prix , 1 as favoris ,image_table.pic_byte FROM plats ,favoris, image_table WHERE plats.Id_Plat = favoris.Id_Plat AND plats.Id_Menu = ?1 AND favoris.username = ?2 AND image_table.Id_Plat = plats.Id_Plat UNION SELECT plats.Id_Plat,plats.Nom_Plat,plats.Prix , 0 as favoris , image_table.pic_byte FROM plats,image_table WHERE plats.Id_Plat NOT IN (SELECT Id_Plat FROM favoris WHERE favoris.username = ?2) AND plats.Id_Menu = ?1 AND image_table.Id_Plat = plats.Id_Plat", nativeQuery = true)
    Object[] getplatnonfavoris(Integer menu , String username);

    @Query(value = "SELECT plats.Id_Plat,plats.Nom_Plat,plats.Prix , image_table.pic_byte FROM plats ,favoris, image_table WHERE favoris.username = ?1 AND plats.Id_Plat = favoris.Id_Plat  AND plats.Id_Plat = image_table.Id_Plat", nativeQuery = true)
    Object[] getplatfavoris(String username);

    @Query(value = "SELECT plats.Id_Plat,plats.Id_Menu,plats.Nom_Plat,plats.Prix , image_table.id,image_table.pic_byte FROM plats ,image_table WHERE plats.Id_Plat = ?1  AND plats.Id_Plat = image_table.Id_Plat", nativeQuery = true)
    Object[] getplatbyid(Long idplat);


    @Transactional
    @Modifying
    @Query(value = "UPDATE plats SET Nom_Plat = ?1, Prix= ?2, Id_Menu = ?3 WHERE Id_Plat = ?4",nativeQuery = true)
    int updateplat(String nomplat, float prix,Integer idmenu,Long idplat);
}
