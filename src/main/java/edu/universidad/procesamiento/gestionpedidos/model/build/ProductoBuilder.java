package edu.universidad.procesamiento.gestionpedidos.model.build;

import edu.universidad.procesamiento.gestionpedidos.model.Producto;

public class ProductoBuilder {

    protected String sku;
    protected String nombre;
    protected double precio;
    protected String estado;


    public ProductoBuilder sku(String sku) {
        this.sku = sku;
        return this;
    }

    public ProductoBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ProductoBuilder precio(double precio) {
        this.precio = precio;
        return this;
    }

    public ProductoBuilder estado(String estado) {
        this.estado = estado;
        return this;
    }

    public Producto build() {
        return new Producto(sku, nombre, precio, estado);
    }


}
