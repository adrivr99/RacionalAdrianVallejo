/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionaladrianvallejo;

import java.text.DecimalFormat;

/**
 *
 * @author adriv
 */
public class AppRacional {
    public static void main(String[] args) {
        Racional z = new Racional(4, 5);
        Racional k = new Racional(3, 4);
        
        Racional r = new Racional();
        r.aleatorio();

        DecimalFormat formateador = new DecimalFormat("####.##");
        formateador.format(z.getDenominador());
        formateador.format(z.getNumerador());
        z.imprimir();

        formateador.format(k.getDenominador());
        formateador.format(k.getNumerador());
        k.imprimir();

        formateador.format(r.getDenominador());
        formateador.format(r.getNumerador());
        r.imprimir();
        
        z.igualdad(z, k);
    }
}
