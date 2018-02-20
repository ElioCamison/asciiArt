package com.elioCamison.printer;

public class Printer {

        private String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

        // Constructor: accepta un String amb la representació de tot l'alfabet
        // Hi haurà 27 lletres en total, separades per un espai en blanc.
        public Printer(String alphabet) {

                this.alfabet = alphabet;
        }


        private char[][] letter(String data){
            int height = 0;
            int width = 0;
            for (int i = 0; i < data.length(); i++) {
                if(data.charAt(i) == '\n')
                    height ++;
                if (data.charAt(i) != '\n' && height==1){
                    width++;
                }
            }
            //--o Altura
            height+=1;
            //--o Anchura
            width /= 27;

            char lletra [][] = new char [height][width];
            return lletra;
        }


        // Mètode render: accepta un String amb el text a representar i torna
        // també un String amb el text en forma d'ASCII Art.
        // Només es consideren les lletres majúscules de la A a la Z. Les
        // minúscules es passen a majúscules, i els altres caràctes es tradueixen
        // a «?» (manco l'espai en blanc).
        public String render(String text) {

            return "";
        }


}
