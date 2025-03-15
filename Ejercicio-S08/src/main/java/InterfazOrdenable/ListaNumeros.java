/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazOrdenable;

/**
 *
 * @author cisne
 */
import java.util.Collections;
import java.util.List;

public class ListaNumeros implements Ordenable {
    private List<Integer> numeros;

    public ListaNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public void ordenar() {
        Collections.sort(numeros);
        System.out.println("Lista ordenada: " + numeros);
    }
}
