/*Implemente um programa capaz de simular uma fábrica de carros. Esse programa deve
conter o método produzirCarro que instancia e retorna um objeto do tipo Carro.
Esse mesmo programa deve conter um método contarCarros que exibe o total de
objetos do tipo Carro que foram produzidos por essa fábrica. */

class TesteFabricaCarros {
    public static void main(String[] args) {
        Carro carro1 = FabricaCarros.produzirCarro("Ford", "Mustang", 2021);
        Carro carro2 = FabricaCarros.produzirCarro("Chevrolet", "Camaro", 2022);

        FabricaCarros.contarCarros();
    }
}
