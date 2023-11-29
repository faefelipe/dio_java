import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        try {
            Scanner s = new Scanner(System.in);

            String nomeCliente;
            String agencia;
            int numero;
            double saldo;
            System.out.println("Por favor, digite o seu nome !");
            nomeCliente = s.next();

            System.out.println("Por favor, digite o número da Agência!");
            agencia = s.next();

            System.out.println("Por favor, digite o número da Conta!");
            numero = s.nextInt();

            System.out.println("Por favor, digite o número da Saldo!");
            saldo = s.nextDouble();

            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " + numero +
                    " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (Exception e) {
            System.out.print("O valor informado não é um número!");
        }

    }
}
