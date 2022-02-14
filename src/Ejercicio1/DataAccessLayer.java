package Ejercicio1;

import java.util.ArrayList;

public class DataAccessLayer {

    public static ArrayList<Producto> getListaProductos(){
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1, "Sarten", 10.2f));
        listaProductos.add(new Producto(2, "Escoba", 5.1f));
        listaProductos.add(new Producto(3, "Freidora", 20.7f));
        return listaProductos;
    }
}
