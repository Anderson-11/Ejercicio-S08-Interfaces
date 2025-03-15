/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazAlimentacion;

/**
 *
 * @author cisne
 */
public class Persona implements Alimentacion {
    @Override
    public void comer() {
        System.out.println("La persona esta comiendo.");
    }
}
