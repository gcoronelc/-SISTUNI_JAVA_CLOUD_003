/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.app.controller;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Alumno
 */
@ManagedBean
public class Controller {

    private double num1;
    private double num2;
    private String operacion;
    private double resultado;

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void doOperar() {
        if (operacion.equalsIgnoreCase("+")) {
            resultado = num1 + num2;
        } else if (operacion.equalsIgnoreCase("-")) {
            resultado = num1 - num2;
        } else if (operacion.equalsIgnoreCase("*")) {
            resultado = num1 * num2;
        } else if (operacion.equalsIgnoreCase("/")) {
            resultado = num1 / num2;
        } else if (operacion.equalsIgnoreCase("pot")) {
            resultado = Math.pow(num1, num2);
        }

    }

}
