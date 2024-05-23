package com.alura.demo12;

import com.Principal.EjemploStreams;
import com.Principal.Principal;
import com.model.DatosEpisodio;
import com.model.DatosSerie;
import com.model.DatosTemporadas;
import com.service.ConsumoApi;
import com.service.ConvierteDatos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Demo12Application implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(Demo12Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Principal principal=new Principal();
		principal.muestraElMenu();

//		EjemploStreams ejemplo=new EjemploStreams();
//		ejemplo.muestra();
















//			var consumoApi=new ConsumoApi();
//			var json=consumoApi.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&apikey=8235eb31&");

//			System.out.println(json);
//	ConvierteDatos conversor=new ConvierteDatos();
//     var datos=conversor.obtenerDatos(json, DatosSerie.class);//datos del tipo serie ya no genericos con T
//		System.out.println(datos);

//		var json =consumoApi.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&Season=1&episode=1&apikey=8235eb31");
//		DatosEpisodio episodios=conversor.obtenerDatos(json, DatosEpisodio.class);
//		System.out.println(episodios);

//		List<DatosTemporadas> temporadas=new ArrayList<>();
//		for (int i = 1; i <= datos.totaldeTemporadas() ; i++) {
//			json =consumoApi.obtenerDatos("http://www.omdbapi.com/?t=game+of+thrones&Season="+i+"&apikey=8235eb31");
//				var datosTemporadas=conversor.obtenerDatos(json,DatosTemporadas.class);
//				temporadas.add(datosTemporadas);
//		}


//		temporadas.forEach(System.out::println);
	}
}



//Clase Demo12Application: Esta clase es la clase principal de la aplicación. Implementa la interfaz CommandLineRunner, lo que significa que tiene un método run que se ejecutará al iniciar la aplicación Spring Boot.
//
//Método main: Este es el punto de entrada de la aplicación. Utiliza SpringApplication.run() para arrancar la aplicación Spring Boot.
//
//Método run: Este método se ejecuta automáticamente después de que la aplicación se haya iniciado. Aquí es donde se realiza la lógica principal de la aplicación.
//
//Creación de instancias: Dentro del método run, se crean varias instancias de otras clases para interactuar con la API y procesar los datos. Se crea una instancia de ConsumoApi para consumir la API, y una instancia de ConvierteDatos para convertir los datos JSON en objetos Java.
//
//Consumo de la API: Se llama al método obtenerDatos() de la instancia de ConsumoApi para obtener datos de una API externa. En este caso, se está consultando la API de OMDB para obtener información sobre la serie "Game of Thrones".
//
//Conversión de datos: Se utiliza la instancia de ConvierteDatos para convertir el JSON obtenido en objetos Java. En este caso, se está convirtiendo el JSON en objetos de la clase DatosSerie.
//
//Iteración sobre temporadas: Se crea una lista de objetos DatosTemporadas para almacenar la información de cada temporada de la serie. Se utiliza un bucle for para iterar sobre todas las temporadas de la serie, desde la primera hasta la última.
//
//Consulta de datos de cada temporada: Dentro del bucle, se realiza una consulta a la API para obtener los datos de una temporada específica de la serie "Game of Thrones". Se utiliza el número de temporada en la URL de la consulta.
//
//Conversión de datos de la temporada: Se utiliza la instancia de ConvierteDatos para convertir el JSON obtenido en objetos de la clase DatosTemporadas.
//
//Añadir datos a la lista: Los datos de cada temporada se añaden a la lista temporadas utilizando el método add().
//
//Impresión de datos: Finalmente, se utiliza un bucle forEach para imprimir los datos de cada temporada en la consola.
