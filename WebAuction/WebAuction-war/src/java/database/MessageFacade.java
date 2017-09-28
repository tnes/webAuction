/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import controller.AbstractFacade;
import javax.ejb.Stateless;
import javax.jms.Message;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TorkelNes
 */
@Stateless
public class MessageFacade extends AbstractFacade<Message> {
    @PersistenceContext(unitName = "WebAuction-warPU")
    private EntityManager em;
    
    @Override
    protected EntityManager getEntityManager() {
    return em;
    }
    
    public MessageFacade() {
    super(Message.class);
    }
}
