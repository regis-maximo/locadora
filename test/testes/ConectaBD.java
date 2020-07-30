/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import connection.ConnectionFactory;

/**
 *
 * @author regis
 */
public class ConectaBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConnectionFactory con = new ConnectionFactory();
        con.conecta();
    }
    
}
