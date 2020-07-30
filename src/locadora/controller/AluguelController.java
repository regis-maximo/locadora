/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora.controller;

import locadora.dao.AluguelDao;
import locadora.model.Aluguel;

/**
 *
 * @author regis
 */
public class AluguelController {

    private AluguelDao aluguelDao = null;

    public AluguelController() {
        this.aluguelDao = new AluguelDao();
    }

    public void save(Aluguel aluguel) {
        aluguelDao.save(aluguel);
    }

}
