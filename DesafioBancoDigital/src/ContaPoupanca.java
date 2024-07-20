public class ContaPoupanca extends Conta{

    public void imprimirExtrato() {
        System.out.println();
        System.out.println("===== EXTRATO CONTA-POUPANCA =====");
        super.imprimirDadosComunsExtrato();
    }
    
}
