/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazAnimal;

/**
 *
 * @author cisne
 */
public class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }

    @Override
    public void mover() {
        System.out.println("El perro corre.");
    }
}
