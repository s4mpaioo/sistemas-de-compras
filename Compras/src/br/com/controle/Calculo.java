package br.com.controle;

import javax.swing.JOptionPane;

public class Calculo {
    private int qtd;
    private double desconto;
    private double total;
    private int parcelas;
    private double valor;

    public double getTotal() {
        return total;
    }
    public double getValor() {
        return valor;
    }

    public void carrinho(double valor) {  
        this.valor = valor;
        if(valor <= 0){
            JOptionPane.showMessageDialog(null, "Só é permitido valores maiores que 0.", "Erro", 0);
        } else {
            qtd++;
            this.total = total + valor;        
        }
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas; 
        
        if (parcelas > 12) {
            JOptionPane.showMessageDialog(null, "Só é permitido até 12 parcelas.", "Erro", 0);
        } 
        if (parcelas <= 0 ) {
            JOptionPane.showMessageDialog(null, "Só é permitido parcelas maiores que 1.", "Erro", 0);
        } 
    }

    public double getDesconto() {
        return desconto;
    }

    public double calcularDesconto() {
        double porcentagem = 0;
        if (parcelas == 1) {
            porcentagem = 0.15;
        } else if (parcelas <= 3) {
            porcentagem = 0.10;
        } else if (parcelas <= 6){
            porcentagem = 0.03;
        }
        desconto = total * porcentagem;
        return total - desconto;
    }

    public double calcularMedia() {
        if (qtd == 0) {
            return 0;
        }
        return total / qtd;
    }
}
