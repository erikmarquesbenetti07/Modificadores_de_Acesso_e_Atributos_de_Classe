/*
Implemente um programa que utilize um array (vetor) para armazenar os funcionários
sde uma empresa. Utilize construtores para que o “tamanho” desse array não seja fixo.
Não esqueça que é recomendado que os atributos sejam privados e, portanto,
implemente os getters e setters necessários. 
*/

class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa(5);

        Funcionario funcionario1 = new Funcionario("João", 30, 3000);
        empresa.adicionarFuncionario(funcionario1, 0);

        Funcionario funcionario2 = new Funcionario("Maria", 25, 2500);
        empresa.adicionarFuncionario(funcionario2, 1);

        Funcionario funcionario3 = new Funcionario("Carlos", 35, 3500);
        empresa.adicionarFuncionario(funcionario3, 2);

        Funcionario funcionario4 = new Funcionario("Ana", 28, 2800);
        empresa.adicionarFuncionario(funcionario4, 3);

        Funcionario funcionario5 = new Funcionario("Pedro", 32, 3200);
        empresa.adicionarFuncionario(funcionario5, 4);

        for (int i = 0; i < empresa.capitarFuncinario().length; i++) {
            Funcionario funcionario = empresa.obterFuncionario(i);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("--------------------");
        }
    }
}