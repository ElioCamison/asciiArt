package com.elioCamison.printer;

public class Printer {

    private char[] ascii = new char[0];
        private int height = 0; //--o altura de data
        private int width = 0; //--o tamany de data
        private int spacing = 0; //--o espai entre lletres
        private int letterWidth = 0;

        // Constructor: accepta un String amb la representació de tot l'alfabet
        // Hi haurà 27 lletres en total, separades per un espai en blanc.
        public Printer(String alphabet) {

            char[] ar = new char[alphabet.length()];

            for (int i = 0; i < alphabet.length(); i++) {
                if(alphabet.charAt(i) == '\n'){
                    this.height ++;
                }
                ar[i] = alphabet.charAt(i);
            }
            height += 1;

            this.width = alphabet.indexOf("\n") + 1;
            this.spacing = 1;
            this.letterWidth = (this.width / 27 ) - this.spacing;
            this.ascii = ar;
        }

        // Mètode render: accepta un String amb el text a representar i torna
        // també un String amb el text en forma d'ASCII Art.
        // Només es consideren les lletres majúscules de la A a la Z. Les
        // minúscules es passen a majúscules, i els altres caràctes es tradueixen
        // a «?» (manco l'espai en blanc).
        public String render(String text) {
            String result = "";
            text = text.toUpperCase();
            int currentCharacter = 0;

            //--o Recorremos el número de líneas.
            for (int i = 0; i < this.height; i++) {
                //--o Recorremos el texto que llega por parámetro
                for (int j = 0; j < text.length(); j++) {
                    //--o Comprobamos cada caracter del texto si está dentro de las letras que se permiten
                    if (text.codePointAt(j) >= 65 && text.codePointAt(j) <= 90 ) {
                        //--o Guardamos el valor del texto, restandole 65(o lo que es igual a la letra A), y seguidamente lo multiplicamos por el ancho de la letra más el espacio
                        currentCharacter = (text.charAt(j) - 65) * (this.letterWidth + this.spacing);
                    } else {
                        //--o De no estar entre los caracteres aceptados, recuperamos directamente el interrogante.
                        currentCharacter = this.width - letterWidth - spacing;
                    }
                    //--o Iteramos el ancho de la letra más el espacio
                    for (int k = 0; k < this.letterWidth; k++) {
                        //--o Si el caracter encontrado es igual a un espacio, lo concatena
                        if (text.codePointAt(j) == 32){
                            result += " ";
                        } else {
                            //--o En caso contrario concatena el caracter obtenido y lo itera.
                            result += this.ascii[(currentCharacter + k)  + (this.width * i) ];
                        }
                    }
                    //--o Añade un espacio
                    if( j < text.length()-1 ){
                        result += " ";
                    }
                }
                //--o Añade un salto de línea
                if( i < this.height-1 ){
                    result += "\n";
                }
            }
            return result;
        }
}
