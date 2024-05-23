package com.Principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploStreams {

    public void muestra(){
        List<String> nombres= Arrays.asList("Diego", "Genesis", "Marco","Noe");
        nombres.stream()  // hacer varias operaciones encadenadas
                .sorted().limit(3)
                .forEach(System.out::println);
    }
}
