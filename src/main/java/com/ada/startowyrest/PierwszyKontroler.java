package com.ada.startowyrest;

import org.springframework.web.bind.annotation.*;

@RestController
public class PierwszyKontroler {
    @RequestMapping(value = "api/hello", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }
    @RequestMapping(value="api/powitanie", method = RequestMethod.POST)
    public String przywitanir(@RequestParam String imie)
    {
        return "witaj "+imie;
    }
    @RequestMapping(value="api/osoba", method = RequestMethod.POST)
    public void osoba(@RequestBody Osoba osoba){
        System.out.println(osoba.imie);
    }
}
