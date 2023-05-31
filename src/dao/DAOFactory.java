/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author joaocs.silva
 */
public class DAOFactory {

    private static ClienteDAO cDAO = new ClienteDAO();
    public static AgendaDAO aDAO = new AgendaDAO();
    private static BarbeiroDAO bDAO = new BarbeiroDAO();

    public static ClienteDAO getClienteDAO() {
        return cDAO;
    }

    public static AgendaDAO getAgendaDAO() {
        return aDAO;
    }

    public static BarbeiroDAO getBarbeiroDAO() {
        return bDAO;
    }
}
