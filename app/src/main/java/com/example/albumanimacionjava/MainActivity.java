package com.example.albumanimacionjava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AnimationDrawable animacion;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foto = (ImageView) findViewById(R.id.photo);
        Button boton1 = (Button) findViewById(R.id.btn1);
        Button boton2 = (Button) findViewById(R.id.btn2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

        int t=1000;
        animacion = new AnimationDrawable();

        animacion.addFrame(getResources().getDrawable(R.drawable.f1),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f2),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f3),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f4),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f5),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f6),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f7),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f8),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f9),t);
        animacion.addFrame(getResources().getDrawable(R.drawable.f10),t);

        animacion.setOneShot(false);
        foto.setImageDrawable(animacion);
    }

    @Override
    public void onClick(View view) {
        animacion.stop();
        if(view.getId() == R.id.btn1){
            animacion.start();
        }else{
            animacion.stop();
        }
    }
}