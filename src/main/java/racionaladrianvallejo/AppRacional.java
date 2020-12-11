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
        System.out.println("Racional Z");
        formateador.format(z.getDenominador());
        formateador.format(z.getNumerador());
        z.imprimir();
        System.out.println("");

        System.out.println("Racional K");
        formateador.format(k.getDenominador());
        formateador.format(k.getNumerador());
        k.imprimir();
        System.out.println("");

        System.out.println("Racional R");
        formateador.format(r.getDenominador());
        formateador.format(r.getNumerador());
        r.imprimir();
        System.out.println("");
        
        z.igualdad(z, k);
        System.out.println("");
        
        System.out.println("Suma");
        z.suma(k);
        System.out.println(z);
    }
}
