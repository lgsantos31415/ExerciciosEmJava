import javax.swing.*;
import java.util.*;

public class MatrizJava{

    public static void atribuiNumerosRandomicos(int[][] matriz){

        Random r = new Random();

        int x, y;

        for(x = 0; x < matriz.length; x++){

            for(y = 0; y < matriz[y].length; y++){

                matriz[x][y] = r.nextInt(0, 10);

            }
        }
    }

    public static void main(String[] args) {

        int[][] matriz = new int[5][7];

        atribuiNumerosRandomicos(matriz);

    }
}