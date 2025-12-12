package Sorteador_Numeros;

import java.util.Random;

public class UtilNumeroAleatorio {

    public static final Random GERADOR = new Random();

    public static int sortear(int minimo, int maximo){
        return GERADOR.nextInt((maximo - minimo)+ 1)+ minimo;
    }

    private UtilNumeroAleatorio(){}


}
