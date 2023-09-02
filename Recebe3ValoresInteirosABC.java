import javax.swing.*;

public class Recebe3ValoresInteirosABC {
    
    public static String funcaofor(int a, int b, int c){

        String resultado = "";

        for(int y = 0; y < c-1; y++){

            resultado += a +", ";

            a += b;

        }

        return resultado +a +".";

    }

    public static void main(String[] args) {
    
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de B:"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de C:"));

        JOptionPane.showMessageDialog(null, funcaofor(a,b,c));

    }
}