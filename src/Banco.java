import java.util.Scanner;

public class Banco {
  int conta;
  String agencia = "";
  String nomeCliente = "";
  double saldo;
  String criarConta = "" ;
  String deposito = "";
  double saque;

 Scanner scan = new Scanner (System.in);

  public void criandoConta () {
    if (conta == 0) {
      System.out.println("Parece que você ainda não tem uma conta, deseja criar uma? S/N");
      criarConta = scan.next();

      switch (criarConta) {
      case "S": 
        System.out.println("Digite sua conta");
        conta = scan.nextInt();
        System.out.println("Digite Sua Agencia");
        agencia = scan.next();
        System.out.println("Digite seu nome Completo");
        nomeCliente = scan.next();
        break;
      case "N":
        break;
    }
    };
  }

  public void verConta () {
    System.out.println("Conta: " + conta);
    System.out.println("Número da agencia: " + agencia);
    System.out.println("Cliente: " + nomeCliente);
  }

  public void verSaldo () {
    if (saldo == 0) {
      System.out.println("Parece que você ainda não adicionou nenhum saldo! Deseja fazer um deposito? S/N");
      deposito = scan.next();
    } else if (saldo >= 1) {
      System.out.println(saldo);
    };

    switch (deposito) {
      case "S", "s": 
        depositar();
        break;
      case "N", "n":
        System.out.println("Deposito cancelado.");
        break;
    }
  }

  public void depositar () {
      System.out.println("Valor desejado: ");
      deposito = scan.next();
      System.out.println("Depósito efetuado");
      saldo = Double.parseDouble(deposito);
      System.out.println("Você tem: " + saldo);
  }

  public void sacar () {
    System.out.println("Valor desejado: ");
    saque = scan.nextDouble();

    if (saque > saldo) {
      System.out.println("Saldo insuficiente");
    } else {
      System.out.println("Saque efetuado");
      saldo -= saque;
      System.out.println("Você tem: " + saldo);
    };
  }
}
