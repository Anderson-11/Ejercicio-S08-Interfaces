/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfazComparacionObjetos;

/**
 *
 * @author cisne
 */
public class Producto implements ComparableObjeto {
    private double precio;

    public Producto(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int comparar(Object o) {
        if (o instanceof Producto) {
            Producto otroProducto = (Producto) o;
            return Double.compare(this.precio, otroProducto.precio);
        }
        return 0; // Si no es un Producto, no se puede comparar
    }

    @Override
    public String toString() {
        return "Producto{precio=" + precio + '}';
    }
}
