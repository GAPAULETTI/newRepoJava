/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utn.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import utn.model.Cliente;

/**
 *
 * @author Gaston
 */

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
    
}
