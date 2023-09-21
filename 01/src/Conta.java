/*
Reescreva a classe Conta apresentada anteriormente fazendo com que o saldo
possa ser alterado apenas por meio dos métodos depositar e sacar. Em seguida,
implemente uma classe para realizar os devidos testes.

class Conta {
    private static int totalDeContas;

    Conta() {
    Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    public static int getTotalDeContas() {
    return Conta.totalDeContas;
}

int total = Conta.getTotalDeContas();

} 
*/
class Conta {
    private static int totalDeContas;
    private double saldo;

    public Conta() {
        Conta.totalDeContas++;
    }

    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
