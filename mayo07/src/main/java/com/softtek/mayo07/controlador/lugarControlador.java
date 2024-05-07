package com.softtek.mayo07.controlador;

import com.softtek.mayo07.modelo.Lugar;
import com.softtek.mayo07.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/lugares")
public class lugarControlador {
    @Autowired
    private ILugarServicio servicio;

    @PostMapping
    public Lugar insertar(@RequestBody Lugar l){
        return servicio.crear(l);
    }

    @GetMapping
    public List<Lugar> obtenerTodos(){
        return servicio.consultarTodos();
    }

    @GetMapping("/{idLugar}")
    public Lugar obtenerUno(@PathVariable int idLugar){
        return servicio.consultarUno(idLugar);
    }

    @PutMapping
    public Lugar modificar(@RequestBody Lugar l){
        return servicio.modificar(l);
    }

    @DeleteMapping("/{idLugar}")
    public void eliminar(@PathVariable int idLugar){
        servicio.eliminar(idLugar);
    }
}
