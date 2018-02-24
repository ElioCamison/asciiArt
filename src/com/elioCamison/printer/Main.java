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
        System.out.println(p.render("A"));
/*
         int MAX_LENGTH = 27;
         int height = 0;
         char currentChar = 65;
         char[][] alphabet = new char[5][107];
         String[] rows;


            rows = data.split("\n");

        int largo = data.indexOf("\n");

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < largo; j++) {
                alphabet[i][j] = data.charAt(j);
            }

        }
        System.out.println(Arrays.deepToString(alphabet));*/




    }
}
