package com.xavi.unionesdhechocam.recurso;

import com.xavi.unionesdhechocam.entidad.Data;

import retrofit2.Call;
import retrofit2.http.GET;
//https://datos.comunidad.madrid/catalogo/dataset/24f925a1-335d-4ea5-b947-feed4c61573c/resource/0f4f7925-826e-408b-a2e8-bb30ff8912d8/download/uniones_hecho_certificados.json
public interface SolicitudDatos {
    @GET("dataset/24f925a1-335d-4ea5-b947-feed4c61573c/resource/0f4f7925-826e-408b-a2e8-bb30ff8912d8/download/uniones_hecho_certificados.json")

    Call<Data> PeticionCertificados();

}
