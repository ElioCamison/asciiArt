package com.elioCamison.printer;

public class Printer {

        private char[] ascii = new char[0];
        private int height = 0; // altura d'algo
        private int width = 0; // tamany de algo
        private int spacing = 0; // espai entre lletres
        private int letterWidth = 0; // com de gran es sa leltra perque soc un burro

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

            // Recorremos el texto que nos llega por parámetro
            for (int k = 0; k < text.length(); k++) {
                // Introducimos un espacio en la variable resultado, para que genere un espacio entre las letras.
                result += "\n";
                // Comprovamos que los caracteres que tiene el texto están dentro del abecedario. A a Z
                if (text.codePointAt(k) > 65 && text.codePointAt(k) < 90 ) {
                    // Introducimos en el caracter actual el valor del caracter que itera K, multiplicandolo por el ancho de la letra más el espacio entre estas.
                    currentCharacter = (text.charAt(k) - 65) * (letterWidth + spacing);
                } else {
                    // En caso de no estar dentro del rango, multiplicamos 26 por el ancho de las letras más el espacio, restandole 1, para que no se salga del array.
                    currentCharacter = (26 * (letterWidth + spacing))-1;
                }
                // Iteramos el alto del abecedario
                for (int i = 0; i < height; i++) {
                    // Iteramos el ancho de la letra más el espacio
                    for (int j = 0; j < letterWidth + spacing; j++) {
                        // Introduce el valor del caracter actual dentro del array, que a su vez concatena el string resultado.
                        // Concatenamos en el resultado el caracter actual sumando la iteración de j, más el ancho multiplicado por la iteración del alto.
                        result += ascii[(currentCharacter + j)  + (width * i) ];
                    }
                    result += "\n";
                }
            }

            return result;
        }

}
