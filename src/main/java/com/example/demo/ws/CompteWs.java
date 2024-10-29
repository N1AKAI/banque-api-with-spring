package com.example.demo.ws;

import com.example.demo.bean.Compte;
import com.example.demo.service.CompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compte")
public class CompteWs {

    @Autowired
    CompteService compteService;

    @GetMapping("rib/{rib}")
    public Compte findByRib(@PathVariable("rib") String rib) {
        return compteService.findByRib(rib);
    }

    @PostMapping("")
    public int save(@RequestBody Compte compte) {
        return compteService.save(compte);
    }

    @GetMapping("")
    public List<Compte> findAll() {
        return compteService.findAll();
    }
}
