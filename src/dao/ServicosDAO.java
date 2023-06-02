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
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Servicos;

/**
 *
 * @author 182120023
 */
public class ServicosDAO {

    public void adicionarServicoDAO(Servicos sVO) {
//busca conecão com o BD
        try {
            Connection con = Conexao.getConexao();
            String sql;
            sql = "insert into servico values (null, ?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sVO.getNomeServico());
            pst.setFloat(2, sVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar o Serviço!\n"
                    + ex.getMessage());
        }

    }

    public void deletarServicoDAO(int idServicos) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from servicos where idServicos = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, idServicos);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar o Serviço!\n"
                    + ex.getMessage());
        }
    }

    public void atualizarServico(Servicos sVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "update servicos set nomeServico = ?, preco = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sVO.getNomeServico());
            pst.setFloat(2, sVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Serviço!\n"
                    + ex.getMessage());
        }
    }//fim atualizaServicosByDoc|

    public ArrayList<Servicos> listarServicos() {
        ArrayList<Servicos> servicos = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from servicos";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()) {
                Servicos c = new Servicos();
                //lado do java |x| (lado do banco)
                c.setIdServicos(rs.getInt("idservico"));
                c.setNomeServico(rs.getString("nomeServico"));
                c.setPreco(rs.getFloat("preco"));
                servicos.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Serviços!\n"
                    + ex.getMessage());
        }
        return servicos;
    }

}
