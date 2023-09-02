import javax.swing.*;

public class VerificaSeTextoPalindromo{

    public static String removeSpace(String str){

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

    public static String inverterString(String str){

        StringBuilder str2 = new StringBuilder("");

        for(int y = str.length()-1, x = 0; y > -1; y--, x++){

            str2.insert(x, str.charAt(y));

        }

        return str2.toString();

    }

    public static String compareString(String str, String str2){

        if(str.equals(str2)){

            return "É palíndromo";

        }
        else{

            return "Não é palíndromo";

        }
    }

    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog(null, "Digite um texto ou frase:");
        str = removeSpace(str);

        String str2 = inverterString(str);

        JOptionPane.showMessageDialog(null, compareString(str, str2));
    }
}