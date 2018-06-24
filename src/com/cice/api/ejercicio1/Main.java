package com.cice.api.ejercicio1;

public class Main {

    public static void main(String[] args) {

        String[] cadenas = {"hola","mundo","java","se"};

        String max = "";
        for(String i: cadenas){
            if(i.length()>max.length()){
                max =  i;
            }
        }
        System.out.println(max);
    }

}
