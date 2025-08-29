# Sistema de Compras em Java

Este projeto é um sistema simples de compras desenvolvido em Java, utilizando `JOptionPane` para interação com o usuário. Ele permite ao usuário adicionar múltiplos produtos ao carrinho, visualizar o valor total, escolher o número de parcelas e receber descontos conforme a forma de pagamento.

## Funcionalidades

- Entrada do valor da compra via interface gráfica
- Registro de múltiplos produtos
- Exibição do valor total acumulado
- Escolha do número de parcelas (até 12x)
- Cálculo da média dos valores comprados
- Apresentação dos resultados finais diretamente na tela, incluindo o valor total, descontos aplicados e média das compras

## Regras de Desconto

- Cálculo automático de desconto:

| Parcelas        | Desconto Aplicado |
|-----------------|-------------------|
| 1               | 15%               |
| 2 a 3           | 10%               |
| 4 a 6           | 3%                |

## Observações

- O sistema não permite valores negativos ou parcelas acima de 12.
- O desconto é aplicado automaticamente após a escolha das parcelas.
- O usuário é informado das regras de desconto antes de finalizar a compra.

##  Tecnologias Utilizadas

- Java (JDK 21)
- Swing (`JOptionPane`)
- Programação Orientada a Objetos


## Como Executar

Clone o repositório:
```bash
git clone https://github.com/s4mpaioo/sistemas_de_compras.git
```

## Compile os arquivos: 
```bash
javac br/com/controle/Calculos.java br/com/visao/Tela.java
```
## Execute:
```bash
java br.com.visao.Tela
```

