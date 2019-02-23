/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certificatic.patternsmodule5.genericdao;

import java.util.List;

/**
 *
 * @author alfonso.valdez
 */
public interface PaymentService {
    <T> T create(T t);
    void delete(Object t);
    <T> T update(T t);
    <T> T find(Object id, Class<T> type);
    List<Object> findByNamedQuery(String queryName);
}
