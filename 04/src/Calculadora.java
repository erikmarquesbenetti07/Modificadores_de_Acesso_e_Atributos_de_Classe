/*Implemente um classe chamada Calculadora que contenha dois
operadores inteiros e seja capaz de realizar operações aritméticas básicas (adição,
subtração, multiplicação e divisão). Em seguida, implemente um construtor para
informar os operandos e utilize essa classe para realizar as operações aritméticas básicas. 
*/

class Calculadora {
    private int operando1;
    private int operando2;

    public Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int adicao() {
        return operando1 + operando2;
    }

    public int subtracao() {
        return operando1 - operando2;
    }

    public int multiplicacao() {
        return operando1 * operando2;
    }

    public double divisao() {
        if (operando2 != 0) {
            return (double) operando1 / operando2;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
    }
}