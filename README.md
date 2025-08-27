# Sistema de Compras em Java

Este projeto é um sistema simples de compras desenvolvido em Java, utilizando `JOptionPane` para interação com o usuário. O programa permite registrar múltiplas compras, calcular descontos com base na quantidade de parcelas, acumular o valor total e exibir a média dos valores comprados.

## Funcionalidades

- Entrada do valor da compra via interface gráfica
- Registro de múltiplos produtos
- Exibição do valor total acumulado
- Escolha do número de parcelas (até 12)
- Cálculo da média dos valores comprados
- Apresentação dos resultados finais diretamente na tela, incluindo o valor total, descontos aplicados e média das compras

## Regras de Desconto

- Cálculo automático de desconto:

| Parcelas        | Desconto Aplicado |
|-----------------|-------------------|
| 1               | 15%               |
| 2 a 3           | 10%               |
| 4 a 12          | 3%                |

##  Tecnologias Utilizadas

- Java (JDK 21)
- Swing (`JOptionPane`)
- Programação Orientada a Objetos


## Como Executar

Clone o repositório:
```bash
git clone https://github.com/usuario/repositorio.git
```

## Compile os arquivos: 
```bash
javac br/com/controle/Calculos.java br/com/view/Tela.java
```
## Execute:
```bash
java br.com.view.Tela
```

