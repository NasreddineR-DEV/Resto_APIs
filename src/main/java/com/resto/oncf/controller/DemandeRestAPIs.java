package com.resto.oncf.controller;


import com.resto.oncf.model.Demande;
import com.resto.oncf.repository.DemandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/demande/")
public class DemandeRestAPIs {

    LocalDate Date = java.time.LocalDate.now();

    @Autowired
    DemandeRepository demandeRepository;

    @PostMapping("adddemande")
    Demande adddemande(@RequestBody Demande dem){
        return demandeRepository.save(dem);
    }

    @GetMapping("getbyusername/{username}")
    Demande[] getdamande(@PathVariable String username){
        return demandeRepository.getdemande(username,Date);
    }

    @GetMapping("getdemande")
    Demande[] getalldemande(){
        return  demandeRepository.findAllbydate(Date);
    }

    @GetMapping("countall")
    int getcountall(){
        return demandeRepository.countalldemande(Date);
    }

    @GetMapping("countpret")
    int getcountpret(){
        return demandeRepository.countpretdemande(Date);
    }

    @GetMapping("countattente")
    int getcountattente(){
        return demandeRepository.countenattentedemande(Date);
    }

    @GetMapping("countpreparation")
    int getcountpreparation(){
        return demandeRepository.countenpreparationdemande(Date);
    }

    @PostMapping("setprepa/{iddemande}")
    int setpreparation(@PathVariable Long iddemande){
        return  demandeRepository.setpreparation(iddemande);
    }

    @PostMapping("setpret/{iddemande}")
    int setpret(@PathVariable Long iddemande){
        return  demandeRepository.setpret(iddemande);
    }
}
