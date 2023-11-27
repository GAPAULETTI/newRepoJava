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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Gaston
 */
@Entity
public class Orden {
    
       
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native")
    private Long id;
    
    private String descripcion;
    private Double costo;
    private LocalDateTime fechaOrden;
    private LocalDateTime fechaEstimada;
    private Boolean estado;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Dni_Cliente")
    private Cliente dniCliente;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Cateogria")
    private Categoria idCategoria;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="Tecnico")
    private Tecnico idTecnico;

    public Orden() {
    }

    public Orden(String descripcion, Double costo, LocalDateTime fechaOrden, LocalDateTime fechaEstimada, Boolean estado) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.fechaOrden = fechaOrden;
        this.fechaEstimada = fechaEstimada;
        this.estado = estado;
    }
    
    

    public Long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getCosto() {
        return costo;
    }

    public LocalDateTime getFechaOrden() {
        return fechaOrden;
    }

    public LocalDateTime getFechaEstimada() {
        return fechaEstimada;
    }

    public Boolean getEstado() {
        return estado;
    }
    
    
    
}
