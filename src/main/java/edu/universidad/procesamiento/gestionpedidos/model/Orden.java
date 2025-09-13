package edu.universidad.procesamiento.gestionpedidos.model;

import edu.universidad.procesamiento.gestionpedidos.model.build.OrdenBuilder;

import java.util.HashMap;
import java.util.Map;

public class Orden {
    private String idOrden;
    private Map <String,Producto> productos = new HashMap<>();

    public Orden(String idOrden, Map<String, Producto> productos) {
        this.idOrden = idOrden;
        this.productos = productos;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public static OrdenBuilder build (){
        return new OrdenBuilder();
    }


}
