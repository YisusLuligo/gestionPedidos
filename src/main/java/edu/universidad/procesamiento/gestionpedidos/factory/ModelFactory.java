package edu.universidad.procesamiento.gestionpedidos.factory;

import edu.universidad.procesamiento.gestionpedidos.model.PrestamoObjeto;
import edu.universidad.procesamiento.gestionpedidos.model.Producto;
import edu.universidad.procesamiento.gestionpedidos.model.SistemaDePedido;
import edu.universidad.procesamiento.gestionpedidos.service.Iproducto;
import edu.universidad.procesamiento.gestionpedidos.utils.DataUtil;

import java.util.List;
import java.util.Map;

public class ModelFactory implements Iproducto {
    private static ModelFactory modelFactory;
    PrestamoObjeto prestamoObjeto;

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public ModelFactory(){
        prestamoObjeto = DataUtil.inicializarDatos();
    }

    @Override
    public Map<String,Producto> obtenerProductos() {
        return prestamoObjeto.getProductos();
    }
}
