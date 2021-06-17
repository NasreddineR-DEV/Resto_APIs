package com.resto.oncf.controller;

import com.resto.oncf.model.Reclamation;
import com.resto.oncf.repository.ReclamationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/reclamation/")
public class ReclamationAPIs {

    @Autowired
    ReclamationRepository reclamationRepository;

    @PostMapping("addrequest")
    Reclamation addrequest(@RequestBody Reclamation reclamation){
        return  reclamationRepository.save(reclamation);
    }
}
