import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Seja bem vindo ao Banco DIO!");
        System.out.print("Antes de começarmos, informe o seu nome: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Por favor, informe o número da agência: ");
        String numeroAgencia = scan.next();
        System.out.print("Agora, informe o número da sua conta: ");
        int numeroConta = scan.nextInt();
        System.out.print("Por fim, informe o saldo da sua conta: ");
        double saldoConta = scan.nextDouble();
            
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência " +
        "é "+ numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque");
        scan.close();
    }
}
