package com.xavi.unionesdhechocam.recurso;

import com.xavi.unionesdhechocam.entidad.Certificados;

import java.util.Arrays;
import java.util.List;

public class PintarHTML {
    static float Xmin = 0, Xmax = 0;
    static int count = 0;

    public static String dibujar(List<Certificados> lista_Certificados) {

        float[] numeros = new float[lista_Certificados.size()];
        for (int i = 0; i < lista_Certificados.size(); i++) {
            numeros[i] = lista_Certificados.get(i).getCertificado_año();
        }
        calcularExtremos(numeros);//Aqui calculo xmin y xmax


        String tabla = "";
        String inicioHTML = "<!DOCTYPE html><head><title>Uniones de Hecho CAM android</title></head>"
                + "<body> " +
                "<table border=1><tr><th>Certificado del año</th><th>C.Motivos de la solicitud</th></tr>";
        for (int i = 0; i < lista_Certificados.size(); i++) {
            String color = calcularColor(lista_Certificados.get(i).getCertificado_año());
            tabla += "<tr><td style='background-color: hsl(" + color + ",100%,50%);'>" + lista_Certificados.get(i).getCertificado_año() + "</td>";
            tabla += "<td style='background-color:aqua;'>" + lista_Certificados.get(i).getMotivos_solicitud()+ "</td></tr>";

        }

        String finalHtml = "</table></body</html> ";
        return inicioHTML + tabla + finalHtml;
    }
    public static String calcularColor(float valor) {


        float rojo = 100 - (100 / (Xmax - Xmin) * valor + (100 * Xmin / (Xmin - Xmax)));


        return String.valueOf(rojo);

    }

    public static void calcularExtremos(float[] numeros) {

        Arrays.sort(numeros);

        Xmin = numeros[0];
        Xmax = numeros[numeros.length - 1];
    }

}
