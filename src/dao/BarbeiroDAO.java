/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Barbeiro;

/**
 *
 * @author joaocs.silva
 */
public class BarbeiroDAO {

    public void registrarBarbeiro(Barbeiro barbeiro) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "insert into barbeiros (cpf, nome, endereco, telefone) values (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, barbeiro.getNomeBarbeiro());
            pst.setString(2, barbeiro.getCpf());
            pst.setString(3, barbeiro.getTelefone());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao registrar barbeiro!\n" + ex.getMessage());
        }
    }//fim RegistrarBarbeiro

    public Barbeiro buscarBarbeiroPorCPF(String cpf) {
        Barbeiro barbeiro = null;
        try {
            Connection con = Conexao.getConexao();
            String sql = "select * from barbeiros where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                barbeiro = new Barbeiro();
                barbeiro.setNomeBarbeiro(rs.getString("nomeBarbeiro"));
                barbeiro.setCpf(rs.getString("cpf"));
                barbeiro.setTelefone(rs.getString("telefone"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar barbeiro por CPF!\n" + ex.getMessage());
        }
        return barbeiro;
    }//fim BuscarBarbeiro

    public void atualizarBarbeiro(Barbeiro barbeiro) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update barbeiros set nome = ?, telefone = ? where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, barbeiro.getNomeBarbeiro());
            pst.setString(2, barbeiro.getTelefone());
            pst.setString(3, barbeiro.getCpf());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar barbeiro!\n" + ex.getMessage());
        }
    }//fim atualizarBarbeiro

    public void deletarBarbeiro(String cpf) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from barbeiros where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar barbeiro!\n" + ex.getMessage());
        }
    }//fim deletarBarbeiro
    
    public ArrayList<Barbeiro> getBarbeirosDAO() {
        ArrayList<Barbeiro> clientes = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from barbeiros";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Barbeiro c = new Barbeiro();
                //lado do java |x| (lado do banco)
                c.setIdBarbeiro(rs.getInt("idcliente"));
                c.setNomeBarbeiro(rs.getString("nome"));
                c.setTelefone(rs.getString("telefone"));
                clientes.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar!\n"
                    + ex.getMessage());
        }
        return clientes;
    }//fim do listar
}
