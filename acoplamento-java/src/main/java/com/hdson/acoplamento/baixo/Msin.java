package com.hdson.acoplamento.baixo;

public class Msin {

    /**
     * Neste exemplo, as operações matemáticas são implementadas
     * como classes que implementam a interface Operacao. Isso permite
     * que a classe Calculadora seja modificada facilmente para
     * adicionar novas operações sem modificar seu código principal,
     * demonstrando um baixo acoplamento e uma melhor separação de
     * responsabilidades.
     */

    public static void main(String[] args) {

        final int operador1 = 10;
        final int operador2 = 5;

        Operador somar = new Somar();
        System.out.println("Somar: " + somar.executar(operador1, operador2));

        Operador subtracao = new Subtracao();
        System.out.println("Subtracao: " + subtracao.executar(operador1, operador2));

        Operador multiplicacao = new Multiplicacao();
        System.out.println("Multiplicacao: " + multiplicacao.executar(operador1, operador2));

        Operador divisao = new Divisao();
        System.out.println("Divisao: " + divisao.executar(operador1, operador2));
    }


}
