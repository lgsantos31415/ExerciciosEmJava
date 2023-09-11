import javax.swing.*;
import java.util.Random;

public class MatrizJava {

    public static int [][] atribuiRandomicamente(int [][] matriz){

        int [][] matriz2 = new int[matriz.length][matriz[0].length];

        Random r = new Random();

        for(int x = 0; x < matriz.length; x++){

            for(int y = 0; y < matriz[0].length; y++){

                matriz2[x][y] = r.nextInt(100);

            }
        }

        return matriz2;

    }

    public static String apresentaMatriz(int [][] matriz){

        String resultado = "";

        for(int x = 0; x < matriz.length; x++){

            for(int y = 0; y < matriz[0].length; y++){

                resultado += String.format("%02d", matriz[x][y]) +" ";

            }

            resultado += "\n";

        }

        return resultado;

    }

    public static String apresentaDiagonalPrincipal(int [][] matriz){

        String resultado = "";

        for(int x = 0; x < matriz.length; x++){

            resultado += String.format("%02d", matriz[x][x]) +" ";

        }

        return resultado;

    }

    public static String apresentaDiagonalSecundaria(int [][] matriz){

        String resultado = "";

        for(int x = matriz.length-1, y = 0; x > -1 ; x--, y++){

            resultado += String.format("%02d", matriz[x][y]) +" ";

        }

        return resultado;

    }

    public static void main(String[] args) {

        int [][] matriz = new int[5][5];

        matriz = atribuiRandomicamente(matriz);

        JOptionPane.showMessageDialog(null, apresentaMatriz(matriz));

        JOptionPane.showMessageDialog(null, apresentaDiagonalPrincipal(matriz));

        JOptionPane.showMessageDialog(null, apresentaDiagonalSecundaria(matriz));

    }
}