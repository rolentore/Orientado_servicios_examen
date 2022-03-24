/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.service;

import edu.mx.tecnm.oaxaca.tddservice.model.DevcancModel;

/**
 *
 * @author 
 */
public interface DevcancService {
    public void createDevcan(DevcancModel devcan);
    
    public DevcancModel getDevcan(String folio);
    
    public void updateDevcan(DevcancModel devcancModel,Integer id_devcanc);
    
    public void deleteDevcan(Integer id_devcanc);
}
