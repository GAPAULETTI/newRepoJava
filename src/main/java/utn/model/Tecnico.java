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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Gaston
 */
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native")
    private Long id;
    
    private String nombreTecnico;
    
    private Set<Categoria> servicios = new HashSet<>();
    
    @OneToMany(mappedBy = "idTecnico", fetch = FetchType.EAGER)
    private Set<Orden> order = new HashSet<>();
    
   
    
    public Tecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
        
    }

    public Long getId() {
        return id;
    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public Set<Categoria> getServicios() {
        return servicios;
    }

    public void setServicios(Set<Categoria> servicios) {
        this.servicios = servicios;
    }

    public Set<Orden> getOrder() {
        return order;
    }

    public void setOrder(Set<Orden> order) {
        this.order = order;
    }

   
    public void addServicio(Categoria servicio){
        this.servicios.add(servicio);
    }
    
    
   
}
