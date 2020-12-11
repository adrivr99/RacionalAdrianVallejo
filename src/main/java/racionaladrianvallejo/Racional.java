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
}
