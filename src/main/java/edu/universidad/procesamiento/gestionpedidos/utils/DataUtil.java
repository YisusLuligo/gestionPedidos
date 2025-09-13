package edu.universidad.procesamiento.gestionpedidos.utils;

import edu.universidad.procesamiento.gestionpedidos.model.Orden;

import edu.universidad.procesamiento.gestionpedidos.model.Producto;
import edu.universidad.procesamiento.gestionpedidos.model.SistemaDePedido;
import edu.universidad.procesamiento.gestionpedidos.model.build.OrdenBuilder;

import java.util.HashMap;
import java.util.Map;

public class DataUtil {
    public static SistemaDePedido inicializarDatos() {
        SistemaDePedido sistemaDePedido = new SistemaDePedido();
        Producto producto1 = Producto.builder()
                .sku("3030")
                .nombre("Mango")
                .precio(32.32)
                .estado("No disponible")
                .build();

        Producto producto2 = Producto.builder()
                .sku("301")
                .nombre("Pc Gamer")
                .precio(3000.20)
                .estado("Disponible")
                .build();

        Producto producto6 = Producto.builder()
                .sku("3020")
                .nombre("Gamer")
                .precio(3000.20)
                .estado("Disponible")
                .build();

        Producto producto5 = Producto.builder()
                .sku("3010")
                .nombre("Gamer")
                .precio(3000.20)
                .estado("Disponible")
                .build();

        sistemaDePedido.agregarCarrito(producto5);
        sistemaDePedido.agregarCarrito(producto6);






        Producto producto3 = Producto.builder()
                .sku("4012")
                .nombre("Teclado Mecánico RGB")
                .precio(150.75)
                .estado("Disponible")
                .build();

        Producto producto4 = Producto.builder()
                .sku("401")
                .nombre("Pantalla 12")
                .precio(150.75)
                .estado("Disponible")
                .build();




        Map<String, Producto> productosOrden1 = new HashMap<>();
        productosOrden1.put(producto1.getSku(), producto3);
        productosOrden1.put(producto2.getSku(), producto4);

        Orden orden1 = new OrdenBuilder()
                .idOrden("ORD-002")
                .productos(productosOrden1)
                .build();

        // Guardar órdenes en la cola FIFO
        sistemaDePedido.getOrdenes().add(orden1);
      //  sistemaDePedido.registrarOrden(orden1);


// los agregas al mapa con su id como clave
        sistemaDePedido.agregarProducto(producto1);
        sistemaDePedido.agregarProducto(producto2);
        sistemaDePedido.agregarProducto(producto3);
        sistemaDePedido.agregarProducto(producto4);
        sistemaDePedido.agregarProducto(producto5);
        sistemaDePedido.agregarProducto(producto6);
        return sistemaDePedido;
    }
}
