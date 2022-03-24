package com.pedroso.devsuperior.bootcamp.resources;

import java.util.List;

import com.pedroso.devsuperior.bootcamp.dto.ClientDTO;
import com.pedroso.devsuperior.bootcamp.services.ClientService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id){
        return ResponseEntity.ok().body(service.findById(id));
    }


}
