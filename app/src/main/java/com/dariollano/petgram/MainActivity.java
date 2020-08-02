package com.dariollano.petgram;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        /* GridLayoutManager glm = new GridLayoutManager(this, 2);*/


        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializaAdaptador();



    }

       /* ListView lstContactos = (ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, DetalleContacto.class);
                intent.putExtra(getResources().getString(R.string.pnombre), contactos.get(position).getNombre());
                intent.putExtra(getResources().getString(R.string.ptelefono), contactos.get(position).getTelefono());
                intent.putExtra(getResources().getString(R.string.pemail), contactos.get(position).getEmail());

                finish();

            }
        }); */
       public void irSegundaActividad(View v){
           Intent intent = new Intent(this, MascotasFavoritas.class);
           startActivity(intent);
       }


    public MascotaAdaptador adaptador;
    public void inicializaAdaptador() {
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);

    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(0, R.drawable.perritouno,"Sugar", "0"));
        mascotas.add(new Mascota(0, R.drawable.perritodos,"Mara", "0"));
        mascotas.add(new Mascota(0, R.drawable.perritotres, "Brisa", "0"));
        mascotas.add(new Mascota(0, R.drawable.perritocuatro, "Ambar", "0"));
        mascotas.add(new Mascota(0, R.drawable.perritocinco, "Meisa", "0"));
        mascotas.add(new Mascota(0, R.drawable.perritoseis, "Kira", "0"));
    }
}