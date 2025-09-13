package edu.universidad.procesamiento.gestionpedidos.model.build;

import edu.universidad.procesamiento.gestionpedidos.model.Orden;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;

import java.util.HashMap;
import java.util.Map;

public class OrdenBuilder {
    protected String idOrden;
    protected Map<String, Producto> productos = new HashMap<>();

    public OrdenBuilder idOrden(String idOrden) {
        this.idOrden = idOrden;
        return this;
    }

    public OrdenBuilder productos(Map<String, Producto> productos) {
        this.productos = productos;
        return this;
    }

    public Orden build() {
        return new Orden(idOrden, productos);
    }
}
