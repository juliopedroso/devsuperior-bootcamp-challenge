package com.pedroso.devsuperior.bootcamp.repositories;

import com.pedroso.devsuperior.bootcamp.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
    
}
