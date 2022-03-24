/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.implement.service;

import edu.mx.tecnm.oaxaca.tddservice.model.DevcancModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.mx.tecnm.oaxaca.tddservice.repository.DevcancRepository;
import edu.mx.tecnm.oaxaca.tddservice.service.DevcancService;

/**
 *
 * @author 
 */
@Service
public class DevcancServiceImplement implements DevcancService {

    @Autowired
    private DevcancRepository devcancRepository;

    @Override
    public void createDevcan(DevcancModel devcan) {
        devcancRepository.save(devcan);
    }

    @Override
    public DevcancModel getDevcan(String folio) {
        return devcancRepository.findByFolio(folio);
    }

    @Override
    public void updateDevcan(DevcancModel devcanModel, Integer id_devcanc) {
        devcanModel.setIdDevcanc(id_devcanc);
        devcancRepository.save(devcanModel);
    }

    @Override
    public void deleteDevcan(Integer id_devcanc) {
       devcancRepository.deleteById(id_devcanc);
    }
}
