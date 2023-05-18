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
public class Barbeiro {

    private int idBarbeiro;
    private String nomeBarbeiro;
    private String telefone;
    private String cpf;

    public Barbeiro() {
    }

    public Barbeiro(int idBarbeiro, String nomeBarbeiro, String telefone, String cpf) {
        this.idBarbeiro = idBarbeiro;
        this.nomeBarbeiro = nomeBarbeiro;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public int getIdBarbeiro() {
        return idBarbeiro;
    }

    public void setIdBarbeiro(int idBarbeiro) {
        this.idBarbeiro = idBarbeiro;
    }

    public String getNomeBarbeiro() {
        return nomeBarbeiro;
    }

    public void setNomeBarbeiro(String nomeBarbeiro) {
        this.nomeBarbeiro = nomeBarbeiro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Barbeiro{" + "idBarbeiro=" + idBarbeiro + ", nomeBarbeiro=" + nomeBarbeiro + ", telefone=" + telefone + ", cpf=" + cpf + '}';
    }
    
    
    

}
