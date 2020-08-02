package com.dariollano.petgram;

public class Mascota {
    private String nombre;
    private String m_likes;
    private int foto;
    private int likes;

    public Mascota(int likes, int foto, String nombre, String m_likes) {
        this.nombre = nombre;
        this.foto = foto;
        this.likes = likes;
        this.m_likes = m_likes;
    }

    public String getM_likes() {
        return m_likes;
    }

    public void setM_likes(String m_likes) {
        this.m_likes = m_likes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }


    }


