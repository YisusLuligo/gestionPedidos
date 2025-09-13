package edu.universidad.procesamiento.gestionpedidos.service;

import edu.universidad.procesamiento.gestionpedidos.model.ItemOrden;
import edu.universidad.procesamiento.gestionpedidos.model.Orden;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;

import java.util.Map;
import java.util.Queue;

public interface IOrden {
    Map<String,Producto> obtenerProductosDisponibles();
    Map<String, ItemOrden> obtenerProductosCarrito();
    boolean agregarCarrito(Producto producto);

}
