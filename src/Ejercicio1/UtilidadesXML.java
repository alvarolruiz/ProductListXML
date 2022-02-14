package Ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public abstract class UtilidadesXML {

    public static void exportToXML(List<Producto> productos, String rutaFicheroSalida){
    try{
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("root");
        doc.appendChild(rootElement);
        for (Producto c : productos
             ) {
            Element producto = doc.createElement("Producto");
                Element id = doc.createElement("id");
                    id.setTextContent(String.valueOf(c.getId()));
                producto.appendChild(id);
                Element descripcion = doc.createElement("Descripción");
                    descripcion.setTextContent(c.getDescripcion());
                producto.appendChild(descripcion);
                Element precio = doc.createElement("Precio");
                    precio.setTextContent(String.valueOf(c.getPrecio()));
                producto.appendChild(precio);
            rootElement.appendChild(producto);
        }
        escribirEnFichero(doc, rutaFicheroSalida);
    }catch (ParserConfigurationException pce){
        pce.printStackTrace();
    }

    }

    private static void escribirEnFichero(Document doc, String rutaFicheroSalida) {
        try {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(rutaFicheroSalida));
        transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
