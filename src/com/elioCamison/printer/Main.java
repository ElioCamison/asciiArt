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


        int espais = 0,posicio = 0;

        int count = 0;
        int caracteres = 0;
        for (int i = 0; i < data.length(); i++) {
            if(data.charAt(i) == '\n')
            count ++;
            if (data.charAt(i) != '\n' && count==1){
                caracteres++;
            }
        }
        count+=1;
        caracteres /= 27;
        char lletra [][] = new char [3][5];

        System.out.println(count);
        System.out.println(caracteres);

        /*for (int i = 0; i < data.length(); i++) {
            if(32 == data.charAt(i)){
                espais++;
                lletra[i][i] = ' ';
            } else {
                lletra[i][i] = data.charAt(i);
            }
            System.out.println(Arrays.deepToString(lletra));

        }*/


        /*for (int i = 0; i < lletra.length; i++) {
            lletra[i][i] = 'A';
            System.out.println(Arrays.deepToString(lletra));

        }

        System.out.println(Arrays.toString(lletra));
        System.out.println(p.render("A"));*/
    }
}
