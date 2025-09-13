package edu.universidad.procesamiento.gestionpedidos.Controller;

import edu.universidad.procesamiento.gestionpedidos.factory.ModelFactory;

public class SistemaDePedidosController {
    ModelFactory modelFactory;
    public SistemaDePedidosController(ModelFactory modelFactory) {
        modelFactory = ModelFactory.getInstance();

    }
}
