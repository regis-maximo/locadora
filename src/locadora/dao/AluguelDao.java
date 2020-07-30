/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import locadora.model.Aluguel;

/**
 *
 * @author regis
 */
public class AluguelDao {
    
    private PreparedStatement pstm = null;
    private Connection conex;
    private ResultSet rss = null;
    private ConnectionFactory connectionFactory;
    
    public AluguelDao() {
            this.connectionFactory = new ConnectionFactory();
            this.conex = connectionFactory.conecta();
        if (conex != null) {
            JOptionPane.showMessageDialog(null, "Conseguiu conectar");
        } else {
            JOptionPane.showMessageDialog(null, "não conectou");
        }
    }

    public void save(Aluguel aluguel) {
        
        String sql = "INSERT INTO aluguel (codCliente, dtAlugado, dtDevolucao, quantidade, preco, multa, pagou)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            pstm = conex.prepareStatement(sql);
            pstm.setInt(1, aluguel.getCodCliente());
            pstm.setDate(2, (Date) aluguel.getDtAlugado());
            pstm.setDate(3, (Date) aluguel.getDtDevolucao());
            pstm.setInt(4, aluguel.getQuantidade());
            pstm.setDouble(5, aluguel.getPreco());
            pstm.setDouble(6, aluguel.getMulta());
            pstm.setString(7, aluguel.getPagou());
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Dados Salvos No Banco de Dados.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar dados: " +
                    ex.getMessage());
        } finally {
            try {
                this.conex.close();
            } catch (SQLException ex) {
                System.err.println("Erro:" + ex.getMessage());
            }
        }
    }
    
    
}
