package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.util.List;

public interface Service<K,V> {
    V add(V v) throws DuplicatedIdException, Exception;
    V modify(V v) throws NotFoundIdException, Exception;
    Boolean remove(K k) throws NotFoundIdException, Exception;
    List<V> get() throws Exception;
    V get(K k) throws NotFoundIdException, Exception;
}
