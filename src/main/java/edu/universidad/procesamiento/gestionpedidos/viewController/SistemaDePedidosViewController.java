package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class SistemaDePedidosViewController {




        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnBuscarProductoSistema;

        @FXML
        private Button btnEliminarProdoOrden;

        @FXML
        private TableView<?> tableProductoSistema;

        @FXML
        private TableView<?> tableSistemaOrden;

        @FXML
        private TableColumn<?, ?> tcItemsSistema;

        @FXML
        private TableColumn<?, ?> tcNombreProductoSistema;

        @FXML
        private TableColumn<?, ?> tcPrecioProductoSistema;

        @FXML
        private TableColumn<?, ?> tcSkuOrdenSistema;

        @FXML
        private TableColumn<?, ?> tcSkuProductoSistema;

        @FXML
        private TableColumn<?, ?> tcTotalSistema;

        @FXML
        private TextField txtBuscarProductoSistema;

        @FXML
        private TextArea txtOrdenProcesada;

        @FXML
        void onBuscarProductoSistema(ActionEvent event) {

        }

        @FXML
        void onEliminarProductoOrden(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnBuscarProductoSistema != null : "fx:id=\"btnBuscarProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert btnEliminarProdoOrden != null : "fx:id=\"btnEliminarProdoOrden\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tableProductoSistema != null : "fx:id=\"tableProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tableSistemaOrden != null : "fx:id=\"tableSistemaOrden\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcItemsSistema != null : "fx:id=\"tcItemsSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcNombreProductoSistema != null : "fx:id=\"tcNombreProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcPrecioProductoSistema != null : "fx:id=\"tcPrecioProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcSkuOrdenSistema != null : "fx:id=\"tcSkuOrdenSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcSkuProductoSistema != null : "fx:id=\"tcSkuProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert tcTotalSistema != null : "fx:id=\"tcTotalSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert txtBuscarProductoSistema != null : "fx:id=\"txtBuscarProductoSistema\" was not injected: check your FXML file 'sistemapedidos.fxml'.";
            assert txtOrdenProcesada != null : "fx:id=\"txtOrdenProcesada\" was not injected: check your FXML file 'sistemapedidos.fxml'.";

        }

    }


