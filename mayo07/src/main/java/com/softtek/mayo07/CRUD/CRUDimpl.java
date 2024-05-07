package com.softtek.mayo07.CRUD;

import com.softtek.mayo07.repositorio.IGenericoRepositorio;

import com.softtek.mayo07.CRUD.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class CRUDimpl<T, ID> implements ICRUD<T, ID> {

    protected abstract IGenericoRepositorio<T, ID> getRepo();


    @Override
    public List<T> consultarTodos() {
        return getRepo().findAll();
    }

    @Override
    public T consultarUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public T crear(T entidad) {
        return getRepo().save(entidad);
    }

    @Override
    public T modificar(T entidad) {
        return getRepo().save(entidad);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }
}