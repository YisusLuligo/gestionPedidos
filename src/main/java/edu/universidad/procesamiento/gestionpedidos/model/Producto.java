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

    public void marcarNoDisponible() {
        this.estado = "No disponible";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;               // mismo objeto en memoria
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return sku != null && sku.equals(producto.getSku());
    }
}
