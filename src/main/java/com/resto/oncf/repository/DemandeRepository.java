package com.resto.oncf.repository;

import com.resto.oncf.model.Demande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.time.LocalDate;

public interface DemandeRepository extends JpaRepository<Demande, Long> {

    @Query(value = "SELECT * FROM demande WHERE username = ?1 AND Date = ?2",nativeQuery = true)
    Demande[] getdemande(String username, LocalDate Date);

    @Query(value = "SELECT * FROM demande WHERE Date = ?1",nativeQuery = true)
    Demande[] findAllbydate(LocalDate Date);

    @Query(value = "SELECT COUNT(*) FROM demande WHERE Date = ?1",nativeQuery = true)
    int countalldemande(LocalDate Date);

    @Query(value = "SELECT COUNT(*) FROM demande WHERE etat = 'prêt' AND Date = ?1 ",nativeQuery = true)
    int countpretdemande(LocalDate Date);

    @Query(value = "SELECT COUNT(*) FROM demande WHERE etat = 'en attente' AND Date = ?1 ",nativeQuery = true)
    int countenattentedemande(LocalDate Date);

    @Query(value = "SELECT COUNT(*) FROM demande WHERE etat = 'en préparation' AND Date = ?1",nativeQuery = true)
    int countenpreparationdemande(LocalDate Date);

    @Transactional
    @Modifying
    @Query(value="UPDATE demande SET etat = 'en préparation' WHERE id_demande = ?1",nativeQuery = true)
    int setpreparation(Long iddemande);

    @Transactional
    @Modifying
    @Query(value="UPDATE demande SET etat = 'prêt' WHERE id_demande = ?1",nativeQuery = true)
    int setpret(Long iddemande);

}
