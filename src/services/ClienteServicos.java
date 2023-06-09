/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.ClienteDAO;
import dao.DAOFactory;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author 182120023
 */
public class ClienteServicos {

    public void cadCliente(Cliente cVO) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.cadastrarClienteDAO(cVO);
    }

    public void atualizarCliente(Cliente cVO) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.atualizaClienteByDoc(cVO);
    }

    public void deletarCliente(String CPF) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        cDAO.deletarClienteDAO(CPF);
    }

    public Cliente buscarClienteByCPF(String cpf) {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.BuscarClienteCPF(cpf);
    }

    public ArrayList<Cliente> getClientes() {
        ClienteDAO cDAO = DAOFactory.getClienteDAO();
        return cDAO.listarClientesDAO();

    }

    //esta faltando DAOFACTORY.
}
