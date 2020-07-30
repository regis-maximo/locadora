/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author regis
 */
public class TestDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
       String data = "09/07/1990";
       SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
       java.sql.Date dataSql = new java.sql.Date(formatar.parse(data).getTime());
       
        System.out.println(dataSql);
    }
    
}
