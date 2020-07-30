/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author regis
 */
public class Aluguel {
    
    private int osCod;
    private int codCliente;
    private int codFilme;
    private int quantidade;
    private Date dtAlugado;
    private Date dtDevolucao;
    private double preco;
    private double multa;
    private String pagou;
    
    private List filmes;

    public int getOsCod() {
        return osCod;
    }

    public void setOsCod(int osCod) {
        this.osCod = osCod;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(int codFilme) {
        this.codFilme = codFilme;
    }

    public Date getDtAlugado() {
        return dtAlugado;
    }

    public void setDtAlugado(Date dtAlugado) {
        this.dtAlugado = dtAlugado;
    }

    public Date getDtDevolucao() {
        return dtDevolucao;
    }

    public void setDtDevolucao(Date dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public List getFilmes() {
        return filmes;
    }

    public void setFilmes(List filmes) {
        this.filmes = filmes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getPagou() {
        return pagou;
    }

    public void setPagou(String pagou) {
        this.pagou = pagou;
    }
    
}
