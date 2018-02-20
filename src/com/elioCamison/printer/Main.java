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
        //--o -----------------------------------------------------------------------------------------------------
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";
        int height = 0;
        int width = 0;
        //--o Detectam quants caracter té una línea i quantes línea hi ha. D'aquesta forma podem donar una tamany coherent a l'array
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '\n')
                height ++;
            if (data.charAt(i) != '\n' && height==1){
                width++;
            }
        }
        //--o -----------------------------------------------------------------------------------------------------

        /*//--o Altura
        height+=1;
        //--o Anchura
        width /= 27;*/

        int amp = width / 27;
        int alt = height+=1;
        char lletra [][] = new char [alt][amp];

        //--o -----------------------------------------------------------------------------------------------------

        int resta = 2;
        int posicio =0;
        //--o Recorrem l'alfabet per saber quants de caràcters s'han de restar a la variable data. D'aquesta forma sabrem quina lletra hem de pintar
        for (int i = 0; i < alfabet.length(); i++) {
            if(alfabet.charAt(i) == 'B' && alfabet.charAt(i) != 'A'){
                posicio = i+1;
                resta *= posicio;
            }
            System.out.print(alfabet.charAt(i));
        }



        System.out.println();
        System.out.println(posicio);

        System.out.println();
        System.out.println(resta);

        System.out.println();
        System.out.println(width - resta);

        /*
        //--o Gañanada *1000
        lletra[0][0] = ' ';
        lletra[0][1] = '#';
        lletra[0][2] = ' ';

        lletra[1][0] = '#';
        lletra[1][1] = ' ';
        lletra[1][2] = '#';

        lletra[2][0] = '#';
        lletra[2][1] = '#';
        lletra[2][2] = '#';

        lletra[3][0] = '#';
        lletra[3][1] = ' ';
        lletra[3][2] = '#';

        lletra[4][0] = '#';
        lletra[4][1] = ' ';
        lletra[4][2] = '#';

        //--o Pintar la lletra :D
        for (int i = 0; i < lletra.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j < lletra[i].length; j++) {
                System.out.printf("%s",lletra[i][j]);
            }
        }*/

    }
}
