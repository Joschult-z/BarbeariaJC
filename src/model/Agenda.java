/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import sun.util.resources.LocaleData;

/**
 *
 * @author 182120023
 */
public class Agenda {
    
    private int idAgenda;
    private Cliente cliente;
    private LocalDate Horario;
    private String telefone;

    public Agenda() {
    }

    public Agenda(int idAgenda, Cliente cliente, LocalDate Horario, String telefone) {
        this.idAgenda = idAgenda;
        this.cliente = cliente;
        this.Horario = Horario;
        this.telefone = telefone;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getHorario() {
        return Horario;
    }

    public void setHorario(LocalDate Horario) {
        this.Horario = Horario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Agenda{" + "idAgenda=" + idAgenda + ", cliente=" + cliente + ", Horario=" + Horario + ", telefone=" + telefone + '}';
    }

   
    
    
}
