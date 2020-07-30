/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import locadora.dao.ClienteDao;
import locadora.model.Cliente;

/**
 *
 * @author regis
 */
public class ClienteController {

    private PreparedStatement pstm;
    private Connection conex;
    private ResultSet rs;
    ConnectionFactory connectionFactory;
    ClienteDao cdao;

    public ClienteController() {
//        this.conex = connectionFactory.conecta();
        this.cdao = new ClienteDao();
    }

    public void salvarCliente(Cliente cliente) {

        this.cdao.save(cliente);
    }

    public List<Cliente> atualizaTabela() {

        List clientes = this.cdao.atualizaTabela();
        return clientes;
    }

    public void updateCliente(Cliente cliente) {

        this.cdao.updateCliente(cliente);
    }

    public Cliente buscaCliente(String indice) {

        Cliente cliente;
        return cliente = this.cdao.buscarCliente(indice);
    }

    public Cliente buscaCliente(int codigo) {

        Cliente cliente;
        return cliente = this.cdao.buscarCliente(codigo);
    }

}
