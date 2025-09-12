package edu.universidad.procesamiento.gestionpedidos.viewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class ProductoViewController {





        @FXML
        private ResourceBundle resources;

        @FXML
        private URL location;

        @FXML
        private Button btnAgregarProducto;

        @FXML
        private Button btnEliminarProducto;

        @FXML
        private Button btnModificarProducto;

        @FXML
        private TableView<?> tableProducto;

        @FXML
        private TableColumn<?, ?> tcEstadoProducto;

        @FXML
        private TableColumn<?, ?> tcNombreProducto;

        @FXML
        private TableColumn<?, ?> tcPrecioProducto;

        @FXML
        private TableColumn<?, ?> tcSkuProducto;

        @FXML
        private TextField txtNombreProducto;

        @FXML
        private TextField txtPrecioProducto;

        @FXML
        private TextField txtSkuProducto;

        @FXML
        void onAgregarProducto(ActionEvent event) {

        }

        @FXML
        void onEliminarProducto(ActionEvent event) {

        }

        @FXML
        void onModificarProducto(ActionEvent event) {

        }

        @FXML
        void initialize() {
            assert btnAgregarProducto != null : "fx:id=\"btnAgregarProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert btnEliminarProducto != null : "fx:id=\"btnEliminarProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert btnModificarProducto != null : "fx:id=\"btnModificarProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert tableProducto != null : "fx:id=\"tableProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert tcEstadoProducto != null : "fx:id=\"tcEstadoProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert tcNombreProducto != null : "fx:id=\"tcNombreProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert tcPrecioProducto != null : "fx:id=\"tcPrecioProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert tcSkuProducto != null : "fx:id=\"tcSkuProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert txtNombreProducto != null : "fx:id=\"txtNombreProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert txtPrecioProducto != null : "fx:id=\"txtPrecioProducto\" was not injected: check your FXML file 'productos.fxml'.";
            assert txtSkuProducto != null : "fx:id=\"txtSkuProducto\" was not injected: check your FXML file 'productos.fxml'.";

        }

    }

