/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.prova1.prova1;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Kleiton Bonin
 */
public interface ClienteReInterface extends JpaRepository<Cliente, Long> {
    
}
