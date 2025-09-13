package edu.universidad.procesamiento.gestionpedidos.Controller;

import edu.universidad.procesamiento.gestionpedidos.factory.ModelFactory;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;

import java.util.Map;

public class ProductoController {
    ModelFactory modelFactory;
    public ProductoController() {
        modelFactory = ModelFactory.getInstance();

    }


    public Map<String,Producto> obtenerProductos() {
    return modelFactory.obtenerProductos();
    }

    public boolean agregarProducto(Producto producto) {
        return modelFactory.agregarProducto(producto);
    }

    public boolean eliminarProducto(String text) {
        return modelFactory.eliminarProducto(text);
    }
}
