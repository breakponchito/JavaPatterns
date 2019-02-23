/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule5.genericdao;

import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alfonso.valdez
 */
@Stateless
@Local(PaymentService.class)
@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class PaymentServiceBean implements PaymentService {

    @PersistenceContext(unitName = "myJPA")
    private EntityManager em;

    public <T> T create(T t) {
        this.em.persist(t);
        this.em.flush();
        this.em.refresh(t);
        return t;
    }

    public void delete(Object t) {
        // Entity must be managed in order to be removed
        Object ref = this.em.getReference(t.getClass(), t);
        this.em.remove(ref);
    }

    public <T> T update(T t) {
        return (T) this.em.merge(t);
    }

    @SuppressWarnings("unchecked")
    public <T> T find(Object id, Class<T> type) {
        return (T)this.em.find(type, id);
    }

    public List<Object> findByNamedQuery(String queryName) {
        return this.em.createNamedQuery(queryName).getResultList();
    }

}
