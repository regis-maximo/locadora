/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;

/**
 *
 * @author regis
 */
public class Ator {
    
    private Integer codAtor;
    private String nome;
    private String nacionalidade;
    private ArrayList<Filme> filmes = new ArrayList<Filme>();

    public Integer getCodAtor() {
        return codAtor;
    }

    public void setCodAtor(Integer codAtor) {
        this.codAtor = codAtor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
}
