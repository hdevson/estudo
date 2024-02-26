package com.hdson.collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // Nao ordena a lista. Apreseta na ordem que foi inserido
        // LinkedHashSet: Os elementos são armazenados na ordem em que foram inseridos. A saída será 3, 1, 2.
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);

        // Não será adicionado, pois "Banana" já está presente
        Set<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("Banana");
        linkedHashSet1.add("Maçã");
        linkedHashSet1.add("Pera");
        linkedHashSet1.add("Banana");
        System.out.println(linkedHashSet1);
    }
}
