package com.example.jose.proyectofutbol.api;

import com.example.jose.proyectofutbol.models.Fudbol;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FudbolService {

    @GET("98ca-rfer.json")
    Call<ArrayList<Fudbol>> obtenerLista();
}
