package edu.universidad.procesamiento.gestionpedidos.service;

import edu.universidad.procesamiento.gestionpedidos.model.Producto;

import java.util.List;
import java.util.Map;

public interface Iproducto {
    Map<String,Producto> obtenerProductos();
    boolean agregarProducto(Producto producto);
    boolean eliminarProducto(String sku);
}
