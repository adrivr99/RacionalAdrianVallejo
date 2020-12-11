/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionaladrianvallejo;

/**
 *
 * @author adriv
 */
public class Racional {

    int numerador;
    int denominador;

    public Racional() {
        this.numerador = 1;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;

        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }

    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0) {
            this.denominador = 1;
        } else {
            this.denominador = denominador;
        }
    }
    
    public void imprimir(){
        System.out.println("Numerador: " + numerador);
        System.out.println("Denominador: " + denominador);
    }
    
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
    
    public void suma(Racional x) {
        if (denominador == x.getDenominador()) {
            this.numerador = (numerador + x.getNumerador());
            this.denominador = denominador;
        } else {
            this.numerador = ((numerador * x.getDenominador()) + (x.getNumerador() * denominador));
            this.denominador = (denominador * x.getDenominador());
        }
    }
    
    public void resta(Racional x) {
        if (denominador == x.getDenominador()) {
            this.numerador = (numerador - x.getNumerador());
            this.denominador = denominador;
        } else {
            this.numerador = ((numerador * x.getDenominador()) - (x.getNumerador() * denominador));
            this.denominador = (denominador * x.getDenominador());
        }
    }
}
