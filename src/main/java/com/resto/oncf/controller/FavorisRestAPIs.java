package com.resto.oncf.controller;

import com.resto.oncf.model.Favoris;
import com.resto.oncf.repository.FavorisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/favoris/")
public class FavorisRestAPIs {

    @Autowired
    FavorisRepository favorisRepository;

    @PostMapping("/addfavoris/{id_plat}/{username}")
    Favoris addfavoris(@PathVariable Long id_plat,@PathVariable String username){
        Favoris fav = new Favoris(id_plat,username);
        return favorisRepository.save(fav);

    }

    @DeleteMapping("/deletefavoris/{id_plat}/{username}")
    int deletefavoris(@PathVariable Long id_plat,@PathVariable String username){
        return favorisRepository.deletefavoris(id_plat,username);
    }

}
