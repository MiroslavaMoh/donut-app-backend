package com.tecsoftware.donut_app_backend.persistence.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table (name="clientes)")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private String idClientes;

    private String nombre;

    private String apellidos;

    private Long celular; //numero largos

    private String direccion;

    @Column(name="user_name")
    private String nombreUsuario; //numero largos

    private String password;

    @Column(name="correo_electronico")
    private String correoElectronico;

    @OneToMany (mappedBy="cliente")
    private List<Compras> compras;

    //Getters y setters - Evitar Terminaciones de relaciones
    public String getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(String idClientes) {
        this.idClientes = idClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
