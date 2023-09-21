/*Implemente um programa capaz de simular uma fábrica de carros. Esse programa deve
conter o método produzirCarro que instancia e retorna um objeto do tipo Carro.
Esse mesmo programa deve conter um método contarCarros que exibe o total de
objetos do tipo Carro que foram produzidos por essa fábrica. */

class FabricaCarros {
    public static Carro produzirCarro(String marca, String modelo, int ano) {
        return new Carro(marca, modelo, ano);
    }

    public static void contarCarros() {
        System.out.println("Total de carros produzidos: " + Carro.getTotalCarrosProduzidos());
    }
}