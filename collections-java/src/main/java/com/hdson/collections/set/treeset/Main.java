package com.hdson.collections.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // Os elementos são armazenados em ordem natural (números inteiros são ordenados numericamente). A saída será 1, 2, 3.
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
        System.out.println(treeSet);

        Set<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Maçã");
        treeSet1.add("Banana");
        treeSet1.add("Pera");
        treeSet1.add("Banana"); // Não será adicionado, pois "Banana" já está presente
        System.out.println(treeSet1);
    }
}
