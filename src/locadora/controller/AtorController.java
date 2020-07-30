/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import locadora.dao.AtorDao;
import locadora.model.Ator;

/**
 *
 * @author regis
 */
public class AtorController {

    private AtorDao atordao;

    public AtorController() {
        atordao = new AtorDao();
    }

    public void save(String nome, String nacionalidade) {
//        AtorDao adao = new AtorDao();
        Ator ator = new Ator();
        ator.setNome(nome);
        ator.setNacionalidade(nacionalidade);
        atordao.save(ator);
    }

    public Ator pesquisar(String nome) {
        Ator ator;
        ator = atordao.buscar(nome);
        return ator;
    }

    public List<Ator> atualizarTabela() {
        List atores = atordao.buscarAtores();
        return atores;
    }

    public void desconectarBD() {
        atordao.descBD();
    }

    public void editarAtor(Ator ator) {
        atordao.editarAtor(ator);
    }
}
