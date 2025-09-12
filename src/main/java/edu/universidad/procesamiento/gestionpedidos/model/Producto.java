package edu.universidad.procesamiento.gestionpedidos.model;

import edu.universidad.procesamiento.gestionpedidos.model.build.ProductoBuilder;

public class Producto {

    private String sku;
    private String nombre;
    private double precio;
    private String estado;

    public Producto(String sku, String nombre, double precio, String estado) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public String getSku() {
        return sku;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }


    public static ProductoBuilder builder(){
        return new ProductoBuilder();
    }
}
