package com.pedroso.devsuperior.bootcamp.dto;

import java.time.Instant;

import com.pedroso.devsuperior.bootcamp.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ClientDTO {
    
    private Long id;
    private String name;
    private String cpf;
    private double income;
    private Instant birthDate;
    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

}
