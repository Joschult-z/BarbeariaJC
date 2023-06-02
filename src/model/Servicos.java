/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 182120023
 */
public class Servicos {

    private int idServicos;
    private String nomeServico;
    private float preco;
    private Cliente nomeCliente;

    public Servicos() {
    }

    public Servicos(int idServicos, String nomeServico, float preco, Cliente nomeCliente) {
        this.idServicos = idServicos;
        this.nomeServico = nomeServico;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
    }

    public int getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int idServicos) {
        this.idServicos = idServicos;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cliente getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(Cliente nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Servicos{" + "idServicos=" + idServicos + ", nomeServico=" + nomeServico + ", preco=" + preco + ", nomeCliente=" + nomeCliente + '}';
    }

    

}
