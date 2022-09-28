package com.jsimon.inmueble.controller;

import com.jsimon.inmueble.model.Inmueble;
import com.jsimon.inmueble.service.InmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @PostMapping
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
        return new ResponseEntity<>(inmuebleService.saveInmueble(inmueble),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateInmueble(@RequestBody Inmueble inmueble){
        return new ResponseEntity<>(inmuebleService.updateInmueble(inmueble),HttpStatus.CREATED);
    }

    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId){
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<?> getAllInmuebles(){
        return ResponseEntity.ok(inmuebleService.findAllInmuebles());
    }
}
