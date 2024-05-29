package com.inclusivamenteaba.api.entity.responsible;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDateTime;

public record NewResponsibleClientRequest(
        @NotBlank(message = "Nome é obrigatório")
        String name,
        @NotBlank(message = "CPF é obrigatório")
        @CPF
        String cpf,
        @NotBlank(message = "Email é obrigatório")
        @Email
        String email,
        @NotBlank
        String degreeOfKinship,
        @NotBlank(message = "Telefone é obrigatório")
        String telephone
) {
    public Responsible toModel() {
        return new Responsible(
                name,
                cpf,
                email,
                degreeOfKinship,
                telephone,
                LocalDateTime.now()
        );
    }
}
