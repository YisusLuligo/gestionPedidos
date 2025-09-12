module edu.universidad.procesamiento.gestionpedidos {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.universidad.procesamiento.gestionpedidos to javafx.fxml;
    exports edu.universidad.procesamiento.gestionpedidos;

    opens edu.universidad.procesamiento.gestionpedidos.Controller;
    exports edu.universidad.procesamiento.gestionpedidos.Controller;

    opens edu.universidad.procesamiento.gestionpedidos.viewController;
    exports edu.universidad.procesamiento.gestionpedidos.viewController;
}