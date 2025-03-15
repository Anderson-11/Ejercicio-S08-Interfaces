/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazNotificacion;

/**
 *
 * @author cisne
 */
public class SMS implements Notificable {
    @Override
    public void enviarNotificacion() {
        System.out.println("Notificacion enviada por SMS.");
    }
}
