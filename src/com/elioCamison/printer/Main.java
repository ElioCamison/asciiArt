package com.elioCamison.printer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String data =
                        " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###\n" +
                        "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #\n" +
                        "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   # \n" +
                        "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #      \n" +
                        "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  # ";

        Printer p = new Printer(data);

        System.out.println(p.render("À"));

        int currentCharacter = 0;
        String a = "A";
        if (a.codePointAt(0) > 65 || a.codePointAt(0) < 90 ) {
            // Introducimos en el caracter actual el valor del caracter que itera K, multiplicandolo por el ancho de la letra más el espacio entre estas.
            currentCharacter = (a.charAt(0) - 65) * 4; // A -> 0, ? -> 27 ???
        }
        //System.out.println(currentCharacter);

        /*int height = 0; // height
        int width = 0; // width



        //--o Detectam quants caracter té una línea i quantes línea hi ha. D'aquesta forma podem donar una tamany coherent a l'array
        char[] ar = new char[data.length()];
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '\n'){
                height ++;
            }
            ar[i] = data.charAt(i);
        }
        int espaciado = 0;
        width = data.indexOf("\n") + 1;
        espaciado = 1; //formula espaciado
        int anchoLetra = (width / 27 ) - espaciado;

        System.out.println(width);
        System.out.println(anchoLetra);
        System.out.println(espaciado);
        //int espaciado = width + 1; //formula espaciado

        //System.out.println(width);

        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            strB.append(ar[i]);
        }*/

        /*for (int i = 0; i < alfabet.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.printf("%s",alfabet[i][j]);
            }
        }*/


        /*int amp = width / 27;
        int alt = height+=1;
        char lletra [][] = new char [alt][amp];*/







        //--o Pintar la lletra :D
        /*for (int i = 0; i < lletra.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < lletra[i].length; j++) {
                System.out.printf("%s",lletra[i][j]);
            }
        }*/

    }
}
