/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazPago;

/**
 *
 * @author cisne
 */
public class PagoConTarjeta implements Pago {
    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Pago de " + cantidad + " procesado con tarjeta.");
    }
}
