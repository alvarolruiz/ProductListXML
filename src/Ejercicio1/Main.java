package Ejercicio1;

import java.util.ArrayList;

public class Main {
public static final String RUTA_EXPORTACION_XML = "src/Ejercicio1/Files/listaProductosXML.xml";
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos = DataAccessLayer.getListaProductos();
        UtilidadesXML.exportToXML(listaProductos, RUTA_EXPORTACION_XML);
    }
}
