/*
Implemente um programa que utilize um array (vetor) para armazenar os funcionários
sde uma empresa. Utilize construtores para que o “tamanho” desse array não seja fixo.
Não esqueça que é recomendado que os atributos sejam privados e, portanto,
implemente os getters e setters necessários. 
*/

class Empresa {
    private Funcionario[] funcionarios;

    public Empresa(int tamanho) {
        funcionarios = new Funcionario[tamanho];
    }

    public void adicionarFuncionario(Funcionario funcionario, int indice) {
        if (indice >= 0 && indice < funcionarios.length) {
            funcionarios[indice] = funcionario;
        } else {
            System.out.println("Índice inválido.");
        }
    }
    public Funcionario[] capitarFuncinario(){
        return this.funcionarios;
    }

    public Funcionario obterFuncionario(int indice) {
        if (indice >= 0 && indice < funcionarios.length) {
            return funcionarios[indice];
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }
}