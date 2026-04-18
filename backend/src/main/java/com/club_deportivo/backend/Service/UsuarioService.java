package com.club_deportivo.backend.Service;

import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioCreateDTO;
import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioResponseDTO;
import com.club_deportivo.backend.Entity.Usuario;
import com.club_deportivo.backend.Exception.ResourceNotFoundException;
import com.club_deportivo.backend.Repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UsuarioService {
    private final PasswordEncoder passwordEncoder;
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(PasswordEncoder passwordEncoder, UsuarioRepository usuarioRepository) {
        this.passwordEncoder = passwordEncoder;
        this.usuarioRepository = usuarioRepository;
    }
    public UsuarioResponseDTO create (UsuarioCreateDTO usuarioCreateDTO){
        if(usuarioRepository.existsByEmail(usuarioCreateDTO.getEmail())){
            throw new ResourceNotFoundException("El email ya existe.");
        }
        Usuario usuario = Usuario.builder()
                .nombre(usuarioCreateDTO.getNombre())
                .apellido(usuarioCreateDTO.getApellido())
                .dni(usuarioCreateDTO.getDni())
                .num_celular(usuarioCreateDTO.getNum_celular())
                .direccion(usuarioCreateDTO.getDireccion())
                .email(usuarioCreateDTO.getEmail())
                .password(passwordEncoder.encode(usuarioCreateDTO.getPassword()))
                .activo(true)
                .build();
        Usuario userSave = usuarioRepository.save(usuario);

        return UsuarioResponseDTO.builder()
                .id(userSave.getId())
                .nombre(userSave.getNombre())
                .apellido(userSave.getApellido())
                .dni(userSave.getDni())
                .num_celular(userSave.getNum_celular())
                .direccion(userSave.getDireccion())
                .email(userSave.getEmail())
                .activo(userSave.isActivo())
                .createdAt(userSave.getCreatedAt())
                .updatedAt(userSave.getUpdatedAt())
                .build();
    }
}
