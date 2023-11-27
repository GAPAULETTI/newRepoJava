/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Gaston
 */
@Entity
@Table
public class Cliente {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native")
    private Long id;
    
    private int dni;
    private String nombreCompleto;
    private String direccion;
    private String email;
    
    @OneToMany(mappedBy = "dniClient", fetch = FetchType.EAGER)
    private Set<Orden> orden = new HashSet<>(); 

    public Cliente() {
    }

    public Cliente(int dni, String nombreCompleto, String direccion, String email) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public int getDni() {
        return dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public Set<Orden> getOrden() {
        return orden;
    }

    public void setOrden(Set<Orden> orden) {
        this.orden = orden;
    }
    
    
    
}
