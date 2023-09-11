import javax.swing.*;

public class VerificaSeTextoPalindromo {

    public static String removeEspaco(String entrada){

        StringBuilder saida = new StringBuilder();

        for(int y = 0; y < entrada.length(); y++){

            if(entrada.charAt(y) != ' '){

                saida.append(entrada.charAt(y));

            }
            else{

                continue;

            }
        }

        return saida.toString();

    }

    public static String inverteString(String entrada){

        StringBuilder saida = new StringBuilder();

        for(int y = entrada.length()-1; y > -1; y--){

            saida.append(entrada.charAt(y));
            
        }

        return saida.toString();

    }

    public static String comparaString(String entrada1, String entrada2){

        for(int y = 0; y < entrada1.length();){

            if(entrada1.charAt(y) != entrada2.charAt(y)){

                return "Não é palíndromo";

            }
            else{

                return "É palíndromo";

            }
        }

        return "";

    }

    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog(null, "Digite uma palavra ou frase:");
    
        entrada = removeEspaco(entrada);

        String entrada2 = inverteString(entrada);

        JOptionPane.showMessageDialog(null, comparaString(entrada, entrada2));

    }
}