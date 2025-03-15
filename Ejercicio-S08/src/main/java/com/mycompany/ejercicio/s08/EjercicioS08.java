/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio.s08;

import InterfazAnimal.Animal;
import InterfazAnimal.Gato;
import InterfazAnimal.Perro;
import InterfazFiguraGeometrica.Circulo;
import InterfazFiguraGeometrica.FiguraGeometrica;
import InterfazFiguraGeometrica.Rectangulo;
import InterfazPago.Pago;
import InterfazPago.PagoConEfectivo;
import InterfazPago.PagoConTarjeta;
import InterfazTrabajador.Desarrollador;
import InterfazTrabajador.Diseñador;
import InterfazTrabajador.Trabajador;
import InterfazVehiculo.Bicicleta;
import InterfazVehiculo.Coche;
import InterfazVehiculo.Vehiculo;

/**
 *
 * @author cisne
 */
public class EjercicioS08 {

    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido();
        perro.mover();

        Animal gato = new Gato();
        gato.hacerSonido();
        gato.mover();
        
        System.out.println();
        
        Vehiculo coche = new Coche();
        coche.arrancar();
        coche.detener();
        
        Vehiculo bicicleta = new Bicicleta();
        bicicleta.arrancar();
        bicicleta.detener();
        
        System.out.println();
        
        // Ejemplo de pago
        Pago pagoTarjeta = new PagoConTarjeta();
        pagoTarjeta.procesarPago(100.0);

        Pago pagoEfectivo = new PagoConEfectivo();
        pagoEfectivo.procesarPago(50.0);
        
        System.out.println();
        
        // Ejemplo de figura geométrica
        FiguraGeometrica circulo = new Circulo(5);
        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Perimetro del circulo: " + circulo.perimetro());

        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        System.out.println("Area del rectangulo: " + rectangulo.area());
        System.out.println("Perimetro del rectangulo: " + rectangulo.perimetro());
        
        System.out.println();
        
        Trabajador desarrollador = new Desarrollador();
        desarrollador.trabajar();
        
        Trabajador diseñador = new Diseñador();
        diseñador.trabajar();
        
    }
}
