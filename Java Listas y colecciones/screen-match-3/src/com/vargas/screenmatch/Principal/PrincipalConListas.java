package com.alura.screenmatch.Principal;

import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;
import com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {

    public static void main(String[] args) {


        var miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        var otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.evalua(6);
        var peliculaDeVargas = new Pelicula("El señor de los Anillos", 2022);
        peliculaDeVargas.evalua(10);
        var lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeVargas);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if( item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3)
                System.out.println(pelicula.getClasificacion());
        }

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Balderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenadas" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);

    }

}
