package com.club_deportivo.backend.Entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "Usuario",
        uniqueConstraints = {
                @UniqueConstraint(
                        columnNames = {"Email"}
                )
        }
)
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    @Column(name = "Nombre",nullable = false)
    private String nombre;
    @Column(name = "Apellido",nullable = false)
    private String apellido;
    @Column(name = "Dni",nullable = false)
    private String dni;
    @Column(name = "Num_Celular",nullable = false)
    private String num_celular;
    @Column(name = "Direccion",nullable = false)
    private String direccion;
    @Column(name = "Email",nullable = false)
    private String email;
    @Column(name = "Password",nullable = false)
    private String password;
    @Column(name = "Activo",nullable = false)
    private boolean activo;
    @Column(name = "Fecha_desactivacion")
    private LocalDateTime fecha_desactivacion;
    @Column(name = "CreatedAt",nullable = false,updatable = false)
    private LocalDateTime CreatedAt;
    @Column(name = "UpdatedAt",nullable = false)
    private LocalDateTime UpdatedAt;
    @PrePersist
    protected void onCreate(){
        this.CreatedAt = LocalDateTime.now();
        this.UpdatedAt = LocalDateTime.now();
    }
    @PreUpdate
    protected void onUpdate(){
        this.UpdatedAt = LocalDateTime.now();
    }

    public Usuario() {
    }

    public Usuario(UUID id, String nombre, String apellido, String dni, String num_celular, String direccion, String email, String password, boolean activo, LocalDateTime fecha_desactivacion, LocalDateTime updatedAt) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.num_celular = num_celular;
        this.direccion = direccion;
        this.email = email;
        this.password = password;
        this.activo = activo;
        this.fecha_desactivacion = fecha_desactivacion;
        UpdatedAt = updatedAt;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNum_celular() {
        return num_celular;
    }

    public void setNum_celular(String num_celular) {
        this.num_celular = num_celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public LocalDateTime getFecha_desactivacion() {
        return fecha_desactivacion;
    }

    public void setFecha_desactivacion(LocalDateTime fecha_desactivacion) {
        this.fecha_desactivacion = fecha_desactivacion;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public LocalDateTime getUpdatedAt() {
        return UpdatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        UpdatedAt = updatedAt;
    }
}
