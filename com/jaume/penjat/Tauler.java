package com.jaume.penjat;

import java.util.Arrays;

public class Tauler {
    private String paraulaSecreta;
    private int intents;
    private String[] paraulaEncertada;
    private int vides;


    /**
     * Constructor methods
     */
    public Tauler(){
    }


    /**
     * Initialize methods
     */
    public void inicialitzarPartida(String paraula, int intents) {
        this.paraulaSecreta = paraula;
        this.intents = intents;
        this.vides = intents;
        paraulaEncertada = new String[paraulaSecreta.length()];
    }


    public String imprimirVides() {
        if (vides == 1){
            return "Et queda " + vides + " vida de " + intents;
        } else {
            return "Et queden " + vides + " vides de " + intents;
        }
    }


  /**
     * DTO after this line
     */
    //Getters for the instance variables
    public char[] getParaulaSecreta(){
        return paraulaSecreta.toCharArray();
    }

    public int getIntents() {
        return vides;
    }

    public String[] getPalabraEndevinada(){
        return paraulaEncertada;
    }

}
