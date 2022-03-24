/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mx.tecnm.oaxaca.tddservice.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author 
 */
@Entity
@Table(name = "Alumnos")
public class DevcancModel implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Numero_control;
    private String Genero;
    private String folio;
    private Double Medida_Cintura;
    private Double Medida_altura;
   

    public Integer getIdDevcanc() {
        return Numero_control;
    }

    public void setIdDevcanc(Integer idCuenta) {
        this.Numero_control = idCuenta;
    }

    public String getGenero() {
        return Genero;
    }

    public void setMotvo(String motivo) {
        this.Genero = motivo;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Double getMedida_Cintura() {
        return Medida_Cintura;
    }

    public void setMedida_Cintura(Double Medida_Cintura) {
        this.Medida_Cintura = Medida_Cintura;
    }
    public double getMedida_altura() {
        return Medida_altura;
    }

    public void setMedida_altura(double Medida_altura) {
        this.Medida_altura = Medida_altura;
    }
}
