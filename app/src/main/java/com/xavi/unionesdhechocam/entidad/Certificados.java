package com.xavi.unionesdhechocam.entidad;

public class Certificados {
    private int certificado_año;
    private String motivos_solicitud;

    public int getCertificado_año() {
        return certificado_año;
    }

    public void setCertificado_año(int certificado_año) {
        this.certificado_año = certificado_año;
    }

    public String getMotivos_solicitud() {
        return motivos_solicitud;
    }

    public void setMotivos_solicitud(String motivos_solicitud) {
        this.motivos_solicitud = motivos_solicitud;
    }

    @Override
    public String toString() {
        return "Certificados{" +
                "certificado_año=" + certificado_año +
                ", motivos_solicitud='" + motivos_solicitud + '\'' +
                '}';
    }
}
