/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.utils;

import edu.mx.tecnm.oaxaca.tddservice.model.DevcancModel;
import java.util.LinkedList;

/**
 *
 * @author 
 */
public class CustomResponse {
    private Integer httpCode;
    private Object data;
    private String message;
    private Double message1;
    private String message3;
    private Double message4;
  DevcancModel DevcancModel = new DevcancModel();
private  Double valor = (DevcancModel.getMedida_Cintura() / DevcancModel.getMedida_altura());

    public CustomResponse(){
        this.httpCode = 200;
        this.data = new LinkedList();
        this.message = "la ica es";
        this.message1= (valor );
        this.message3 = "nivel de peso";
        
    }

    public Integer getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getvalorss() {
        return ("");
    }
}
