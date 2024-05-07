package com.softtek.mayo07.servicio;

import com.softtek.mayo07.servicio.ICRUD;
import com.softtek.mayo07.modelo.Producto;
import com.softtek.mayo07.repositorio.IGenericoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface IProductoServicio extends ICRUD<Producto, Integer> {

}