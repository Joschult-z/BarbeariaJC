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

    public Servicos() {
    }

    public Servicos(int idServicos, float preco) {
        this.idServicos = idServicos;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Servicos{" + "idServicos=" + idServicos + ", preco=" + preco + '}';
    }
    
    
    
}
