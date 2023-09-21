/*Altere o exercício anterior para que a classe Funcionario possua diversos construtores
com parâmetros diferentes, sendo que deve haver reaproveitamento de código entre
eles. Em seguida, altere a classe principal para fazer uso desses construtores. 
*/

class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.salario = 0.0;
    }

    public Funcionario(String nome) {
        this.nome = nome;
        this.idade = 0;
        this.salario = 0.0;
    }
}
