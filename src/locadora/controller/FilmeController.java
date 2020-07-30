/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import java.util.List;
import locadora.dao.FilmeDao;
import locadora.model.Filme;

/**
 *
 * @author regis
 */
public class FilmeController {

    

    // método para fazer uma consulta de filme 
    public Filme consultarFilme(String titulo) {
        Filme filme;

        if ((!titulo.equals(""))) {
            FilmeDao filmeDao = new FilmeDao();
            filme = filmeDao.consulta(titulo);

            if (filme != null) {
                return filme;
            }
        }

        return null;
    }

    // método para atualizar a tabela mandando uma lista do tipo Filme
    public List<Filme> atualizarTabela() {
        FilmeDao fdao = new FilmeDao();
        List filmes = fdao.filmesDisposicao();
        return filmes;
    }

    // método para alterar dados de um filme
    public void editarFilme(Filme filme) {

        if (filme.getCodFilme() > 0) {
            FilmeDao filmedao = new FilmeDao();
            filmedao.updateFilme(filme);
        }
    }

    // método para dasatrar filme
    public void cadastrarFilme(String titulo, String genero, String sinopse, 
            int duracao, String ator, Double preco, String midia) {
        
        FilmeDao fdao = new FilmeDao();
        fdao.save(titulo, genero, sinopse, duracao, ator, preco, midia);
    }

    public Filme consultarFilme(int codigo) {

        Filme filme;
        FilmeDao fdao = new FilmeDao();
        return filme = fdao.consulta(codigo);
    }

}
