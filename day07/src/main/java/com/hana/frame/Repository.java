package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;

import java.sql.SQLException;
import java.util.List;

public interface Repository<K,V> {
    V insert(V v) throws DuplicatedIdException, Exception;
    V update(V v) throws NotFoundIdException, Exception;
    Boolean delete(K k) throws NotFoundIdException, Exception;
    List<V> select() throws Exception;
    V select(K k) throws NotFoundIdException, Exception;

}
