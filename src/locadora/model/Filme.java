/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.ArrayList;
import locadora.dao.FilmeDao;

/**
 *
 * @author regis
 */
public class Filme {
    
    private Integer codFilme;
    private String titulo;
    private String ator;
    private String genero;
    private String sinopse;
    private String midia;
    private int duracao;
    private double preco; 

    public Filme() {
    }

    public Filme(Integer codFilme, String titulo, String ator, String genero, String sinopse,
           String midia, Double preco, int duracao) {
        
        this.codFilme = codFilme;
        this.titulo = titulo;
        this.ator = ator;
        this.genero = genero;
        this.sinopse = sinopse;
        this.midia = midia;
        this.preco = preco;
        this.duracao = duracao;
    }

    public Integer getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getAtor() {
        return ator;
    }

    public void setAtor(String ator) {
        this.ator = ator;
    }

    public String getMidia() {
        return midia;
    }

    public void setMidia(String midia) {
        this.midia = midia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
