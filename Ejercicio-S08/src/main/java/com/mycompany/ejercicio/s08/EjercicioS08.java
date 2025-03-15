/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio.s08;

import InterfazAnimal.Animal;
import InterfazAnimal.Gato;
import InterfazAnimal.Perro;
import InterfazPago.Pago;
import InterfazPago.PagoConEfectivo;
import InterfazPago.PagoConTarjeta;
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
    }
}
