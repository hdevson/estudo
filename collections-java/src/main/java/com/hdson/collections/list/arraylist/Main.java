package com.hdson.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        // Iterando sobre o ArrayList
        System.out.println("ArrayList:");
        for (String language : arrayList) {
            System.out.println(language);
        }

        // Acessando um elemento em uma posição específica (vantagem do ArrayList)
        System.out.println("Elemento na posição 1 do ArrayList: " + arrayList.get(1));

        // Usando iterator para remover elementos
        System.out.println("ArrayList antes da remoção:");
        System.out.println(arrayList);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String language = iterator.next();
            if (language.equals("Python")) {
                iterator.remove(); // Remove o elemento atual
            }
        }

        System.out.println("ArrayList depois da remoção:");
        System.out.println(arrayList);

    }
}
