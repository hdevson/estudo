package com.hdson.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    /**
     * TreeMap mantém a ordem natural dos elementos com base na ordem das chaves. Se as chaves forem strings, a ordem será alfabética.
     */
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("um", 1);
        treeMap.put("dois", 2);
        treeMap.put("tres", 3);

        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        System.out.println(treeMap.get("dois"));
        System.out.println(treeMap.containsKey("um"));
        System.out.println(treeMap.containsKey("rrrrr"));
        System.out.println(treeMap.getOrDefault("11",0));
        System.out.println(treeMap.getOrDefault("dois",0));
        treeMap.remove("um");
        System.out.println(treeMap.containsKey("um"));

    }
}
