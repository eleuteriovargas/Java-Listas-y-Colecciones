package com.alura.screenmatch.Principal;

import com.alura.screenmatch.calculos.CalculadoraDeTiempo;
import com.alura.screenmatch.calculos.FiltroRecomendacion;
import com.alura.screenmatch.modelos.Episodio;
import com.alura.screenmatch.modelos.Pelicula;
import com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        var miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(180);
        System.out.println("Duración de la película: " + miPelicula.getDuracionEnMinutos());

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(8);
        miPelicula.evalua(5);
        miPelicula.evalua(10);
        System.out.println("Total de evaluaciones: " + miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMediaEvaluaciones());


        var lost = new Serie("Lost", 2000);
        lost.muestraFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duracion de la série: " + lost.getDuracionEnMinutos());

        var otraPelicula = new Pelicula("Avatar", 2023);
        otraPelicula.setDuracionEnMinutos(200);

        var calculadora = new CalculadoraDeTiempo();
        calculadora.incluido(miPelicula);
        calculadora.incluido(otraPelicula);
        calculadora.incluido(lost);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        var episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizaciones(300);
        filtro.filtra(episodio);

        var peliculaDeVargas = new Pelicula("El señor de los Anillos", 2022);
        peliculaDeVargas.setDuracionEnMinutos(180);
        peliculaDeVargas.setFechaDeLanzamiento(2022);

       ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
       listaDePeliculas.add(peliculaDeVargas);
       listaDePeliculas.add(miPelicula);
       listaDePeliculas.add(otraPelicula);

        System.out.println("El tamaño de la lista es: " + listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        //La primera pelicula es: El señor de los Anillos

        System.out.println(listaDePeliculas);
        //[Pelicula: El señor de los Anillos (2022), Pelicula: Encanto (2021), Pelicula: Avatar (2023)]

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());
        //toString de la pelicula: Pelicula: El señor de los Anillos (2022)


    }
}