import javax.swing.*;
import java.util.*;

public class ArrayRecebe10ValoresEOrdena {
    
    public static int[] atribuiValor(int[] str){

        for(int y = 0; y < str.length; y++){

            str[y] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor número " +(y+1) +":"));

        }

        return str;

    }

    public static String mostrarValorEmOrdemInversa(int[] str){

        String resultado = "";

        for(int y = str.length-1; y > -1; y--){

            resultado += str[y] +", ";

        }

        return resultado.substring(0, resultado.length()-2);

    }

    public static int[] classificaValores(int[] str){

        Arrays.sort(str);

        return str;

    }

    public static String mostrarValor(int[] str){

        String resultado = "";

        for(int y = 0; y < str.length; y++){

            resultado += str[y] +", ";

        }

        return resultado.substring(0, resultado.length()-2);

    }

    public static void main(String[] args) {
        
        int[] str = new int[10];

        str = atribuiValor(str);
        
        JOptionPane.showMessageDialog(null, "Valores em ordem inversa: " +mostrarValorEmOrdemInversa(str));

        str = classificaValores(str);

        JOptionPane.showMessageDialog(null, "Valores ordernados: " +mostrarValor(str));

    }
}
