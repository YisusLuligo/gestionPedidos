package edu.universidad.procesamiento.gestionpedidos.model;

import edu.universidad.procesamiento.gestionpedidos.factory.ModelFactory;
import edu.universidad.procesamiento.gestionpedidos.model.build.SistemaDePedidoBuilder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;

public class SistemaDePedido {
    private Map <String, Producto> productos = new HashMap<String, Producto>();
    private Queue<Orden> ordenes = new LinkedList<Orden>();
    private Map<String,ItemOrden> carrito = new HashMap<>();



    public SistemaDePedido() {

    }

    public Map<String, Producto> getProductos() {
        return productos;
    }

    public Queue<Orden> getOrdenes() {
        return ordenes;
    }

    public Map<String, ItemOrden> getCarrito() {
        return carrito;
    }

    public static SistemaDePedidoBuilder builder(){
        return new SistemaDePedidoBuilder();
    }

    public boolean agregarProducto(Producto producto) {
        Producto productoEncontrado = validarExistencia(producto.getSku());
        if(productoEncontrado == null){
            productos.put(producto.getSku(), producto);
            return true;
        }
        return false;
    }

    private Producto validarExistencia(String sku) {
        for (Producto producto : productos.values()) {
            if (producto.getSku().equals(sku)) {
                return producto;
            }
        }
        return null;
    }

    public boolean eliminarProducto(String sku) {
        Producto productoEncontrado = validarExistencia(sku);
        if(productoEncontrado != null){
            productos.remove(productoEncontrado.getSku());
            return true;
        }
        return false;
    }

    /*public boolean agregarCarrito(Producto producto) {
        // Busca si ya existe un ItemOrden con el mismo nombre
        ItemOrden existente = carrito.values().stream()
                .filter(io -> io.getProducto().getNombre().equalsIgnoreCase(producto.getNombre()))
                .findFirst()
                .orElse(null);

        if (existente == null) {
            producto.marcarNoDisponible();
            carrito.put(producto.getSku(), new ItemOrden(producto, 1));
        } else {
            producto.marcarNoDisponible();
            existente.setCantidad(existente.getCantidad() + 1);
            return true;
        }
        return false;
    }*/

    public boolean agregarCarrito(Producto producto) {
        ItemOrden existente = carrito.get(producto.getSku()); // merge por SKU

        if (existente == null) {
            producto.marcarNoDisponible();
            carrito.put(producto.getSku(), new ItemOrden(producto, 1));
            return true;  // <- éxito también en la primera vez
        } else {
            existente.setCantidad(existente.getCantidad() + 1);
            return true;  // <- éxito
        }
    }

    public Map<String, Producto> obtenerProductosDisponibles() {
        return productos.entrySet()
                .stream()
                .filter(entry -> "Disponible".equalsIgnoreCase(entry.getValue().getEstado()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
