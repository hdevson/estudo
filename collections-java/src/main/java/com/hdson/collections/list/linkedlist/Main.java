package com.hdson.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // Inserindo um elemento no meio da lista (vantagem do LinkedList)
        linkedList.add(1, "JavaScript");

        // Iterando sobre o LinkedList
        System.out.println("\nLinkedList:");
        for (String language : linkedList) {
            System.out.println(language);
        }

        // Adicionando um elemento no início da lista
        ((LinkedList<String>) linkedList).addFirst("Go");

        // Adicionando um elemento no final da lista
        ((LinkedList<String>) linkedList).addLast("Ruby");

        // Usando iterator para remover elementos
        System.out.println("LinkedList antes da remoção:");
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()){
            String language = iterator.next();
            if ("Python".equals(language)) {
                iterator.remove(); // Remove o elemento atual
            }
        }

        System.out.println("LinkedList dps da remoção:");
        System.out.println(linkedList);

    }
}
