import javax.swing.*;

public class faixaEtaria {

    public static String retornaMensagem(int valor){

        if(valor > -1 && valor < 3){

            return "Bebê";

        }
        else if(valor > 2 && valor < 12){

            return "Criança";

        }
        else if(valor > 11 && valor < 20){

            return "Adolescente";

        }
        else if(valor > 19 && valor < 31){

            return "Jovem";

        }
        else if(valor > 30 && valor < 61){

            return "Adulto";

        }
        else if(valor > 60){

            return "Idoso";

        }

        return "Valor não aceito";

    }
    public static void main(String[] args) {
        
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma idade:"));

        JOptionPane.showMessageDialog(null, retornaMensagem(valor));

    }
}