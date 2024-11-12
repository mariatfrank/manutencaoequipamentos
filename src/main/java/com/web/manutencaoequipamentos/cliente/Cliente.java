package com.web.manutencaoequipamentos.cliente;

import java.sql.Date;
import com.web.manutencaoequipamentos.address.Endereco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "user")
@Entity(name = "user")
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

    @Id
    private Integer userId;

    @NotBlank
    private String nome;

    @NotBlank
    private String cpf;

    @NotBlank
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    private String telefone;

    @NotBlank
    private String senha;

    @NotBlank
    private Date dataNascimento;

    @NotBlank
    private Endereco endereco;
    
}
