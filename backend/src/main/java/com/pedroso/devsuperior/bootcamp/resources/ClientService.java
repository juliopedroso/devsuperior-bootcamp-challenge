package com.pedroso.devsuperior.bootcamp.resources;

import java.util.List;

import com.pedroso.devsuperior.bootcamp.dto.ClientDTO;
import com.pedroso.devsuperior.bootcamp.entities.Client;
import com.pedroso.devsuperior.bootcamp.repositories.ClientRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository repository;

    public List<ClientDTO> findAll() {
        List<Client> list = repository.findAll();
        return list.stream().map(ClientDTO::new).toList();
    }
    
}
