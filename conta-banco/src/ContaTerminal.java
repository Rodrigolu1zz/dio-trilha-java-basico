import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int conta = 0;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da conta: ");
        conta = sc.nextInt();
        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Por favor, informe o seu saldo inicial: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ conta + " e seu saldo " + saldo +  " já está disponível para saque");

        sc.close();

    }
}
