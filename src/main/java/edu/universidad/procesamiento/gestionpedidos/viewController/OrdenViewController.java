package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

public class OrdenViewController {





        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnAgregarProductoOrden;

        @FXML
        private Button btnCompletarOrden;

        @FXML
        private Button btnEliminarProdoOrden;

        @FXML
        private TableView<?> tableOrdenProducto;

        @FXML
        private TableView<?> tableProductoDisponible;

        @FXML
        private TableColumn<?, ?> tcNombreProducto;

        @FXML
        private TableColumn<?, ?> tcNombreProductoOrden;

        @FXML
        private TableColumn<?, ?> tcPrecioProducto;

        @FXML
        private TableColumn<?, ?> tcSkuOrden;

        @FXML
        private TableColumn<?, ?> tcSkuProducto;

        @FXML
        private TableColumn<?, ?> tcTotalOrden;

        @FXML
        private TextArea txtConfirmacionOrden;

        @FXML
        private Text txtInformacionProducto;

        @FXML
        void onAgregarProductoOrden(ActionEvent event) {

        }

        @FXML
        void onCompletarOrden(ActionEvent event) {

        }

        @FXML
        void onEliminarProductoOrden(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnAgregarProductoOrden != null : "fx:id=\"btnAgregarProductoOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert btnCompletarOrden != null : "fx:id=\"btnCompletarOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert btnEliminarProdoOrden != null : "fx:id=\"btnEliminarProdoOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tableOrdenProducto != null : "fx:id=\"tableOrdenProducto\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tableProductoDisponible != null : "fx:id=\"tableProductoDisponible\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcNombreProducto != null : "fx:id=\"tcNombreProducto\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcNombreProductoOrden != null : "fx:id=\"tcNombreProductoOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcPrecioProducto != null : "fx:id=\"tcPrecioProducto\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcSkuOrden != null : "fx:id=\"tcSkuOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcSkuProducto != null : "fx:id=\"tcSkuProducto\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert tcTotalOrden != null : "fx:id=\"tcTotalOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert txtConfirmacionOrden != null : "fx:id=\"txtConfirmacionOrden\" was not injected: check your FXML file 'ordenes.fxml'.";
            assert txtInformacionProducto != null : "fx:id=\"txtInformacionProducto\" was not injected: check your FXML file 'ordenes.fxml'.";

        }

    }

