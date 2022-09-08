package com.ana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositoInicial = 0;

        System.out.print("Digite o número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Fará o depósito inicial?");
        String resposta = scanner.nextLine();
        if(resposta .equals("sim")){
            System.out.print("Digite o valor do depósito inicial: ");
            depositoInicial = scanner.nextDouble();
        }

        Conta conta = new Conta(numero, titular, depositoInicial);
        System.out.println(conta.toString());

        System.out.println("Digite o valor do seu depósito: ");
        double deposito = scanner.nextDouble();
        conta.deposito(deposito);
        System.out.println(conta.toString());

        System.out.println("Digite o valor do saque:");
        double saque = scanner.nextDouble();
        conta.saque(saque);
        System.out.println(conta.toString());

        scanner.close();

    }
}
