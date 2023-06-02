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
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Agenda;
import model.Barbeiro;
import model.Cliente;
import model.Servicos;

/**
 *
 * @author 182120023
 */
public class AgendaDAO {

    public void registrarAgendamentoDAO(Agenda aVO) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(aVO.getHorario());
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde vamo executar os scripts SQL
            String sql;
            sql = "insert into agenda values (null, ?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNomeCliente().getNomeCliente());
            pst.setString(2, aVO.getNomeBarbeiros().getNomeBarbeiro());
            pst.setString(3, aVO.getNomeServico().getNomeServico());
            pst.setTimestamp(4, timestamp);//confirmar sexta
            //java.sql.Date dataVenda = java.sql.Date.valueOf(pVO.getDataVenda());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao registrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarAgenda

    public void atualizarAgendamento(Agenda aVO) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(aVO.getHorario());
        try {
            Connection con = Conexao.getConexao();
            String sql = "update agenda set nomeCliente = ?, nomeBarbeiro = ?, nomeServico = ?, horario = ?"
                     + "where cpf = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getNomeCliente().getNomeCliente());
            pst.setString(2, aVO.getNomeBarbeiros().getNomeBarbeiro());
            pst.setString(3, aVO.getNomeServico().getNomeServico());
            pst.setString(3, aVO.getNomeCliente().getCpf());
            pst.setTimestamp(4, timestamp);//confirmar sexta

            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar Serviço!\n"
                    + ex.getMessage());
        }
    }//fim AtualizarAgendamento

    public void removerAgendamento(String cpf) {
try {
            Connection con = Conexao.getConexao();
            String sql = "delete from agenda where cpf  = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cpf);
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar o Serviço!\n"
                    + ex.getMessage());
        }
    }//fim RemoverAgendamento

    public ArrayList<Agenda> listarAgendamentos() {
         LocalDateTime localDateTime = LocalDateTime.now();
       ArrayList<Agenda> Agenda = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            Statement stat = con.createStatement();
            String sql = "select * from agenda";
            ResultSet rs = stat.executeQuery(sql);
            Timestamp timestamp = Timestamp.valueOf(rs.getHorario());
            while (rs.next()) {
                Agenda c = new Agenda();
                //lado do java |x| (lado do banco)
                c.setIdAgenda(rs.getInt("idagenda"));
                c.setNomeCliente((Cliente) rs.getObject("nomeCliente"));
                c.setNomeBarbeiros((Barbeiro) rs.getObject("nomeBarbeiro"));
                c.setNomeServico((Servicos) rs.getObject("nomeServico"));
                c.setPreco(rs.getFloat("preco"));
                servicos.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao Listar Serviços!\n"
                    + ex.getMessage());
        }
        return servicos;

    }//fim ArrayList 

}
