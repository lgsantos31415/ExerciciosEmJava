import javax.swing.*;

public class VerificaSeTextoPalindromo{

    public static String retiraEspaco(String str){

        StringBuilder str2 = new StringBuilder("");

        for(int y = 0, x = 0; y < str.length(); y++){

            if(str.charAt(y) != ' '){
                str2.insert(x, str.charAt(y));
                x++;
            }
            else{
                continue;
            }
        }

        return str2.toString();

    }

    public static String inverteString(String str){

        StringBuilder str2 = new StringBuilder("");

        for(int y = str.length()-1, x = 0; y > -1; y--, x++){

            str2.insert(x, str.charAt(y));

        }

        return str2.toString();

    }

    public static String comparaString(String str, String str2){

        for(int y = 0; y < str.length(); y++){

            if(str.charAt(y) != str2.charAt(y)){

                return "Não é palíndromo";

            }
            else{

                return "É palíndromo";

            }
        }

        return "";

    }

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Digite um texto ou frase:");
        str = retiraEspaco(str);

        String str2 = inverteString(str);

        JOptionPane.showMessageDialog(null, comparaString(str, str2));
    }
}