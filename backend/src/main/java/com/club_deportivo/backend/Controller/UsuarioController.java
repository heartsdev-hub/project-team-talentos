package com.club_deportivo.backend.Controller;

import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioCreateDTO;
import com.club_deportivo.backend.DTO.UsuarioDTO.UsuarioResponseDTO;
import com.club_deportivo.backend.Service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @PostMapping("/create")
    public ResponseEntity<UsuarioResponseDTO> create(@RequestBody UsuarioCreateDTO usuarioCreateDTO){
        UsuarioResponseDTO usuarioResponseDTO = usuarioService.create(usuarioCreateDTO);
        return ResponseEntity.ok(usuarioResponseDTO);
    }
}
