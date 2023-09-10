    import java.util.Scanner;
    
    public class ContaTerminal {
        public static void main(String[] args) {

        Banco banco = new Banco();

        Scanner scanString = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        if (banco.conta == 0) {
            System.out.println("Parece que você ainda não tem uma conta, deseja criar uma? S/N");
            banco.criarConta = scanString.next();
      
            switch (banco.criarConta) {
                case "S", "s": 
                    System.out.println("Digite sua conta");
                    banco.conta = scanInt.nextInt();
                    System.out.println("Digite Sua Agencia");
                    banco.agencia = scanInt.next();
                    System.out.println("Digite seu nome Completo");
                    banco.nomeCliente = scanString.next();
                    System.out.println("Cadastro Completo!");
                    System.out.println("Olá " + banco.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + banco.agencia + ", sua conta é " + banco.conta + " e seu saldo " + banco.saldo + " já está disponível para saque.");
                    break;
                case "N", "n":
                    break;
            }
        }

        if (banco.conta != 0) {
            for (int usuario = 0; usuario != 5;) {
                System.out.println("Você deseja: ");
                System.out.println("Depositar - 1, Sacar - 2, Ver saldo - 3, Ver conta - 4, Finalizar - 5");
                usuario = scanInt.nextInt();

                switch (usuario) {
                    case 1:
                        banco.depositar();
                        System.out.println(banco.saldo);
                        break;
                    case 2:
                        banco.sacar();
                        System.out.println(banco.saldo);
                        break;
                    case 3:
                        banco.verSaldo();
                        break;
                    case 4:
                        banco.verConta();
                        break;
                    case 5:
                        break;
                }   
            }
        } else {

        };


        scanInt.close();
        scanString.close();
    }

}

