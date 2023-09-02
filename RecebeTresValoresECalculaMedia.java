import javax.swing.*;

public class RecebeTresValoresECalculaMedia {
    
    public static void main(String[] args) {
        
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));

        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));

        double c = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o terceiro valor: "));

        JOptionPane.showMessageDialog(null, "A média dos três valores digitados é: " +((a+b+c)/3));

    }
}