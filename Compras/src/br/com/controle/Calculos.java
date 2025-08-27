package br.com.controle;

import javax.swing.JOptionPane;

public class Calculos {
    private int qtd;
    private double desconto;
    private double descontoTotal;
    private double total;
    private int parcelas;
    private double soma;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        qtd++;
        this.total = total;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        if (parcelas > 12) {
            JOptionPane.showMessageDialog(null, "Erro: so e permitido ate 12 parcelas.");
            return;
        }
        this.parcelas = parcelas;

        if (parcelas == 1) {
            JOptionPane.showMessageDialog(null, "A compra sera a vista.");
        } else {
            JOptionPane.showMessageDialog(null, "A compra sera parcelada");
        }
    }

    public double getDesconto() {
        return desconto;
    }

    public double getDescontoTotal() {
        return descontoTotal;
    }

    public void setDesconto() {
        double porcentagem = 0;
        if (parcelas == 1) {
            porcentagem = 0.15;
        } else if (parcelas <= 3) {
            porcentagem = 0.10;
        } else {
            porcentagem = 0.03;
        }
        this.desconto = total * porcentagem;
        this.descontoTotal += this.desconto;
    }

    public double getSomaTotal() {
        return soma;
    }

    public void acumularTotal() {
        soma += total;
    }

    public double calcularMedia() {
        if (qtd == 0) {
            return 0;
        }
        return soma / qtd;
    }
}
