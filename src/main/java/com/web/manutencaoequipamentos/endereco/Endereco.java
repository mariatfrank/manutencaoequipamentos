package com.web.manutencaoequipamentos.endereco;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "address")
@Entity(name = "address")
@NoArgsConstructor
@AllArgsConstructor

public class Endereco {

    @Id
    private UUID addressId;

    @NotBlank
    private String cep;

    @NotBlank
    private String cidade;

    @NotBlank
    private String bairro;

    @NotBlank
    private String logradouro ;

    @NotBlank
    private Integer numero;

    @NotBlank
    private String complemento;
}
