/*Altere o exercício anterior para que a classe Funcionario possua diversos construtores
com parâmetros diferentes, sendo que deve haver reaproveitamento de código entre
eles. Em seguida, altere a classe principal para fazer uso desses construtores. 
*/

class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        Funcionario funcionario1 = new Funcionario("João", 30, 3000);
        empresa.adicionarFuncionario(funcionario1, 0);

        Funcionario funcionario2 = new Funcionario("Maria", 25);
        empresa.adicionarFuncionario(funcionario2, 1);

        Funcionario funcionario3 = new Funcionario("Carlos");
        empresa.adicionarFuncionario(funcionario3, 2);
    }
}
