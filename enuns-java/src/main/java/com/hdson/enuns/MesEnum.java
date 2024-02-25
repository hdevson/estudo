package com.hdson.enuns;

import java.time.LocalDate;

public enum MesEnum {
    JANEIRO("Janeiro", 1, 31),
    FEVEREIRO("Fevereiro", 2, 29) {
        @Override
        public int getDias() {
            return getDiasDoMes(FEVEREIRO, LocalDate.now().getYear());
        }
    },
    MARCO("Março", 3, 31),
    ABRIL("Abril", 4, 30),
    MAIO("Maio", 5, 31),
    JUNHO("Junho", 6, 30),
    JULHO("Julho", 7, 31),
    AGOSTO("Agosto", 8, 31),
    SETEMBRO("Setembro", 9, 30),
    OUTUBRO("Outubro", 10, 31),
    NOVEMBRO("Novembro", 11, 30),
    DEZEMBRO("Dezembro", 12, 31);

    private final String nome;
    private final int numero;
    private final int dias;

    MesEnum(String nome, int numero, int dias){
        this.nome = nome;
        this.numero = numero;
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    /**
     * Um ano é bissexto se for divisível por 4.
     * No entanto, se o ano for divisível por 100, ele não é bissexto, a menos que:
     * O ano também seja divisível por 400. Nesse caso, o ano é bissexto.
     */
    public static int getDiasDoMes(MesEnum mes, int ano) {
        if (mes == FEVEREIRO && isAnoBissexto(ano))
            return 29;
        return mes.getDias();
    }

    private static boolean isAnoBissexto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }
}
