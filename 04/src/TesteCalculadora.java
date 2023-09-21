/*Implemente um classe chamada Calculadora que contenha dois
operadores inteiros e seja capaz de realizar operações aritméticas básicas (adição,
subtração, multiplicação e divisão). Em seguida, implemente um construtor para
informar os operandos e utilize essa classe para realizar as operações aritméticas básicas. 
*/

class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(10, 5);

        System.out.println("Adição: " + calculadora.adicao());
        System.out.println("Subtração: " + calculadora.subtracao());
        System.out.println("Multiplicação: " + calculadora.multiplicacao());
        
        try {
            System.out.println("Divisão: " + calculadora.divisao());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}