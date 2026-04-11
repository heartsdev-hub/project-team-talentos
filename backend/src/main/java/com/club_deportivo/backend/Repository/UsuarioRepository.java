package com.club_deportivo.backend.Repository;

import com.club_deportivo.backend.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
