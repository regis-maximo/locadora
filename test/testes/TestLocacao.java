/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.ArrayList;
import java.util.List;
import locadora.model.Aluguel;

/**
 *
 * @author regis
 */
public class TestLocacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Aluguel aluguel = new Aluguel();
        List filmes = new ArrayList();
        
        filmes.add("anaconda");
        filmes.add("titanic");
        filmes.add("monstros SA");
        
        aluguel.setFilmes(filmes);
                
        for(Object lista : aluguel.getFilmes()) {
            System.out.println(lista);
        }
        
    }
    
}
