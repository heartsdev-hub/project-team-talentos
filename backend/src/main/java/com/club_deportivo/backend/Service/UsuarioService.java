package com.club_deportivo.backend.Service;

import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioCreateDTO;
import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioResponseDTO;
import com.club_deportivo.backend.Entity.Usuario;
import com.club_deportivo.backend.Exception.ResourceNotFoundException;
import com.club_deportivo.backend.Repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UsuarioService {
    private final PasswordEncoder passwordEncoder;
    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    public UsuarioService(PasswordEncoder passwordEncoder, UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.passwordEncoder = passwordEncoder;
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }
    public UsuarioResponseDTO create (UsuarioCreateDTO usuarioCreateDTO){
        if(usuarioRepository.existsByEmail(usuarioCreateDTO.getEmail())){
            throw new ResourceNotFoundException("El email ya existe.");
        }
        usuarioCreateDTO.setNombre(usuarioCreateDTO.getNombre().toUpperCase());
        usuarioCreateDTO.setApellido(usuarioCreateDTO.getApellido().toUpperCase());
        Usuario usuario = new Usuario();
        modelMapper.map(usuarioCreateDTO,usuario);
        usuarioRepository.save(usuario);
        UsuarioResponseDTO usuarioResponseDTO = new UsuarioResponseDTO();

         modelMapper.map(usuario,usuarioResponseDTO);
         return usuarioResponseDTO;
    }
}
