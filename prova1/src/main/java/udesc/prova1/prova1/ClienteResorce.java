/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udesc.prova1.prova1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udesc.prova1.prova1.Cliente;

/**
 *
 * @author Kleiton Bonin
 */
  @RestController
  @RequestMapping("/Cliente")
public class ClienteResorce {
  
    
    @Autowired
    private ClienteResorce clientes;
    
    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id){
        return clientes.findOne(id);
    }
    
    @GetMapping
    public List<Cliente> pesquisar(){
        return clientes.findAll();
    }
    
    @PostMapping
    public Cliente salvar (@RequestBody Cliente cliente){
        return clientes.save(cliente);
        
    }
    
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
       clientes.delete(id);
    }

}
