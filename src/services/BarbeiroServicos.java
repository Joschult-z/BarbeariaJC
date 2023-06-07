/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.BarbeiroDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Barbeiro;

/**
 *
 * @author 182120023
 */
public class BarbeiroServicos {

    public void registrarBarbeiro(Barbeiro bVO) {
        BarbeiroDAO bDAO = DAOFactory.getBarbeiroDAO();
        bDAO.registrarBarbeiro(bVO);
    }

    public void atualizarBarbeiro(Barbeiro bVO) {
        BarbeiroDAO bDAO = DAOFactory.getBarbeiroDAO();
        bDAO.atualizarBarbeiro(bVO);
    }

    public Barbeiro buscarBarbeiroPorCPF(String cpf) {
        BarbeiroDAO bDAO = DAOFactory.getBarbeiroDAO();
        return bDAO.buscarBarbeiroPorCPF(cpf);
    }

    public void deletarBarbeiro(String cpf) {
        BarbeiroDAO bDAO = DAOFactory.getBarbeiroDAO();
        bDAO.deletarBarbeiro(cpf);
    }

    public ArrayList<Barbeiro> getBarbeiros() {
        BarbeiroDAO bDAO = DAOFactory.getBarbeiroDAO();
        return bDAO.listarBarbeirosDAO();

    }

}
