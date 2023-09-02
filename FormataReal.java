import javax.swing.*;

public class FormataReal {
    
    public static String formataCentavos(double entrada){

        String resultado = String.format("%.2f", entrada);

        return resultado;

    }

    public static String adicionaPontos(String entrada){

        if(entrada.length()-3 > 3){

            StringBuffer str = new StringBuffer(entrada);

            for(int y = entrada.length()-4, x = 0; y > -1 ; y--, x++){

                if(x == 3){

                    x = 0;

                    str.insert(y+1, '.');

                }
            }

            entrada = str.toString();

            return entrada;

        }
        else{

            return entrada;

        }
    }

    public static void main(String[] args) {

        double entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor:\n*Utilize \".\" para separar casas decimais"));

        String resultado = formataCentavos(entrada);

        JOptionPane.showMessageDialog(null, "R$" +adicionaPontos(resultado));

    }
}
