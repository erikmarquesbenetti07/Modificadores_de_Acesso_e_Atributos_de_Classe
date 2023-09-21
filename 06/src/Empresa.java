/*Altere o exercício anterior para que a classe Funcionario possua diversos construtores
com parâmetros diferentes, sendo que deve haver reaproveitamento de código entre
eles. Em seguida, altere a classe principal para fazer uso desses construtores. 
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