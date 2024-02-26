package com.hdson.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    /**
     * HashMap não mantém a ordem dos elementos. Ele é mais eficiente em termos de tempo de execução para operações básicas, como inserção, remoção e acesso.
     */
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        hashmap.put("um", 1);
        hashmap.put("dois", 2);
        hashmap.put("tres", 3);

        for(Map.Entry<String, Integer> entry : hashmap.entrySet()){
            System.out.printf("Chave: %s | Valor: %s %n", entry.getKey(), entry.getValue());
        }

        System.out.println(hashmap.get("dois"));
        System.out.println(hashmap.containsKey("um"));
        System.out.println(hashmap.containsKey("rrrrr"));
        System.out.println(hashmap.getOrDefault("11",0));
        System.out.println(hashmap.getOrDefault("dois",0));
        hashmap.remove("um");
        System.out.println(hashmap.containsKey("um"));

    }
}
