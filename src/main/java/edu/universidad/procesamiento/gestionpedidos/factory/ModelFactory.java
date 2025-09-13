package edu.universidad.procesamiento.gestionpedidos.factory;

import edu.universidad.procesamiento.gestionpedidos.model.*;
import edu.universidad.procesamiento.gestionpedidos.service.IOrden;
import edu.universidad.procesamiento.gestionpedidos.service.Iproducto;
import edu.universidad.procesamiento.gestionpedidos.utils.DataUtil;

import java.util.Map;

public class ModelFactory implements Iproducto, IOrden {
    private static ModelFactory modelFactory;
    SistemaDePedido sistemaDePedido;
    Producto producto;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public ModelFactory(){
        sistemaDePedido = DataUtil.inicializarDatos();
    }

    @Override
    public Map<String,Producto> obtenerProductos() {
        return sistemaDePedido.getProductos();
    }

    @Override
    public boolean agregarProducto(Producto producto) {
        return sistemaDePedido.agregarProducto(producto);
    }

    @Override
    public boolean eliminarProducto(String sku) {
        return sistemaDePedido.eliminarProducto(sku);
    }

    @Override
    public Map<String, Producto> obtenerProductosDisponibles() {
        return sistemaDePedido.obtenerProductosDisponibles();
    }

    @Override
    public Map<String, ItemOrden> obtenerProductosCarrito() {
        return sistemaDePedido.getCarrito();
    }

    @Override
    public boolean agregarCarrito(Producto producto) {
        return sistemaDePedido.agregarCarrito(producto);
    }


}
