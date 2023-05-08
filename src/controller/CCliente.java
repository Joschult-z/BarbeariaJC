/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 182120023
 */
public class CCliente {
    
     ArrayList<Cliente> clientes = new ArrayList<>();
     int idCliente = 1;
     
     public int geraID() {
        return this.idCliente++;
 
           
     }
     
}
