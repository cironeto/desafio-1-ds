package dev.cironeto.desafio1ds.dto;

import java.time.Instant;
import java.io.Serializable;

public class ClientDto implements Serializable{
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private Instant birthDate;
    private Integer children;

    public ClientDto() {
    }

    public ClientDto(Long id, String name, String cpf, Double income, Instant birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }
}
