package com.ada.startowyrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class OsobaService {
    public OsobaRepository osobaRepository;
    @Autowired
    public OsobaService(OsobaRepository osobaRepository)
    {
        this.osobaRepository= osobaRepository;
    }
    public Osoba saveUser(Osoba osoba){
        return osobaRepository.save(osoba);
    }
}
