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
    private Cliente nomeCliente;
    private Barbeiro nomeBarbeiros;
    private Servicos nomeServico;
    private LocalDateTime Horario;
    private Cliente cpf;

    public Agenda() {
    }

    public Agenda(int idAgenda, Cliente nomeCliente, Barbeiro nomeBarbeiros, Servicos nomeServico, LocalDateTime Horario, Cliente cpf) {
        this.idAgenda = idAgenda;
        this.nomeCliente = nomeCliente;
        this.nomeBarbeiros = nomeBarbeiros;
        this.nomeServico = nomeServico;
        this.Horario = Horario;
        this.cpf = cpf;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Barbeiro getNomeBarbeiros() {
        return nomeBarbeiros;
    }

    public void setNomeBarbeiros(Barbeiro nomeBarbeiros) {
        this.nomeBarbeiros = nomeBarbeiros;
    }

    public Servicos getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(Servicos nomeServico) {
        this.nomeServico = nomeServico;
    }

    public LocalDateTime getHorario() {
        return Horario;
    }

    public void setHorario(LocalDateTime Horario) {
        this.Horario = Horario;
    }

    public Cliente getCpf() {
        return cpf;
    }

    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Agenda{" + "idAgenda=" + idAgenda + ", nomeCliente=" + nomeCliente + ", nomeBarbeiros=" + nomeBarbeiros + ", nomeServico=" + nomeServico + ", Horario=" + Horario + ", cpf=" + cpf + '}';
    }

    

}
