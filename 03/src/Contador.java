/*
Implemente uma classe chamada Contador que seja capaz de contar
quantas vezes o seu método contar() foi executado em uma determinada instancia.
Em seguida, implemente um programa que utilize essa classe, execute seu método
algumas vezes e exiba a quantidade de vezes que ele foi executado. Utilize um
construtor para validar o valor inicial da contagem pois ele não deve ser negativo.
*/

class Contador {
    private int contador;

    public Contador(int valorInicial) {
        if (valorInicial >= 0) {
            this.contador = valorInicial;
        } else {
            this.contador = 0;
        }
    }

    public void contar() {
        this.contador++;
    }

    public int getContagem() {
        return this.contador;
    }
}