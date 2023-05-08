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
public class BarbeariaM {
    
    private int idBarbearia;
    private String NomeBarbearia;
    private String cnpj;
    private String endereco;
    private String telefone;

    public BarbeariaM() {
    }

    public BarbeariaM(int idBarbearia, String NomeBarbearia, String cnpj, String endereco, String telefone) {
        this.idBarbearia = idBarbearia;
        this.NomeBarbearia = NomeBarbearia;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public int getIdBarbearia() {
        return idBarbearia;
    }

    public void setIdBarbearia(int idBarbearia) {
        this.idBarbearia = idBarbearia;
    }

    public String getNomeBarbearia() {
        return NomeBarbearia;
    }

    public void setNomeBarbearia(String NomeBarbearia) {
        this.NomeBarbearia = NomeBarbearia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "BarbeariaM{" + "idBarbearia=" + idBarbearia + ", NomeBarbearia=" + NomeBarbearia + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone=" + telefone + '}';
    }

    
}