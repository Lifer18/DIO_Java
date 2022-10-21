import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        double saldo;
        String nomeCliente;
        String agencia;

        System.out.println("Insira seu nome: ");
        nomeCliente = sc.next();

        System.out.println("Insira o numero da conta: ");
        numero = sc.nextInt();

        System.out.println("Insira a agencia: ");
        agencia = sc.next();

        System.out.println("Insira o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");

        sc.close();
    }
}
