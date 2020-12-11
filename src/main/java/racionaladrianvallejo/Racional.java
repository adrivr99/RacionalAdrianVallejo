/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionaladrianvallejo;

import java.util.Random;

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

    public void imprimir() {
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

    public void producto(Racional x) {
        this.numerador = numerador * x.getNumerador();
        this.denominador = denominador * x.getDenominador();
    }
    
    public void division(Racional x, Racional y) {
        this.numerador = x.getNumerador() * y.getDenominador();
        this.denominador = x.getDenominador() * y.getNumerador();
    }
    
    public void igualdad(Racional x, Racional y) {
        if ((x.getNumerador() + y.getDenominador()) == (x.getDenominador() + y.getNumerador())) {
            System.out.println("Si, son iguales los racionales");
        } else {
            System.out.println("No, no son iguales los racionales");
        }
    }
    
    public void aleatorio(){
        Random aleatorio = new Random();
        this.numerador = aleatorio.nextInt(20);// Limite 20 para que no salgan numeros muy grandes
        this.denominador = aleatorio.nextInt(20)+1;
    }
}
