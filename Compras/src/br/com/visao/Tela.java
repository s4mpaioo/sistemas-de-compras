package br.com.visao;

import javax.swing.JOptionPane;
import br.com.controle.Calculo;

public class Tela{
  public static void main(String[] args) {
        Calculo calculo = new Calculo();
        
        int i = 1;
        JOptionPane.showMessageDialog(null, "Como funciona nossos desconto:\n"
                + "- 1 parcela 15% de desconto (compra a vista).\n"
                + "- Parcelamento em ate 3 vezes 10% de desconto.\n"
                + "- Parcelamento em até 6 vezes 3% de desconto."
        );
        do {
            do{
            calculo.carrinho(Double.valueOf(JOptionPane.showInputDialog("Total da compra: " + calculo.getTotal()+ "\nDigite o valor do produto: ")));
            } while(calculo.getValor() <= 0);
            i = Integer.valueOf(JOptionPane.showInputDialog("Deseja adicionar mais um produto?\n1 - para adicionar\n0 - para encerrar"));
        } while (i == 1);
        do {
        calculo.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite em quantas vezes deseja parcelar: ")));
        } while (calculo.getParcelas() <= 0 || calculo.getParcelas() > 12);
        String mensagem = "Valor total das compras com desconto R$ " + calculo.calcularDesconto()+ 
                "\nDesconto total aplicado R$ " + calculo.getDesconto()+ 
                "\nMédia das compras R$ " + calculo.calcularMedia();
        String titulo = "Informações";
        JOptionPane.showMessageDialog(null, mensagem, titulo, 1);   
        
    }
}
