package com.service;

public interface IConvierteDatos {


    <T> T obtenerDatos(String json,Class<T> clase);
}


//Declaración de la interfaz: IConvierteDatos es una interfaz en Java que declara un método llamado obtenerDatos. Esta interfaz proporciona un contrato que debe ser implementado por cualquier clase que desee proporcionar la funcionalidad de convertir datos desde una representación en formato JSON a objetos Java.
//
//Método obtenerDatos: Este método es declarado en la interfaz y define la firma del método que debe ser implementado por las clases que la utilicen.
//
//Parámetro json: Este parámetro representa la cadena JSON que se va a convertir en un objeto Java.
//
//Parámetro clase: Este parámetro especifica la clase del tipo de objeto al que se desea convertir el JSON. Se utiliza para proporcionar información sobre el tipo de objeto que se espera como resultado de la conversión.
//
//Tipo de retorno: El método es genérico y devuelve un objeto del tipo especificado por el parámetro de tipo <T>. Esto significa que el tipo de objeto devuelto puede ser cualquier clase, dependiendo de cómo se llame al método.
//
//        En resumen, la interfaz IConvierteDatos define un contrato para cualquier clase que desee proporcionar la funcionalidad de convertir datos JSON en objetos Java. La implementación concreta de cómo se realiza esta conversión se deja a las clases que implementan esta interfaz. Esto proporciona flexibilidad y abstracción al permitir que diferentes implementaciones manejen la conversión de datos de diferentes maneras según sea necesario.