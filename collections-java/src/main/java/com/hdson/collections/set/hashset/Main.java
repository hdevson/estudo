package com.hdson.collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Os elementos são armazenados em uma ordem que é determinada pela função de dispersão dos elementos, o que geralmente não é previsível. A saída pode variar em diferentes execuções.
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);


        // Não será adicionado, pois "Banana" já existe
        Set<String> hashSet2 = new HashSet<>();
        hashSet2.add("Banana");
        hashSet2.add("Pera");
        hashSet2.add("Maçã");
        hashSet2.add("Banana");
        System.out.println(hashSet2);
    }
}
