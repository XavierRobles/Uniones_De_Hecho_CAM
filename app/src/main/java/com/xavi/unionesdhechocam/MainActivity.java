package com.xavi.unionesdhechocam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.xavi.unionesdhechocam.entidad.Data;
import com.xavi.unionesdhechocam.recurso.PintarHTML;
import com.xavi.unionesdhechocam.recurso.SolicitudDatos;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
WebView webHTML;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webHTML = findViewById(R.id.wv_html);
        //https://datos.comunidad.madrid/catalogo/

        Retrofit r = new Retrofit.Builder()
                .baseUrl("https://datos.comunidad.madrid/catalogo/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        SolicitudDatos servicio = r.create(SolicitudDatos.class);
        Call<Data> llamada = servicio.PeticionCertificados();
        llamada.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> response) {
            Data d = response.body();
            String html = PintarHTML.dibujar(d.getData());
            webHTML.loadData(html, "text/html", "UTF-8" );
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {

            }
        });

    }
}