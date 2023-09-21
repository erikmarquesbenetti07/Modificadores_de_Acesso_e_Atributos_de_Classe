/*
Implemente um programa que utilize um array (vetor) para armazenar os funcionários
sde uma empresa. Utilize construtores para que o “tamanho” desse array não seja fixo.
Não esqueça que é recomendado que os atributos sejam privados e, portanto,
implemente os getters e setters necessários. 
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
