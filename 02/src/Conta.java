/*
Adicione um construtor a classe Conta que seja capaz de inicializar todos os seus
atributos. Em seguida, implemente um programa para instanciar dois objetos do
tipo Conta sendo que apenas um deles deve ser instanciado por meio desse construtor. 
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
*/

class Conta {
    private static int totalDeContas;
    private double saldo;
    private String titular;

    public Conta() {
        Conta.totalDeContas++;
    }

    public Conta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
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

    public String getTitular() {
        return this.titular;
    }
}