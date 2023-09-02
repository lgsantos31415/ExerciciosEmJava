import javax.swing.*;

public class RecebeDoisValoresEMostraResultado{

    public static double soma(double a, double b){

        return a+b;

    }

    public static double subtracao(double a, double b){

        if(a>b){
            return a-b;
        }
        else{
            return b-a;
        }

    }

    public static double divisao(double a, double b){

        if(a>b){
            return a/b;
        }
        else{
            return b/a;
        }
    }

    public static double multiplicacao(double a, double b){

        return a*b;
    }

    public static double pot(double a, double b){

        double result = 1;

        for(int y = 1; y <= b; y++){
            
            result *= a;

        }

        return result;

    }

    public static void main(String[] args) {
        
        int result = 0;

        double valor1, valor2;

        valor1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));

        while(true){

            result = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha um dos seguintes operadores: \n1 - Soma\n2 - Substraçãoo\n3 - Multiplicação\n4 - Divisão\n5 - Potência"));

            if(result > 0 && result < 6){

                break;

            }
        }

        switch (result) {
            case 1:
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " +soma(valor1, valor2));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "O resultado da subtração do maior valor pelo menor valor é: " +subtracao(valor1, valor2));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " +multiplicacao(valor1, valor2));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "O resultado da divisão do maior valor pelo menor valor é: " +divisao(valor1, valor2));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "O resultado da potência de " +valor1 +" elevado a " +valor2 +" é: " +pot(valor1, valor2));
                break;
        
            default:
                break;
        }
    }
}