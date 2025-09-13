package edu.universidad.procesamiento.gestionpedidos.utils;

import edu.universidad.procesamiento.gestionpedidos.model.PrestamoObjeto;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;

public class DataUtil {
    public static PrestamoObjeto inicializarDatos() {
        PrestamoObjeto prestamoObjeto = new PrestamoObjeto();
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

// los agregas al mapa con su id como clave
        prestamoObjeto.agregarProducto(producto1);
        prestamoObjeto.agregarProducto(producto2);
        return prestamoObjeto;
    }
}
