import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int NumeroConta;
        String Agencia;
        String NomeCliente;
        double Saldo;

        Scanner inputStrings = new Scanner(System.in).useLocale(Locale.US);
        Scanner inputNumbers = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência!");
        Agencia = inputStrings.next();

        System.out.println("Por favor, digite o número da Conta!");
        NumeroConta = inputNumbers.nextInt();

        System.out.println("Por favor, digite o nome do cliente!");
        inputStrings.nextLine();
        NomeCliente = inputStrings.nextLine();

        System.out.println("Por favor, digite o Saldo!");
        Saldo = inputNumbers.nextDouble();

        System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+NumeroConta+" e seu saldo de "+Saldo+" já está disponível para saque.");
        
    }
}
