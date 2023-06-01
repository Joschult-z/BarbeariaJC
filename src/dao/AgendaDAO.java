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
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.Agenda;

/**
 *
 * @author 182120023
 */
public class AgendaDAO {

    public void registrarAgendamentoDAO(Agenda cVO) {
        LocalDateTime horario = LocalDateTime.now();
        try {
            //busca conexão com o BD
            Connection con = Conexao.getConexao();
            //cria espaço de trabalho SQl, é a área no Java onde
            //vamo executar os scripts SQL
            String sql;
            sql = "insert into agenda values (null, ?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getCliente().getNomeCliente());
            pst.setTimestamp(1, Timestamp.valueOf(horario));
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao cadastrar!\n"
                    + ex.getMessage());
        }
    }//fim cadastrarAgenda

    public void atualizarAgendamento(Agenda agendamento) {

    }//fim AtualizarAgendamento

    public Agenda buscarAgendamento(int Agendamento) {
        return null;

    }//fim BuscarAgendamento

    public void removerAgendamento(int idAgendamento) {
       
    }//fim RemoverAgendamento
    
    public List<ArrayList> listarAgendamentos() {
        return null;
        
    }//fim ArrayList 

}
