package com.dariollano.petgram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas_favoritas;
    private RecyclerView listaMascotas_favoritas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas_favoritas = findViewById(R.id.rvMascotas2);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        /* GridLayoutManager glm = new GridLayoutManager(this, 2);*/


        listaMascotas_favoritas.setLayoutManager(llm);
        inicializarListaMascotasFAvoritas();
        inicializaAdaptador();
    }

    public MascotaAdaptador adaptador;
    public void inicializaAdaptador() {
        adaptador = new MascotaAdaptador(mascotas_favoritas, this);
        listaMascotas_favoritas.setAdapter(adaptador);

    }

    public void inicializarListaMascotasFAvoritas(){
        mascotas_favoritas = new ArrayList<Mascota>();
        mascotas_favoritas.add(new Mascota(9, R.drawable.perritoseis, "Kira", "9"));
        mascotas_favoritas.add(new Mascota(8, R.drawable.perritouno,"Sugar", "8"));
        mascotas_favoritas.add(new Mascota(7, R.drawable.perritodos,"Mara", "7"));

        mascotas_favoritas.add(new Mascota(6, R.drawable.perritocuatro, "Ambar", "6"));
        mascotas_favoritas.add(new Mascota(6, R.drawable.perritocinco, "Meisa", "6"));

    }

    public void irPrimeraActividad(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}