
public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
 
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(1000);
        cc.imprimirExtrato();
        cc.transferir(500, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
