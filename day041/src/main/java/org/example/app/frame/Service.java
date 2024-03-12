package org.example.app.frame;

import java.util.List;

public interface Service<K, V> {
    int add(V v);
    int del(K k);
    int modify(V v);
    V get(K k);
    List<V> get();
}
