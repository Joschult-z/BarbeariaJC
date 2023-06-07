/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.DAOFactory;
import dao.ServicosDAO;
import java.util.ArrayList;
import model.Servicos;

/**
 *
 * @author 182120023
 */
public class ServicosServicos {

    public void adicionarServicoDAO(Servicos sVO) {
        ServicosDAO sDAO = DAOFactory.getServicosDAO();
        sDAO.adicionarServicoDAO(sVO);
    }

    public void atualizarServico(Servicos sVO) {
        ServicosDAO sDAO = DAOFactory.getServicosDAO();
        sDAO.atualizarServico(sVO);
    }
    
      public void deletarServicos(int idServicos) {
        ServicosDAO sDAO = DAOFactory.getServicosDAO();
        sDAO.deletarServicoDAO(idServicos);
    }
      
      public ArrayList<Servicos> getServicos() {
        ServicosDAO sDAO = DAOFactory.getServicosDAO();
        return sDAO.listarServicos();

    }
}
