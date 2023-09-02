import javax.swing.*;

public class ExcecoesJava {
    
    private double valorTotal;
    private double entrada;
    private int parcelas;
    private double valorParcelas;

    public void atribuirValorEntrada(double valorTotal, double entrada){

        if(entrada < valorTotal*0.2){
            throw new RuntimeException("O valor de entrada deve ser 20% do valor total");
        }

        this.valorTotal = valorTotal;
        this.entrada = entrada;

    }

    public void atribuirParcelas(int parcelas){

        if(parcelas < 2 || parcelas > 12){
            throw new RuntimeException("O valor de parcelas deve ser no mínimo 1 e no máximo 12");
        }

        this.parcelas = parcelas;
        this.valorParcelas = (valorTotal-entrada)/parcelas;

    }

    public String mostrarFinanciamento(){

        return "Valor total: " +valorTotal +"\nEntrada: " +entrada +"\n Parcelas: " +parcelas +"\nValor por parcelas: " +valorParcelas;

    }

    public static void main(String[] args) {

        double valorTotal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor total:"));

        ExcecoesJava e = new ExcecoesJava();

        while(true){

            try{

                double entrada = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da entrada:\nO valor de entrada deve ser 20% do total"));

                e.atribuirValorEntrada(valorTotal, entrada);

                break;

            }
            catch (RuntimeException r){
                JOptionPane.showMessageDialog(null, r.getMessage());
            }
        }
        while(true){

            try{

                int parcelas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantas parcelas deseja fazer:\nPode parcelar em até 12x"));

                e.atribuirParcelas(parcelas);

                break;

            }
            catch (RuntimeException r){
                JOptionPane.showMessageDialog(null, r.getMessage());
            }
        }

        JOptionPane.showMessageDialog(null, e.mostrarFinanciamento());

    }
}