package edu.universidad.procesamiento.gestionpedidos.model.build;

import edu.universidad.procesamiento.gestionpedidos.model.Orden;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;
import edu.universidad.procesamiento.gestionpedidos.model.SistemaDePedido;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class SistemaDePedidoBuilder {
    private Map<String, Producto> productos = new HashMap<String, Producto>();
    private Queue<Orden> ordenes = new LinkedList<Orden>();

    public SistemaDePedidoBuilder productos(Map<String, Producto> productos) {
        this.productos = productos;
        return this;
    }

    public SistemaDePedidoBuilder ordenes(Queue<Orden> ordenes) {
        this.ordenes = ordenes;
        return this;
    }

    public SistemaDePedido build() {
        return new SistemaDePedido(productos, ordenes);
    }
}
