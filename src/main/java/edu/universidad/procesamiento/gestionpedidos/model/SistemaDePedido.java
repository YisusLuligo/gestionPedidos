package edu.universidad.procesamiento.gestionpedidos.model;

import edu.universidad.procesamiento.gestionpedidos.model.build.SistemaDePedidoBuilder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SistemaDePedido {
    private Map <String, Producto> productos = new HashMap<String, Producto>();
    private Queue<Orden> ordenes = new LinkedList<Orden>();

    public SistemaDePedido(Map<String, Producto> productos, Queue<Orden> ordenes) {
        this.productos = productos;
        this.ordenes = ordenes;
    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public Queue<Orden> getOrdenes() {
        return ordenes;
    }

    public static SistemaDePedidoBuilder builder(){
        return new SistemaDePedidoBuilder();
    }
}
