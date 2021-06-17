package com.resto.oncf.repository;

import com.resto.oncf.model.Demande;
import com.resto.oncf.model.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface FavorisRepository extends JpaRepository<Favoris, Long> {

    @Transactional
    @Modifying
    @Query(value="DELETE FROM favoris WHERE Id_Plat = ?1 AND username = ?2",nativeQuery = true)
    int deletefavoris(Long id_plat, String username);
}
