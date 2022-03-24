/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.controller;

import edu.mx.tecnm.oaxaca.tddservice.model.DevcancModel;
import edu.mx.tecnm.oaxaca.tddservice.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.mx.tecnm.oaxaca.tddservice.service.DevcancService;

/**
 *
 * @author 
 */
@RestController
@RequestMapping("/api/v1/cuenta")
public class DevcancController {
    
    @Autowired
    private DevcancService devcanService;

    @PostMapping("/")
    public CustomResponse createDevcan(@RequestBody DevcancModel devcan) {
        CustomResponse customResponse = new CustomResponse();
        devcanService.createDevcan(devcan);
        return customResponse;
    }
    
    @GetMapping("/{folio}")
    public CustomResponse getClientes(@PathVariable String folio){
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(devcanService.getDevcan(folio));
        return customResponse;
    }
    
    @PutMapping("/{id_devcanc}")
    public CustomResponse updateDevcanc(@RequestBody DevcancModel devcan,@PathVariable Integer id_devcanc){
        CustomResponse customResponse = new CustomResponse();
        devcanService.updateDevcan(devcan, id_devcanc);
        return customResponse;
    }
    
    @DeleteMapping("/{id_devcanc}")
    public CustomResponse deleteDevcanc(@PathVariable Integer id_devcanc){
        CustomResponse customResponse = new CustomResponse();
        devcanService.deleteDevcan(id_devcanc);
        return customResponse;
    }
}
