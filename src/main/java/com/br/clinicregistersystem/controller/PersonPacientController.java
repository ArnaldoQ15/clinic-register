package com.br.clinicregistersystem.controller;

import com.br.clinicregistersystem.dto.PersonPacientInDto;
import com.br.clinicregistersystem.dto.PersonPacientOutDto;
import com.br.clinicregistersystem.model.PersonPacient;
import com.br.clinicregistersystem.service.PersonPacientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pacients")
public class PersonPacientController {

    @Autowired
    private PersonPacientService service;


    /**(GET) Find all pacients on database.*/
    @GetMapping
    public List<PersonPacientOutDto> findAllPacients() {
        return service.findAll();
    }


    /**(GET) Find pacient by Person ID.*/
    @GetMapping("/{personId}")
    public PersonPacientOutDto findId(@PathVariable Long personId) {
        return service.findId(personId);
    }


    /**(POST) Add new pacient on database.*/
    @PostMapping("/new")
    public ResponseEntity<PersonPacientOutDto> persist(@Valid @RequestBody PersonPacientInDto dto) {
        service.persist(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    /**(PUT) Update a pacient on database.*/
    @Transactional
    @PutMapping("/{personId}")
    public ResponseEntity<PersonPacient> updatePacient (@Valid @PathVariable Long personId, @RequestBody PersonPacientInDto dto) {
        service.update(personId, dto);
        return ResponseEntity.ok().build();
    }


    /**(DELETE) Active/inactive a pacient.*/
    @PutMapping("/{personId}/status")
    public ResponseEntity<Void> delete(@Valid @PathVariable Long personId) {
        service.delete(personId);
        return ResponseEntity.noContent().build();
    }

}