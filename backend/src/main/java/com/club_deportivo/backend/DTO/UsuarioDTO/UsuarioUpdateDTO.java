package com.club_deportivo.backend.DTO.UsuarioDTO;

import jakarta.validation.constraints.NotBlank;

public class UsuarioUpdateDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;
    @NotBlank(message = "El númerod e celular es obligatorio")
    private String num_celular;
    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;
}
