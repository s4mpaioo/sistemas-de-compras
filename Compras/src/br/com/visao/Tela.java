package br.com.visao;

import javax.swing.JOptionPane;
import br.com.controle.Calculos;

public class Tela {
    public static void main(String[] args) {
        Calculos c = new Calculos();
        
        int i = 1;
        JOptionPane.showMessageDialog(null, "Como funciona nossos desconto:\n"
                + "- 1 parcela 15% de desconto (compra a vista).\n"
                + "- Parcelamento em ate 3 vezes 10% de desconto.\n"
                + "- Parcelamento em 4 ou mais vezes 3% de desconto."
        );
        do {
            c.setTotal(Double.valueOf(JOptionPane.showInputDialog("Digite o valor da compra: ")));
            c.setParcelas(Integer.valueOf(JOptionPane.showInputDialog("Digite em quantas vezes deseja parcelar: ")));
            c.setDesconto();            
            c.acumularTotal();

            i = Integer.valueOf(JOptionPane.showInputDialog("Deseja adicionar mais um produto?\n1 - para adicionar\n0 - para encerrar"));
        } while (i == 1);
        
        JOptionPane.showMessageDialog(null, "Valor total das compras R$ " + c.getSomaTotal());
        JOptionPane.showMessageDialog(null, "Desconto total aplicado R$ " + c.getDescontoTotal());
        JOptionPane.showMessageDialog(null, "Média das compras R$ " + c.calcularMedia());
    }
}
