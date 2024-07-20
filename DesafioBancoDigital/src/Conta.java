public class Conta {

    static int agenciaPadrao = 2829;
    static int contaInicial = 1000;
    
    private int agencia;
    private int conta;
    private double saldo;

    //CONSTRUCTORS NUMERO CONTAS
    
    public Conta() {
        this.agencia = agenciaPadrao;
        this.conta = contaInicial++;
    }

    //GETTERS

    public int getAgencia() {
        return agencia;
    }
    
    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    //METODOS

    void sacar(double valor) {
        this.saldo=saldo-valor;
    }

    void depositar(double valor) {
        this.saldo=saldo+valor;
    }

    void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirDadosComunsExtrato() {
        System.out.println();
        System.out.printf("AGENCIA: %d\n", this.agencia);
        System.out.printf("CONTA: %d\n", this.conta);
        System.out.printf("SALDO: R$ %.2f\n", this.saldo);
    }
    

}
