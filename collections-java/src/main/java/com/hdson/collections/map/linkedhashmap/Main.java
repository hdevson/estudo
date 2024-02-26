package com.hdson.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    /*LinkedHashMap mantém a ordem de inserção dos elementos. */
    public static void main(String[] args) {

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("um", 1);
        linkedHashMap.put("dois", 2);
        linkedHashMap.put("tres", 3);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println(linkedHashMap.get("dois"));
        System.out.println(linkedHashMap.containsKey("um"));
        System.out.println(linkedHashMap.containsKey("rrrrr"));
        System.out.println(linkedHashMap.getOrDefault("11",0));
        System.out.println(linkedHashMap.getOrDefault("dois",0));
        linkedHashMap.remove("um");
        System.out.println(linkedHashMap.containsKey("um"));

    }
}
