package com.dariollano.petgram;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    //Inflar el layout y lo pasara al viewholder para que el obtenga los views
    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent,false);
        return new MascotaViewHolder(v);
    }

    //asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder holder, int position) {
        final Mascota mascota = mascotas.get(position);
        holder.imgFoto.setImageResource(mascota.getFoto());
        holder.tvNombreCV.setText(mascota.getNombre());
        //holder.tvNLikesCV.setText(mascota.getM_Likes());
        holder.tvNLikesCV.setText(mascota.getM_likes());


        holder.btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int likes = mascota.getLikes();
                mascota.setLikes(likes + 1);
                Toast.makeText(activity, "Diste like a " + mascota.getNombre() + " y Tiene " + mascota.getLikes() +
                        " Likes", Toast.LENGTH_SHORT).show();

                mascota.setM_likes(mascota.getLikes() + "");
                holder.tvNLikesCV.setText(mascota.getM_likes());
            }
        });


       /* holder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, DetalleContacto.class);
                intent.putExtra("nombre", mascota.getNombre());
                intent.putExtra("telefono", mascota.getTelefono());
                intent.putExtra("email", mascota.getEmail());
                activity.startActivity(intent);
            }
        });*/



    }

    @Override
    public int getItemCount() { //cantidad de elementos que contiene mi lista.
        return mascotas.size();

    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private ImageButton btnLike;
        private TextView tvNLikesCV;


        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto          = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV       = (TextView) itemView.findViewById(R.id.tvNombreCV);
            btnLike          = (ImageButton) itemView.findViewById(R.id.btnLike);
            tvNLikesCV       = (TextView) itemView.findViewById(R.id.tvN_LikesCV);

        }
    }
}
