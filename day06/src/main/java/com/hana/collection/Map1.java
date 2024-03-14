package com.hana.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        map.put("k3", "v3");
        map.put("k3", "v33");

        System.out.println(map.get("k2"));
        Set<String> keys = map.keySet();

        keys.forEach((k)->System.out.println(k));

        Collection<String> col = map.values();
        col.forEach((v)->System.out.println(v));

    }

}
