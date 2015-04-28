/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.TblControlPrenatal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julio Aldana
 */
@Stateless
public class TblControlPrenatalFacade extends AbstractFacade<TblControlPrenatal> {
    @PersistenceContext(unitName = "Registro_GinecologicoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblControlPrenatalFacade() {
        super(TblControlPrenatal.class);
    }
    
}
