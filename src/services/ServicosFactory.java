/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author 182120023
 */
public class ServicosFactory {

    private static AgendaServicos aServicos = new AgendaServicos();
    private static ClienteServicos cServicos = new ClienteServicos();
    private static BarbeiroServicos bServicos = new BarbeiroServicos();
    private static ServicosServicos sServicos = new ServicosServicos();

    public static ClienteServicos getClienteServicos() {
        return cServicos;
    }

    public static BarbeiroServicos getBarbeiroServicos() {
        return bServicos;
    }

    public static AgendaServicos getAgendaServicos() {
        return aServicos;
    }

    public static ServicosServicos getServicosServicos() {
        return sServicos;
    }
}
