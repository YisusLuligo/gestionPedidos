package edu.universidad.procesamiento.gestionpedidos.Controller;

import edu.universidad.procesamiento.gestionpedidos.factory.ModelFactory;
import edu.universidad.procesamiento.gestionpedidos.model.ItemOrden;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;

import java.util.Map;

public class OrdenController {
    ModelFactory modelFactory;
    public OrdenController() {
        modelFactory = ModelFactory.getInstance();

    }

    public Map<String, Producto> obtenerProductos() {
        return modelFactory.obtenerProductosDisponibles();
    }

    public void obtenerOrdenes() {
        
    }

    public Map<String,ItemOrden> obtenerOrdenesProductosCarrito() {
        return modelFactory.obtenerProductosCarrito();
    }

    public boolean agregarCarrito(Producto producto) {
        return modelFactory.agregarCarrito(producto);
    }
}
