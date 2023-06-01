/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
        LocalDateTime horario = LocalDateTime.now();
//busca conecão com o BD
        try {
            Connection con = Conexao.getConexao();
            String sql;
            sql = "insert into produto values (null, ?,?,?,)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, sVO.getNomeCliente().getNomeCliente());
            pst.setInt(2, sVO.getQuantidade());
            pst.setFloat(3, sVO.getPreco());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar o produto!\n"
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
            System.out.println("Erro ao deletar o produto!\n"
                    + ex.getMessage());
        }
    }

    public void atualizarServico(Servico servico) {
        // Lógica para atualizar os detalhes do serviço no banco de dados
    }

    public List<ArrayList> listarServicos() {
        return null;
        // Lógica para retornar a lista de todos os serviços do banco de dados
    }
    
}
