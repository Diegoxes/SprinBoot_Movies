package com.Principal;

import com.model.DatosEpisodio;
import com.model.DatosSerie;
import com.model.DatosTemporadas;
import com.service.ConsumoApi;
import com.service.ConvierteDatos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {

    private Scanner teclado =new Scanner(System.in);
    private ConsumoApi consumo=new ConsumoApi();
    private final String URL_BASE="http://www.omdbapi.com/?t=" ; // private final se usa para valores onctsnates y se escribe con MAYUSCULAS EL NOMBRE DE LA CONSTANTE.
    private final String API_KEY="&apikey=8235eb31&";
    private ConvierteDatos conversor=new ConvierteDatos();


    public void muestraElMenu(){


        System.out.println("Por favor Escribe el nombre de la serie que quieres buscar");
        var nombreSerie=teclado.nextLine();
//        var json=consumo.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&apikey=8235eb31&");
        var json=consumo.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+API_KEY);
//        System.out.println(json);
        var datos=conversor.obtenerDatos(json, DatosSerie.class);
//        System.out.println(datos);
        //busca los datos de todas las temporadas

        List<DatosTemporadas> temporadas=new ArrayList<>();
        for (int i = 1; i <= datos.totaldeTemporadas() ; i++) {
            json =consumo.obtenerDatos(URL_BASE+nombreSerie.replace(" ","+")+"&Season="+i+API_KEY);
            var datosTemporadas=conversor.obtenerDatos(json,DatosTemporadas.class);
            temporadas.add(datosTemporadas);
        }
//        temporadas.forEach(System.out::println);


        //mostrar solo el titulo de los episodios
//        for (int i = 0; i < datos.totaldeTemporadas(); i++) {
//            List<DatosEpisodio> episodiosTemporada=temporadas.get(i).episodios();
//            for (int j = 0; j < episodiosTemporada.size() ; j++) {
//                System.out.println(episodiosTemporada.get(j).titulo());
//            }
//        }

        //temporadas.forEach(t->t.episodios().forEach(e-> System.out.println(e.titulo())));

        // Convertir todas las informaciones en una lista del tipo Datos Episodio



        List<DatosEpisodio> datosEpisodio= temporadas.stream().flatMap(t->t.episodios().stream()).collect(Collectors.toList());//to list crea una lista inmutable , con el collect collector to list es una lista mutable



        //top 5 episodios
        System.out.println("5 Episodios");
        datosEpisodio.stream().filter(e->!e.evaluacion().equalsIgnoreCase("N/A")).sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed()).limit(5).forEach(System.out::println);

    }
}




