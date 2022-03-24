package com.pedroso.devsuperior.bootcamp.services;

import java.util.List;

import com.pedroso.devsuperior.bootcamp.dto.ClientDTO;
import com.pedroso.devsuperior.bootcamp.entities.Client;
import com.pedroso.devsuperior.bootcamp.repositories.ClientRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {

    private ClientRepository repository;

    @Transactional(readOnly = true)
    public List<ClientDTO> findAll() {
        List<Client> list = repository.findAll();
        return list.stream().map(ClientDTO::new).toList();
    }
    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        return new ClientDTO(repository.getById(id));
    }
    
}
