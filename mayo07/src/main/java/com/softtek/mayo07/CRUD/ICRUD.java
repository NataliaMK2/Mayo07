package com.softtek.mayo07.CRUD;

import java.util.List;

public interface ICRUD<T, ID> {

    List<T> consultarTodos();
    T consultarUno(ID id);
    T crear(T entidad);
    T modificar(T entidad);
    void eliminar(ID id);
}