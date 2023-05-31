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
    private float preco;
    private Cliente nomeCliente;
    private int quantidade;

    public Servicos() {
    }

    public Servicos(int idServicos, float preco, Cliente nomeCliente, int quantidade) {
        this.idServicos = idServicos;
        this.preco = preco;
        this.nomeCliente = nomeCliente;
        this.quantidade = quantidade;
    }

    public int getIdServicos() {
        return idServicos;
    }

    public void setIdServicos(int idServicos) {
        this.idServicos = idServicos;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Servicos{" + "idServicos=" + idServicos + ", preco=" + preco + ", nomeCliente=" + nomeCliente + ", quantidade=" + quantidade + '}';
    }

   
}
