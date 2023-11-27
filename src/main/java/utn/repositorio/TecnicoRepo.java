/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utn.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.model.Tecnico;

/**
 *
 * @author Gaston
 */
public interface TecnicoRepo extends JpaRepository<Tecnico, Long> {
    
}
