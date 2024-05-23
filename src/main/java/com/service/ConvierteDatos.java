package com.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.DatosSerie;

public class ConvierteDatos implements IConvierteDatos {
    private ObjectMapper objectMapper= new ObjectMapper();


    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {

        try {
            return objectMapper.readValue(json,clase);
        }catch (JsonProcessingException e){
            throw new RuntimeException(e);
        }
    }
}


//Declaración de la clase: La clase ConvierteDatos es una clase que implementa la interfaz IConvierteDatos, lo que significa que debe proporcionar una implementación para el método obtenerDatos.
//
//Declaración de la variable objectMapper: La clase tiene una variable de instancia objectMapper de tipo ObjectMapper. Este objeto es proporcionado por Jackson, que es una biblioteca de Java para convertir objetos Java en JSON y viceversa. Aquí se está utilizando para convertir el JSON recibido en objetos Java.
//
//Método obtenerDatos: Este método es el encargado de convertir el JSON en un objeto Java del tipo especificado. Toma dos argumentos: el JSON como una cadena y la clase del tipo de objeto al que se desea convertir el JSON.
//
//Parámetro json: Esta es la cadena JSON que se va a convertir en un objeto Java.
//
//Parámetro clase: Este parámetro especifica la clase del tipo de objeto al que se desea convertir el JSON. Utiliza la reflexión de Java para determinar cómo debe convertirse el JSON en el objeto Java de esta clase.
//
//Método readValue: Este método de ObjectMapper se utiliza para realizar la conversión del JSON a un objeto Java. Toma dos argumentos: la cadena JSON y la clase del tipo de objeto al que se desea convertir el JSON.
//
//Manejo de excepciones: Se maneja la excepción JsonProcessingException, que puede ocurrir si hay un problema al procesar el JSON. En caso de que ocurra esta excepción, se lanza una RuntimeException con la excepción original como causa.
//
//Retorno del resultado: El método devuelve el objeto Java convertido del tipo especificado. Este objeto es del tipo genérico T, que se determina en tiempo de ejecución.
//
//        En resumen, la clase ConvierteDatos proporciona un método para convertir una cadena JSON en un objeto Java del tipo especificado utilizando la biblioteca Jackson ObjectMapper.
