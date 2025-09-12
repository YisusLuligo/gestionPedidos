package edu.universidad.procesamiento.gestionpedidos.model;

import edu.universidad.procesamiento.gestionpedidos.model.build.OrdenBuilder;

import java.util.HashMap;
import java.util.Map;

public class Orden {
    private int idOrden;
    private Map <String,Producto> productos = new HashMap<>();

    public Orden(int idOrden, Map<String, Producto> productos) {
        this.idOrden = idOrden;
        this.productos = productos;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public static OrdenBuilder build (){
        return new OrdenBuilder();
    }


}
