package Ejercicio2;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class FactoriaXML {

    public static DocumentBuilder getDocumentBuilder(boolean ignorarComentarios, boolean ignorarEspaciosEnBlanco){
        DocumentBuilder docBuilder = null;
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setIgnoringComments(ignorarComentarios);
        docFactory.setIgnoringElementContentWhitespace(ignorarEspaciosEnBlanco);
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        return docBuilder;
    }

    public static Document generarDocumentoVacio(DocumentBuilder docBuilder){

        return docBuilder.newDocument();
    }
}
