/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio.s08;

import InterfazAlimentacion.Alimentacion;
import InterfazAlimentacion.Mascota;
import InterfazAlimentacion.Persona;
import InterfazAnimal.Animal;
import InterfazAnimal.Gato;
import InterfazAnimal.Perro;
import InterfazFiguraGeometrica.Circulo;
import InterfazFiguraGeometrica.FiguraGeometrica;
import InterfazFiguraGeometrica.Rectangulo;
import InterfazNotificacion.CorreoElectronico;
import InterfazNotificacion.Notificable;
import InterfazNotificacion.SMS;
import InterfazOrdenable.ListaNumeros;
import InterfazPago.Pago;
import InterfazPago.PagoConEfectivo;
import InterfazPago.PagoConTarjeta;
import InterfazTrabajador.Desarrollador;
import InterfazTrabajador.Diseñador;
import InterfazTrabajador.Trabajador;
import InterfazVehiculo.Bicicleta;
import InterfazVehiculo.Coche;
import InterfazVehiculo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cisne
 */
public class EjercicioS08 {

    public static void main(String[] args) {
        //Intefaz Animale
        Animal perro = new Perro();
        perro.hacerSonido();
        perro.mover();

        Animal gato = new Gato();
        gato.hacerSonido();
        gato.mover();
        
        System.out.println();
        
        //Interfaz Vehiculo
        Vehiculo coche = new Coche();
        coche.arrancar();
        coche.detener();
        
        Vehiculo bicicleta = new Bicicleta();
        bicicleta.arrancar();
        bicicleta.detener();
        
        System.out.println();
        
        // Interfaz de pago
        Pago pagoTarjeta = new PagoConTarjeta();
        pagoTarjeta.procesarPago(100.0);

        Pago pagoEfectivo = new PagoConEfectivo();
        pagoEfectivo.procesarPago(50.0);
        
        System.out.println();
        
        // Interfaz de Figura Geometrica
        FiguraGeometrica circulo = new Circulo(5);
        System.out.println("Area del circulo: " + circulo.area());
        System.out.println("Perimetro del circulo: " + circulo.perimetro());

        FiguraGeometrica rectangulo = new Rectangulo(4, 6);
        System.out.println("Area del rectangulo: " + rectangulo.area());
        System.out.println("Perimetro del rectangulo: " + rectangulo.perimetro());
        
        System.out.println();
        
        //Interfaz de trabajador
        Trabajador desarrollador = new Desarrollador();
        desarrollador.trabajar();
        
        Trabajador diseñador = new Diseñador();
        diseñador.trabajar();
        
        System.out.println();
        
        //Interfaz de ordenable
        List<Integer> numeros = new ArrayList();
        numeros.add(111);
        numeros.add(57);
        numeros.add(22);
        numeros.add(77);
        numeros.add(11);
        ListaNumeros lista= new ListaNumeros(numeros);
        lista.ordenar();
        
        System.out.println();
        
        // Interfaz Alimentacion
        Alimentacion persona = new Persona();
        persona.comer();
        
        Alimentacion mascota = new Mascota();
        mascota.comer();
        
        System.out.println();
        
        // Interfaz Notificacion
        Notificable correo = new CorreoElectronico();
        correo.enviarNotificacion();
        
        Notificable sms = new SMS();
        sms.enviarNotificacion();
        
        System.out.println();
        
    }
}
