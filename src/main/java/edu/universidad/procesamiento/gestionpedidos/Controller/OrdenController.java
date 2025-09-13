package edu.universidad.procesamiento.gestionpedidos.Controller;

import edu.universidad.procesamiento.gestionpedidos.factory.ModelFactory;

public class OrdenController {
    ModelFactory modelFactory;
    public OrdenController(ModelFactory modelFactory) {
        modelFactory = ModelFactory.getInstance();

    }
}
