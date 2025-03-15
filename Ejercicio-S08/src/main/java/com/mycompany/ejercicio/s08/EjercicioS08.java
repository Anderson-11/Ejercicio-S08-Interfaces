/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio.s08;

import InterfazAnimal.Animal;
import InterfazAnimal.Gato;
import InterfazAnimal.Perro;

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
    }
}
