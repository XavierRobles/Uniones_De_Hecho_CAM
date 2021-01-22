package com.xavi.unionesdhechocam.entidad;
import java.util.List;
public class Data {
    private List<Certificados> data;

    public List<Certificados> getData() {
        return data;
    }

    public void setData(List<Certificados> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
