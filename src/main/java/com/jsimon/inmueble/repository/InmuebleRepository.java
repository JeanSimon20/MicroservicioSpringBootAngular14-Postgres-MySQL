package com.jsimon.inmueble.repository;

import com.jsimon.inmueble.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {

}
