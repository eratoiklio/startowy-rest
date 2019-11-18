package com.ada.startowyrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PierwszyKontroler {
    public OsobaService osobaService;

    @Autowired
    public PierwszyKontroler(OsobaService osobaService) {
        this.osobaService = osobaService;
    }

    @RequestMapping(value = "api/hello", method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "api/powitanie", method = RequestMethod.POST)
    public String przywitanir(@RequestParam String imie) {
        return "witaj " + imie;
    }

    @RequestMapping(value = "api/osoba", method = RequestMethod.POST)
    public void osoba(@RequestBody Osoba osoba) {
        osobaService.saveUser(osoba);
    }

    @RequestMapping(value="api/osoba", method=RequestMethod.GET)
    public Osoba pobierzOsoba(@RequestParam Long id){
        return osobaService.getUserById(id);
    }
}
