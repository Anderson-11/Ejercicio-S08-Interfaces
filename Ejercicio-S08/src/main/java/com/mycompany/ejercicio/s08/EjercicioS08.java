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
import InterfazCalcDescuento.Descontable;
import InterfazCalcDescuento.DescuentoFijo;
import InterfazCalcDescuento.DescuentoPorcentaje;
import InterfazComparacionObjetos.Producto;
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
        
        //Interfaz Comparacion de objetos
        // Crear productos
        Producto producto1 = new Producto(50.0);
        Producto producto2 = new Producto(30.0);

        // Comparar productos
        int resultadoComparacion = producto1.comparar(producto2);

        // Imprimir resultados de la comparación
        if (resultadoComparacion > 0) {
            System.out.println("Producto 1 es mas caro que Producto 2");
        } else if (resultadoComparacion < 0) {
            System.out.println("Producto 1 es mas barato que Producto 2");
        } else {
            System.out.println("Producto 1 y Producto 2 tienen el mismo precio");
        }

        // Imprimir los detalles de los productos
        System.out.println("Detalles del Producto 1: " + producto1);
        System.out.println("Detalles del Producto 2: " + producto2);
        
        System.out.println();
        
        // Interfaz de Calcular Descuento
        // Precio original del producto
        double precioOriginal = 100.0;

        // Crear instancias de descuentos
        Descontable descuentoPorcentaje = new DescuentoPorcentaje(20); // 20%
        Descontable descuentoFijo = new DescuentoFijo(15); // $15

        // Calcular descuentos
        double descuentoPorcentajeValor = descuentoPorcentaje.calcularDescuento(precioOriginal);
        double descuentoFijoValor = descuentoFijo.calcularDescuento(precioOriginal);

        // Imprimir resultados
        System.out.println("Precio Original: $" + precioOriginal);
        System.out.println("Descuento por porcentaje (20%): $" + descuentoPorcentajeValor);
        System.out.println("Descuento fijo ($15): $" + descuentoFijoValor);

        // Calcular precios finales
        double precioFinalConDescuentoPorcentaje = precioOriginal - descuentoPorcentajeValor;
        double precioFinalConDescuentoFijo = precioOriginal - descuentoFijoValor;

        System.out.println("Precio final con descuento por porcentaje: $" + precioFinalConDescuentoPorcentaje);
        System.out.println("Precio final con descuento fijo: $" + precioFinalConDescuentoFijo);
        
        System.out.println();
    }
}
