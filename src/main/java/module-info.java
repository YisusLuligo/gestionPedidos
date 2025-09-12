module edu.universidad.procesamiento.gestionpedidos {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.universidad.procesamiento.gestionpedidos to javafx.fxml;
    exports edu.universidad.procesamiento.gestionpedidos;
}