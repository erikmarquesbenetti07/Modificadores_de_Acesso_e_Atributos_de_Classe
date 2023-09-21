/*Implemente um programa capaz de simular uma fábrica de carros. Esse programa deve
conter o método produzirCarro que instancia e retorna um objeto do tipo Carro.
Esse mesmo programa deve conter um método contarCarros que exibe o total de
objetos do tipo Carro que foram produzidos por essa fábrica. */

class Carro {
    private static int totalCarrosProduzidos = 0;
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        totalCarrosProduzidos++;
    }

    public static int getTotalCarrosProduzidos() {
        return totalCarrosProduzidos;
    }
}