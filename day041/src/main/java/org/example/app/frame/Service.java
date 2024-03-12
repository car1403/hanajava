package org.example.app.frame;

import java.util.List;

public interface Service<V,K> {
    int add(V v);
    int del(K k);
    int modify(V v);
    V get(K k);
    List<V> get();
}
