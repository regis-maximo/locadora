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
import locadora.model.Filme;

/**
 *
 * @author regis
 */
public class FilmeDao {

    Connection conex = null;
    ConnectionFactory connectionFactory = new ConnectionFactory();
    PreparedStatement psmt = null;
    ResultSet rs = null;

    public FilmeDao() {
        conex = connectionFactory.conecta();
    }

    public void save(String titulo, String genero, String sinopse,
            int duracao, String ator, Double preco, String midia) {

        String sql = "INSERT INTO filme (titulo, ator, genero, sinopse, duracao, midia, preco)\n"
                + "VALUES(?, ?, ?, ?, ?, ?, ?);";

        try {
            psmt = conex.prepareStatement(sql);
            psmt.setString(1, titulo);
            psmt.setString(2, ator);
            psmt.setString(3, genero);
            psmt.setString(4, sinopse);
            psmt.setInt(5, duracao);
            psmt.setString(6, midia);
            psmt.setDouble(7, preco);

            psmt.execute();
            JOptionPane.showMessageDialog(null, "Filme Cadastrado com Sucesso.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro Ao salvar: " + ex.getMessage());

        } finally {
            ConnectionFactory.desconecta(conex, psmt);
        }
    }

    public Filme consulta(String titulo) {

        String sql = "Select * from filme Where titulo LIKE" + "'%" + titulo + "%'";
        try {
            psmt = conex.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setCodFilme(rs.getInt("codFilme"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setAtor(rs.getString("ator"));
                filme.setGenero(rs.getString("genero"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getInt("duracao"));
                filme.setMidia(rs.getString("midia"));
                filme.setPreco(rs.getDouble("preco"));

                return filme;
            }

        } catch (SQLException e) {
            System.err.println("Não foi possível fazer a consulta: "
                    + e.getMessage());
        } finally {
            ConnectionFactory.desconecta(conex, psmt);
        }

        return null;
    }

    public List<Filme> filmesDisposicao() {
        String sql = "SELECT * FROM filme;";
        List filmes = new ArrayList<>();

        try {
            psmt = conex.prepareStatement(sql);
            rs = psmt.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setCodFilme(rs.getInt("codFilme"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setAtor(rs.getString("ator"));
                filme.setGenero(rs.getString("genero"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getInt("duracao"));
                filme.setMidia(rs.getString("midia"));
                filme.setPreco(rs.getDouble("preco"));

                filmes.add(filme);

            }
        } catch (SQLException ex) {
            System.err.println("Erro para atuta.izar tabela: " + ex.getMessage());
        } finally {
            ConnectionFactory.desconecta(conex, psmt);
        }
        return filmes;
    }

    public void updateFilme(Filme filme) {
        String sql = "UPDATE `filme` SET `titulo`= ?,`ator`= ?,`genero`= ?,`sinopse`= ?,`duracao`= ?,`midia`= ?,`preco`= ? WHERE `codFilme` = ?;";

        try {
            psmt = conex.prepareStatement(sql);
            psmt.setString(1, filme.getTitulo());
            psmt.setString(2, filme.getAtor());
            psmt.setString(3, filme.getGenero());
            psmt.setString(4, filme.getSinopse());
            psmt.setInt(5, filme.getDuracao());
            psmt.setString(6, filme.getMidia());
            psmt.setDouble(7, filme.getPreco());
            psmt.setInt(8, filme.getCodFilme());

            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Alterados com Sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar filme:\n"
                    + ex.getMessage());
        } finally {
            ConnectionFactory.desconecta(conex, psmt);
        }
    }

    public Filme consulta(int codigo) {

        String sql = "SELECT * FROM filme WHERE codFilme = ?;";
        Filme filme = null;
        try {
            psmt = conex.prepareStatement(sql);
            psmt.setInt(1, codigo);
            rs = psmt.executeQuery();
            while (rs.next()) {
                filme = new Filme();
                filme.setCodFilme(rs.getInt("codFilme"));
                filme.setTitulo(rs.getString("titulo"));
                filme.setAtor(rs.getString("ator"));
                filme.setGenero(rs.getString("genero"));
                filme.setSinopse(rs.getString("sinopse"));
                filme.setDuracao(rs.getInt("duracao"));
                filme.setMidia(rs.getString("midia"));
                filme.setPreco(rs.getDouble("preco"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar busca "
                    + "pelo filme: " + ex.getMessage());
        }
        return filme;
    }

}
