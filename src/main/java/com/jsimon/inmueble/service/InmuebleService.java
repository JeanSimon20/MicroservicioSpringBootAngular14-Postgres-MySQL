package com.jsimon.inmueble.service;

import com.jsimon.inmueble.model.Inmueble;

import java.util.List;

public interface InmuebleService {
    Inmueble saveInmueble(Inmueble inmueble);

    Inmueble updateInmueble(Inmueble inmueble);

    void deleteInmueble(Long inmuebleId);

    List<Inmueble> findAllInmuebles();
}
