package com.example.jtonyvaio.appcebadero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Context;


public class MainActivity extends AppCompatActivity {

    ImageView ivAgregar, ivEditar;
    Button btnCConectado, btnCDesconectado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivAgregar = (ImageView) findViewById(R.id.ivAgregar);
        ivEditar = (ImageView) findViewById(R.id.ivEditar);
        btnCConectado = (Button) findViewById(R.id.btnCConectado);
        btnCDesconectado = (Button) findViewById(R.id.btnCDesconectado);

        ivAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() ,AgregarDispositivos.class);
                startActivity(intent);
            }
        });

        ivEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() ,EditarDispositivos.class);
                startActivity(intent);
            }
        });

        btnCConectado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() ,MenuConfiguracion.class);
                startActivity(intent);
            }
        });

        btnCDesconectado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext() ,MenuConfiguracion.class);
                startActivity(intent);
            }
        });


    }

}
