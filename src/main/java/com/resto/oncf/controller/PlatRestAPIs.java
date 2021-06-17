package com.resto.oncf.controller;

import com.resto.oncf.model.Demande;
import com.resto.oncf.model.Plat;
import com.resto.oncf.repository.PlatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/plat/")
public class PlatRestAPIs {

    @Autowired
    PlatRepository platRepository;

    @GetMapping("/getplatnotfavoris/{menu}/{username}")
    Object[] getplatnotfavoris(@PathVariable Integer menu , @PathVariable String username){

        return platRepository.getplatnonfavoris(menu,username);

    }

    @GetMapping("/getplatfavoris/{username}")
    Object[] getplatfavoris(@PathVariable String username){

        return platRepository.getplatfavoris(username);

    }

    @GetMapping("getplat")
    java.util.List<Plat> getallplat(){
        return platRepository.findAll();
    }

    @DeleteMapping("deleteplat/{idplat}")
    java.util.List<Plat> deleteplat(@PathVariable Long idplat){
        platRepository.deleteById(idplat);
        return platRepository.findAll();
    }

    @PostMapping("addplat")
    Long addplat(@RequestBody Plat plat){
         platRepository.save(plat);
        return plat.getId_Plat();
    }

    @PostMapping("updateplat/{idplat}/{nomplat}/{prix}/{idmenu}")
    Long updateplat(@PathVariable Long idplat,@PathVariable String nomplat,@PathVariable float prix,@PathVariable Integer idmenu){
         platRepository.updateplat(nomplat,prix,idmenu,idplat);
        return idplat;
    }

     @GetMapping("getbyid/{idplat}")
     Object[] getplatbyid(@PathVariable Long idplat){
        return platRepository.getplatbyid(idplat);
     }
}
