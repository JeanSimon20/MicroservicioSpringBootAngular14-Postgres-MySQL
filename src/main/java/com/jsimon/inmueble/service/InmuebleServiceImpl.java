package com.jsimon.inmueble.service;

import com.jsimon.inmueble.model.Inmueble;
import com.jsimon.inmueble.repository.InmuebleRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InmuebleServiceImpl implements InmuebleService{

    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository repository) {
        this.inmuebleRepository = repository;
    }

    @Override
    public Inmueble saveInmueble(Inmueble inmueble){
        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public Inmueble updateInmueble(Inmueble inmueble){
        return inmuebleRepository.save(inmueble);
    }

    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);
    }

    @Override
    public List<Inmueble> findAllInmuebles(){
        return inmuebleRepository.findAll();
    }


}
