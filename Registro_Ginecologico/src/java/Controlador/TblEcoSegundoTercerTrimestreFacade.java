/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.TblEcoSegundoTercerTrimestre;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Julio Aldana
 */
@Stateless
public class TblEcoSegundoTercerTrimestreFacade extends AbstractFacade<TblEcoSegundoTercerTrimestre> {
    @PersistenceContext(unitName = "Registro_GinecologicoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TblEcoSegundoTercerTrimestreFacade() {
        super(TblEcoSegundoTercerTrimestre.class);
    }
    
}
