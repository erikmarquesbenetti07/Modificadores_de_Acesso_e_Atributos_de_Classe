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


class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(200, "João");

        System.out.println("Total de contas: " + Conta.getTotalDeContas());

        conta1.depositar(100);

        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());
        System.out.println("Titular da conta 2: " + conta2.getTitular());
    }
}