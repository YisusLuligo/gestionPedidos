package edu.universidad.procesamiento.gestionpedidos.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PrestamoObjeto {
    private Map<String, Producto> productos = new HashMap<String, Producto>();
    private Queue<Orden> ordenes = new LinkedList<Orden>();

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public Queue<Orden> getOrdenes() {
        return ordenes;
    }

    public void agregarProducto(Producto producto1) {
        productos.put(producto1.getSku(), producto1);
    }
}
