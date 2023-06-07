/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.AgendaDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Agenda;

/**
 *
 * @author 182120023
 */
public class AgendaServicos {

    public void registrarAgendamento(Agenda aVO) {
        AgendaDAO aDAO = DAOFactory.getAgendaDAO();
        aDAO.registrarAgendamentoDAO(aVO);
    }

    public void atualizarAgendamento(Agenda aVO) {
        AgendaDAO aDAO = DAOFactory.getAgendaDAO();
        aDAO.atualizarAgendamento(aVO);
    }

    public void removerAgendamento(String cpf) {
        AgendaDAO aDAO = DAOFactory.getAgendaDAO();
        aDAO.removerAgendamento(cpf);
    }

    public ArrayList<Agenda> getAgendaDAO() {
        AgendaDAO aDAO = DAOFactory.getAgendaDAO();
        return aDAO.listarAgendamentos();
    }
}
