package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageViewMoeda;
    private ImageButton imageButtonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageViewMoeda = findViewById(R.id.imageViewMoeda);
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);

        //recuperar dados
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        //System.out.println(">>>>>>>>>>>NUMERO: " + numero);

        if( numero == 0 ) { //cara
            imageViewMoeda.setImageResource( R.drawable.moeda_cara );
        } else { //coroa
            imageViewMoeda.setImageResource( R.drawable.moeda_coroa );
        }


        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });
    }
}