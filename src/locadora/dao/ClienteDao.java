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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import locadora.model.Cliente;

/**
 *
 * @author regis
 */
public class ClienteDao {

    private PreparedStatement pstm;
    private Connection conex = null;
    private ResultSet rs;
    ConnectionFactory connectionFactory = new ConnectionFactory();

    public ClienteDao() {
        this.conex = connectionFactory.conecta();
    }

    public void save(Cliente cliente) {
        String sql = "INSERT INTO cliente(nome, cpf, dataNascimento, endereco, email, status)VALUES(?, ?, ?, ?, ?, ?)";
        try {
            pstm = this.conex.prepareStatement(sql);
            pstm.setString(1, cliente.getNome());
            pstm.setString(2, cliente.getCpf());

            // Tratamento da data para poder salvar em formato do banco de dados
            String dataString = cliente.getDtNascimento();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(dataString, formato);
            pstm.setDate(3, Date.valueOf(data));

            pstm.setString(4, cliente.getEndereco());
            pstm.setString(5, cliente.getEmail());
            pstm.setString(6, cliente.getStatus());

            pstm.execute();
            JOptionPane.showMessageDialog(null, "Cliente Salvado.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível salvar cliente: "
                    + ex.getMessage());
        } finally {
            ConnectionFactory.desconecta(conex, pstm);
        }
    }

    public List atualizaTabela() {

        String sql = "SELECT * FROM cliente";
        List clientes = new ArrayList();

        try {
            this.pstm = this.conex.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));

                Date dataNasc = rs.getDate("dataNascimento");
                cliente.setDtNascimento(dataNasc);

                cliente.setEmail(rs.getString("email"));
                cliente.setEndereco(rs.getString("endereco"));

                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em atualizar tabela: "
                    + ex.getMessage());
        }

        return clientes;
    }

    public void updateCliente(Cliente cliente) {

        String sql = "UPDATE cliente SET nome = ?, cpf = ?, dataNascimento = ?, "
                + "endereco = ?, email = ? WHERE codCliente = ?";

        try {
            this.pstm = this.conex.prepareStatement(sql);
            this.pstm.setString(1, cliente.getNome());
            this.pstm.setString(2, cliente.getCpf());

            String dataString = cliente.getDtNascimento();
            SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dataSql = new java.sql.Date(formatar.parse(dataString).getTime());
            this.pstm.setDate(3, dataSql);

            this.pstm.setString(4, cliente.getEndereco());
            this.pstm.setString(5, cliente.getEmail());
            this.pstm.setInt(6, cliente.getCodCliente());
            this.pstm.execute();

            JOptionPane.showMessageDialog(null, "Cliente Atualizado.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar cliente: "
                    + ex.getMessage());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível formatar data: "
                    + ex.getMessage());
        }
    }

    public Cliente buscarCliente(String indice) {

        String sql = "SELECT codCliente, nome, CPF, dataNascimento, endereco, email FROM cliente \n"
                + "WHERE nome LIKE '%" + indice + "%';";

        Cliente cliente = new Cliente();
        try {
            this.pstm = this.conex.prepareStatement(sql);
            this.rs = this.pstm.executeQuery();

            while (rs.next()) {
                cliente.setCodCliente(rs.getInt("codCliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setDtNascimento(rs.getDate("dataNascimento"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setEmail(rs.getString("email"));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer busca de cliente pelo"
                    + " campo de pesquisa: " + ex.getMessage());
        }
        return cliente;
    }

    public Cliente buscarCliente(int codigo) {

        String sql = "SELECT * FROM cliente WHERE codCliente = ?;";

        Cliente cliente = null;
        try {
            pstm = conex.prepareStatement(sql);
            pstm.setInt(1, codigo);
            rs = pstm.executeQuery();

            while (rs.next()) {
                cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setDtNascimento(rs.getDate("dataNascimento"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setEmail(rs.getString("email"));
                cliente.setStatus(rs.getString("status"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar busca "
                    + "pelo cliente informado: " + ex.getMessage());
        }
        return cliente;
    }
}
