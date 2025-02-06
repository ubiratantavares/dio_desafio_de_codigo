// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do saldo inicial
        double saldoInicial = scanner.nextDouble();

        scanner.nextLine();
        
        // TODO: Na linha abaixo, implemente a entrada das três transações:
        String[] transacoes = scanner.nextLine().split(" ");
        
        // TODO: Na linha abaixo, realize o cálculo do saldo final:
        double saldoFinal = saldoInicial;
        
        for (int i = 0; i < transacoes.length; i++) {
          saldoFinal += Float.parseFloat(transacoes[i]);
        }
          
        // Saldo final
        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
