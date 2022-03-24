package com.pedroso.devsuperior.bootcamp.services;

import java.util.List;

import com.pedroso.devsuperior.bootcamp.dto.ClientDTO;
import com.pedroso.devsuperior.bootcamp.entities.Client;
import com.pedroso.devsuperior.bootcamp.resources.ClientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientResource {
    
    private final ClientService service;

    @GetMapping
    public ResponseEntity<List<ClientDTO>> findAll(){
        return ResponseEntity.ok().body(service.findAll());
    }

}
