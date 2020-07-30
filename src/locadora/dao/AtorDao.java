/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import locadora.model.Ator;
import locadora.model.Filme;

/**
 *
 * @author regis
 */
public class AtorDao {

    private Connection conex = null;
    ConnectionFactory connectionFactory = new ConnectionFactory();
    PreparedStatement pstm = null;

    public AtorDao() {
        this.conex = connectionFactory.conecta();
    }

    public void save(Ator ator) {
        String sql = "insert into ator(nome, nacionalidade)values(?, ?)";
        try {
            pstm = this.conex.prepareStatement(sql);
            pstm.setString(1, ator.getNome());
            pstm.setString(2, ator.getNacionalidade());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Autor Salvado.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar ator: "
                    + ex.getMessage());
        } finally {
            ConnectionFactory.desconecta(conex, pstm);
        }
    }

    public Ator buscar(String nome) {
        String sql = "Select * from ator Where nome LIKE" + "'%" + nome + "%'";
        ResultSet rs;

        try {
            pstm = conex.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Ator ator = new Ator();
                ator.setCodAtor(rs.getInt("codAtor"));
                ator.setNome(rs.getString("nome"));
                ator.setNacionalidade(rs.getString("nacionalidade"));
                return ator;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer busca: " + e.getMessage());
            ConnectionFactory.desconecta(conex, pstm);
        }
        return null;
    }

    public List<Ator> buscarAtores() {
        List atores = new ArrayList<>();
        String sql = "select * from ator";
        ResultSet rs = null;

        try {
            this.pstm = this.conex.prepareStatement(sql);
            rs = this.pstm.executeQuery();

            while (rs.next()) {
                Ator ator = new Ator();
                ator.setCodAtor(rs.getInt("codAtor"));
                ator.setNome(rs.getString("nome"));
                ator.setNacionalidade(rs.getString("nacionalidade"));
                atores.add(ator);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar buscar atores: "
                    + ex.getMessage());
        }
        return atores;
    }

    public void descBD() {
        try {
            this.pstm.close();
            this.conex.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em descBD: " + ex.getMessage());
        }
    }

    public void editarAtor(Ator ator) {
            
        String sql = "UPDATE ator SET nome = ?, nacionalidade = ? WHERE codAtor = ?";
        
        try {
            this.pstm = this.conex.prepareStatement(sql);
            this.pstm.setString(1, ator.getNome());
            this.pstm.setString(2, ator.getNacionalidade());
            this.pstm.setInt(3, ator.getCodAtor());
            this.pstm.execute();
            JOptionPane.showMessageDialog(null, "Ator Editado com Sucesso.");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Não foi possível editar Ator: " +
                    ex.getMessage());
        } 
        
        /* finally {
            try {
                this.pstm.close();
                this.conex.close();
                
            } catch (SQLException ex) {
                
               JOptionPane.showMessageDialog(null, "Não foi possível desconectar com Banco: " +
                    ex.getMessage());
            } */
    }

}
