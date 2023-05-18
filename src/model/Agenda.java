/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import sun.util.resources.LocaleData;

/**
 *
 * @author 182120023
 */
public class Agenda {
    
    private int idAgenda;
    private Cliente cliente;
    private LocalDateTime Horario;
    private Barbeiro nomeBarbeiros;

    public Agenda() {
    }

    public Agenda(int idAgenda, Cliente cliente, LocalDateTime Horario, Barbeiro nomeBarbeiros) {
        this.idAgenda = idAgenda;
        this.cliente = cliente;
        this.Horario = Horario;
        this.nomeBarbeiros = nomeBarbeiros;
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

    public LocalDateTime getHorario() {
        return Horario;
    }

    public void setHorario(LocalDateTime Horario) {
        this.Horario = Horario;
    }

    public Barbeiro getNomeBarbeiros() {
        return nomeBarbeiros;
    }

    public void setNomeBarbeiros(Barbeiro nomeBarbeiros) {
        this.nomeBarbeiros = nomeBarbeiros;
    }

    @Override
    public String toString() {
        return "Agenda{" + "idAgenda=" + idAgenda + ", cliente=" + cliente + ", Horario=" + Horario + ", nomeBarbeiros=" + nomeBarbeiros + '}';
    }

    
    
}
