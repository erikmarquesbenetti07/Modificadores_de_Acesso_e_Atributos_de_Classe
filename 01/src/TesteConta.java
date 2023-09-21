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
class TesteConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        System.out.println("Total de contas: " + Conta.getTotalDeContas());

        conta1.depositar(100);
        conta2.depositar(200);

        System.out.println("Saldo conta 1: " + conta1.getSaldo());
        System.out.println("Saldo conta 2: " + conta2.getSaldo());

        conta1.sacar(50);
        conta2.sacar(300);

        System.out.println("Saldo conta 1 após saque: " + conta1.getSaldo());
        System.out.println("Saldo conta 2 após saque: " + conta2.getSaldo());
    }
}