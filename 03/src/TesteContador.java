/*
Implemente uma classe chamada Contador que seja capaz de contar
quantas vezes o seu método contar() foi executado em uma determinada instancia.
Em seguida, implemente um programa que utilize essa classe, execute seu método
algumas vezes e exiba a quantidade de vezes que ele foi executado. Utilize um
construtor para validar o valor inicial da contagem pois ele não deve ser negativo.
*/

class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador(8);

        contador.contar();
        contador.contar();
        contador.contar();

        System.out.println("Contagem: " + contador.getContagem());
    }
}