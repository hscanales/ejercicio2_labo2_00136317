package tech.visuallatam.ejercicio2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView col0row0;
    ImageView col1row0;
    ImageView col2row0;

    ImageView col0row1;
    ImageView col1row1;
    ImageView col2row1;

    ImageView col0row2;
    ImageView col1row2;
    ImageView col2row2;

    TextView debug;
    Drawable[] imagenes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carga();

        clickers();

    }

    private void carga(){
        col0row0 = findViewById(R.id.col0row0);
        col1row0 = findViewById(R.id.col1row0);
        col2row0 = findViewById(R.id.col2row0);


        col0row1 = findViewById(R.id.col0row1);
        col1row1 = findViewById(R.id.col1row1);
        col2row1 = findViewById(R.id.col2row1);


        col0row2 = findViewById(R.id.col0row2);
        col1row2 = findViewById(R.id.col1row2);
        col2row2 = findViewById(R.id.col2row2);

        debug = findViewById(R.id.texto);
        imagenes = new Drawable[3];
        imagenes[0] = getResources().getDrawable(R.drawable.asda);
        imagenes[1] = getResources().getDrawable(R.drawable.dz);
        imagenes[2] = getResources().getDrawable(R.drawable.draw);

    }


    private void clickers(){
        col0row0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col0row0.setImageDrawable(imagenes[numero]);

            }
        });

        col1row0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col1row0.setImageDrawable(imagenes[numero]);

            }
        });

        col2row0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col2row0.setImageDrawable(imagenes[numero]);

            }
        });

        col0row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col0row1.setImageDrawable(imagenes[numero]);

            }
        });

        col1row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col1row1.setImageDrawable(imagenes[numero]);

            }
        });

        col2row1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col2row1.setImageDrawable(imagenes[numero]);

            }
        });

        col0row2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col0row2.setImageDrawable(imagenes[numero]);

            }
        });

        col1row2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col1row2.setImageDrawable(imagenes[numero]);

            }
        });

        col2row2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = (int)(Math.random()*3);
                col2row2.setImageDrawable(imagenes[numero]);

            }
        });

    }
}
