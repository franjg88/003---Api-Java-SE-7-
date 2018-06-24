package com.cice.api.ejercicio2;

public class Main {

    public  static void main (String[] args) {

        String cadena = "Esto es una cadena con muchas vocales"; //14 vocales
        int numeroVocales = 0;

        for (int i = 0; i < cadena.length(); i++ ){
            switch (cadena.toLowerCase().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    //si paso por aquí es vocal
                    numeroVocales++;
                    break;
                 default:
                     //si paso por aquí es consonante
                     continue;
            }
        }

        System.out.println("Hemos encontrado "+ numeroVocales+" vocales en la cadena");
    }

}
