/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author 182120023
 */
public class Agenda {

    private int idAgenda;
    private Cliente nomeCliente;
    private Barbeiro nomeBarbeiros;
    private Servicos nomeServico;
    private LocalTime Horario;
    private LocalDate data;
    private Cliente cpf;
    private Servicos preco;

    public Agenda() {
    }

    public Agenda(int idAgenda, Cliente nomeCliente, Barbeiro nomeBarbeiros, Servicos nomeServico, LocalTime Horario, LocalDate data, Cliente cpf, Servicos preco) {
        this.idAgenda = idAgenda;
        this.nomeCliente = nomeCliente;
        this.nomeBarbeiros = nomeBarbeiros;
        this.nomeServico = nomeServico;
        this.Horario = Horario;
        this.data = data;
        this.cpf = cpf;
        this.preco = preco;
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

    public LocalTime getHorario() {
        return Horario;
    }

    public void setHorario(LocalTime Horario) {
        this.Horario = Horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCpf() {
        return cpf;
    }

    public void setCpf(Cliente cpf) {
        this.cpf = cpf;
    }

    public Servicos getPreco() {
        return preco;
    }

    public void setPreco(Servicos preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Agenda{" + "idAgenda=" + idAgenda + ", nomeCliente=" + nomeCliente + ", nomeBarbeiros=" + nomeBarbeiros + ", nomeServico=" + nomeServico + ", Horario=" + Horario + ", data=" + data + ", cpf=" + cpf + ", preco=" + preco + '}';
    }

   
}
